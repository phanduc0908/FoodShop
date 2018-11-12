/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import java.io.IOException;
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
 * @author Quang Hiep
 */
public class AddToCart extends HttpServlet {

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
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            
            DBConnection dbconn = new DBConnection();
            DAOSanPham dao = new DAOSanPham(dbconn);
            HttpSession session = request.getSession();
            
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
                                break;
                            }
                        }
                    } else {
                        listCart.add(cart);
                    }
                }

                RequestDispatcher dispatch = request.getRequestDispatcher("HomePage.jsp");
                dispatch.forward(request, response);            
        } catch (Exception ex) {
            Logger.getLogger(AddToCart.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
