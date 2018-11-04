/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.DAOSanPham;
import model.DBConnection;

/**
 *
 * @author Phan Van Duc
 */
public class ProductControllerJSP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        
        DBConnection dbconn = new DBConnection();
        DAOSanPham dao = new DAOSanPham(dbconn);
        HttpSession session = request.getSession();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String service = request.getParameter("service");
            if (service == null) {
                service = "displayAll";
            }
            if (service.equalsIgnoreCase("displayAll")) {
                String sql = "Select sid,sname,quantity,price,picture,description from SanPham";
                ResultSet rs = dbconn.getData(sql);

                // set parameter to view
                request.setAttribute("rs", rs);
                request.setAttribute("title", "List all products");

                // dispatch to View
                RequestDispatcher dispatch = request.getRequestDispatcher("HomeContent.jsp");
                dispatch.forward(request, response);
            }
            if (service.equalsIgnoreCase("addToCart")) {

                String id = request.getParameter("id"); // id - key
                // check session is exist in
                String sql = "Select sid,sname,price,quantity from SanPham where sid = '" + id + "'";
                ResultSet rs = dbconn.getData(sql);

                Cart cart = new Cart();
                int currentQuantity = 0;
                if (rs.next()) {
                    cart.setId(rs.getString(1));
                    cart.setName(rs.getString(2));
                    cart.setPrice(Double.parseDouble(rs.getString(3)));
                    cart.setQuantity(1);
                    currentQuantity = rs.getInt(4);
                }
                if (session.getAttribute("cartID") == null) {
                    ArrayList<Cart> listCart = new ArrayList<Cart>();
                    listCart.add(cart);
                    session.setAttribute("cartID", listCart);

                    int curr = dao.getCurrentQuantity(id);
                    dao.UpdateQuantity(curr - 1, id);
                } else {
                    boolean isExist = false;
                    ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("cartID");
                    for (int i = 0; i < listCart.size(); i++) {
                        if (listCart.get(i).getId().equals(id)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (isExist == true) {
                        for (int i = 0; i < listCart.size(); i++) {
                            if (listCart.get(i).getId().equals(id)) {
                                int updateQuantity = listCart.get(i).getQuantity();
                                // Reset quantity of Cart List
                                listCart.get(i).setQuantity(updateQuantity + 1);

                                // Update quantity in Database
                                dao.UpdateQuantity(currentQuantity - 1, id);
                                break;
                            }
                        }
                    } else {
                        listCart.add(cart);
                        dao.UpdateQuantity(currentQuantity - 1, id);
                    }
                }

                RequestDispatcher dispatch = request.getRequestDispatcher("/AddToCart.jsp");

                dispatch.forward(request, response);
                //response.sendRedirect("showCart.jsp");
            }
            if (service.equalsIgnoreCase("showCart")) {
                ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("cartID");
                request.setAttribute("listCart", listCart);
                RequestDispatcher dispatch = request.getRequestDispatcher("/Cart.jsp");
                dispatch.forward(request, response);
            }
            if (service.equalsIgnoreCase("remove")) {

                String id = request.getParameter("id");
                ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("cartID");
                for (int i = 0; i < listCart.size(); i++) {
                    if (listCart.get(i).getId().equals(id)) {
                        // Update quantity of Database
                        int current = dao.getCurrentQuantity(id);
                        dao.UpdateQuantity(current + listCart.get(i).getQuantity(), id);
                        // Remove item form cart
                        listCart.remove(i);
                        break;
                    }
                }
                RequestDispatcher dispatch = request.getRequestDispatcher("/remove.jsp");
                dispatch.forward(request, response);
            }
            if (service.equalsIgnoreCase("checkout")) {
                ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("cartID");
                // Update database before delete session
                for (Cart c : listCart) {
                    int currentQuan = dao.getCurrentQuantity(c.getId());
                    dao.UpdateQuantity(currentQuan + c.getQuantity(), c.getId());
                }
                session.invalidate();
                
                RequestDispatcher dispatch = request.getRequestDispatcher("/checkOut.jsp");
                dispatch.forward(request, response);
            }
        }
    }

    private void dispatch(HttpServletRequest request, HttpServletResponse response,
            String page) {
        try {
            RequestDispatcher dispath = request.getRequestDispatcher(page);
            dispath.forward(request, response);
        } catch (IOException | ServletException e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ProductControllerJSP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ProductControllerJSP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
