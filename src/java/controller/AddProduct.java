/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DBConnection;

/**
 *
 * @author Phan Van Duc
 */
public class AddProduct extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        DBConnection dbConn = new DBConnection();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "    <head>\n"
                + "        <title>Add Product</title>\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                + "\n"
                + "        <link rel=\"icon\" type=\"image/png\" href=\"assets/images/icons/icon-page.png\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/vendor/animate/animate.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/vendor/css-hamburgers/hamburgers.min.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/vendor/select2/select2.min.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/util.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/main.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/addProduct.css\">\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <div class=\"bg-contact2\" style=\"background-image: url('assets/images/bg-food.jpg');\">\n"
                + "            <div class=\"container-contact2\">\n"
                + "                <div class=\"wrap-contact2\">\n"
                + "                    <form class=\"contact2-form validate-form\" action=\"ProductController\" method=\"POST\">\n"
                + "                        <span class=\"contact2-form-title\">Add Product</span>\n"
                + "\n"
                + "                        <div class=\"wrap-input2 validate-input\" data-validate=\"Id is required\">\n"
                + "                            <input class=\"input2\" type=\"text\" name=\"sid\" required>\n"
                + "                            <span class=\"focus-input2\" data-placeholder=\"ID\"></span>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <div class=\"wrap-input2 validate-input\" data-validate = \"Name is required\">\n"
                + "                            <input class=\"input2\" type=\"text\" name=\"sname\" required>\n"
                + "                            <span class=\"focus-input2\" data-placeholder=\"NAME\"></span>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <div class=\"wrap-input2 validate-input\" data-validate = \"Quantity is required\">\n"
                + "                            <input class=\"input2\" type=\"text\" name=\"quanity\" required>\n"
                + "                            <span class=\"focus-input2\" data-placeholder=\"QUANTITY\"></span>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <div class=\"wrap-input2 validate-input\" data-validate = \"Price is required\">\n"
                + "                            <input class=\"input2\" type=\"text\" name=\"price\" required>\n"
                + "                            <span class=\"focus-input2\" data-placeholder=\"PRICE\"></span>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <div class=\"form-group\">\n"
                + "                            <div class=\"input-group input-file\" name=\"Fichier1\">\n"
                + "                                <input type=\"text\" class=\"form-control\" name =\"picture\" placeholder='Choose a picture...' />\n"
                + "                                <span class=\"input-group-btn\">\n"
                + "                                    <button class=\"btn btn-default btn-choose\" type=\"button\">Choose</button>\n"
                + "                                </span>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <div class=\"wrap-input2 validate-input\" data-validate = \"Description is required\">\n"
                + "                            <input class=\"input2\" type=\"text\" name=\"description\" required>\n"
                + "                            <span class=\"focus-input2\" data-placeholder=\"DESCRIPTION\"></span>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <div class=\"form-group\" >\n"
                + "                            <h2>Manufacturer</h2>\n"
                + "                            <select class=\"form-control\" name=\"HangSX\">");
            String sql = "select * from HangSanXuat where status=1";
            ResultSet rs = dbConn.getData(sql);
            try {
                while (rs.next()) {
                    out.println("<option value=\"" + rs.getInt(1) + "\">" + rs.getString(2) + "</option>");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println("                           </select>\n"
                + "                        </div>\n"
                + "                        <div class=\"container-contact2-form-btn\">\n"
                + "                            <div class=\"wrap-contact2-form-btn\">\n"
                + "                                <div class=\"contact2-form-bgbtn\"></div>\n"
                + "                                <button class=\"contact2-form-btn\" type=\"submit\">Add</button>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </form>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "\n"
                + "        <script src=\"assets/vendor/jquery/jquery-3.2.1.min.js\"></script>\n"
                + "        <script src=\"assets/vendor/select2/select2.min.js\"></script>\n"
                + "        <script src=\"assets/js/main.js\"></script>\n"
                + "        <script src=\"assets/js/addProduct.js\"></script>\n"
                + "\n"
                + "    </body>\n"
                + "</html>");
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
