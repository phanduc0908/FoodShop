/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class CheckoutCart extends HttpServlet {

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
            
            HttpSession session = request.getSession();
            DBConnection dbCon = new DBConnection();
            DAOSanPham daoSP = new DAOSanPham(dbCon);
            
            ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("cartID");

            // Check website is logined, else redirect to Login page
            if(session.getAttribute("username") == null){
                response.sendRedirect("Login.jsp");
            }else{
                int leng = listCart.size();
                for (int i = 0; i < leng; i++) {
                    // get sid of SanPham
                    String sid = listCart.get(i).getId();
                    // get current quantity of products in DB
                    int current = daoSP.getCurrentQuantity(sid);
                    // get quantity products in Cart
                    int quanityCart = listCart.get(i).getQuantity();
                    // Quantity change
                    int quantityChange = current - quanityCart;
                    // Update changing quantity to DB
                    daoSP.UpdateQuantity(quantityChange, sid);
                    
                    // Update to Bill table
                    
                }
                session.setAttribute("cartID", null);
                response.sendRedirect("HomePage.jsp");
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(CheckoutCart.class.getName()).log(Level.SEVERE, null, ex);
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
