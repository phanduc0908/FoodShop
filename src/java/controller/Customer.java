/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.KhachHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOKhachHang;
import model.DBConnection;

/**
 *
 * @author Phan Van Duc
 */
@WebServlet(name = "Customer", urlPatterns = {"/Customer"})
public class Customer extends HttpServlet {

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
        DBConnection db = new DBConnection();
        DAOKhachHang dao = new DAOKhachHang(db);
        try (PrintWriter out = response.getWriter()) {

            String service = request.getParameter("service");
            if (service == null) {
                service = "listAll";
            }
            if (service.equals("register")) {
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                String user = request.getParameter("username");
                String pass = request.getParameter("password");
                //check
                if (user == null || user.equals("") || user.length() < 6) {
                    out.println("<h1 style=\"color:red\">UserName error</h1>");
                }
                // Check duplicate user

                KhachHang kh = new KhachHang(name, address, phone, user, pass);
                if (dao.isDuplicateUser(kh.getUsername())) {
                    out.println("Duplicate user");
                } else {
                    int n = dao.addKhachHang(kh);
                    if (n > 0) {
                        out.println("Inserted");
                    }
                }
            }
            if (service.equals("listAll")) {
                String sql = "select * from khachhang";
                ResultSet rs = db.getData(sql);
                out.println("<html lang=\"en\">\n"
                        + "<head>\n"
                        + "	<title>Table V02</title>\n"
                        + "	<meta charset=\"UTF-8\">\n"
                        + "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                        + "	<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/vendor/bootstrap/css/bootstrap.min.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/vendor/animate/animate.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/vendor/select2/select2.min.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/vendor/perfect-scrollbar/perfect-scrollbar.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/css/util.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/css/main.css\">\n"
                        + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/css/listCus.css\">\n"
                        + "</head>\n"
                        + "<body>\n"
                        + "	\n"
                        + "	<div class=\"limiter\">\n"
                        + "            <div class=\"container-table100\">\n"
                        + "                <div class=\"wrap-table100\">\n"
                        + "                 <h1>List all Customer</h1>\n"
                        + "                    <div class=\"table\">\n"
                        + "                        <div class=\"row header\">\n"
                        + "                            <div class=\"cell\">ID</div>\n"
                        + "                            <div class=\"cell\">Full Name</div>\n"
                        + "                            <div class=\"cell\">Address</div>\n"
                        + "                            <div class=\"cell\">Phone</div>\n"
                        + "                            <div class=\"cell\">UserName</div>\n"
                        + "                            <div class=\"cell\">Password</div>\n"
                        + "                            <div class=\"cell\">Status</div>\n"
                        + "                            <div class=\"cell\">Update</div>\n"
                        + "                            <div class=\"cell\">Delete</div>\n"
                        + "                        </div>");
                try {
                    while (rs.next()) {
                        out.println("<div class=\"row\">");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(1) + "</div>");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(2) + "</div>");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(3) + "</div>");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(4) + "</div>");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(5) + "</div>");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(6) + "</div>");
                        out.println("<div class=\"cell\" data-title=\"ID\">" + (rs.getInt(7) == 1 ? "<a href=\"Customer?username=" + rs.getString(5) + "&id=" + rs.getInt(1) + "\" onclick=\"return confirm('Are you sure?')\">Active</a>"
                                : "<a href=\"Customer?username=" + rs.getString(5) + "&id=" + rs.getInt(1) + "\" onclick=\"return confirm('Are you sure?')\">DeActive</a>") + "</div>");

                        out.println("<div class=\"cell\" data-title=\"ID\"><a href=\"Customer?service=preUpdate&id=" + rs.getInt(1) + "\">update</a></div>");
                        out.println("<div class=\"cell\" data-title=\"ID\"><a href=\"Customer?service=delete&id=" + rs.getInt(1) + "\">Delete</a></div>");
                        out.println("</div>");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }

                out.println("                    </div>\n"
                        + "                </div>\n"
                        + "            </div>\n"
                        + "	</div>\n"
                        + "\n"
                        + "\n"
                        + "	\n"
                        + "\n"
                        + "	<script src=\"listCSS/vendor/jquery/jquery-3.2.1.min.js\"></script>\n"
                        + "	<script src=\"listCSS/vendor/bootstrap/js/popper.js\"></script>\n"
                        + "	<script src=\"listCSS/vendor/bootstrap/js/bootstrap.min.js\"></script>\n"
                        + "	<script src=\"listCSS/vendor/select2/select2.min.js\"></script>\n"
                        + "	<script src=\"listCSS/js/main.js\"></script>\n"
                        + "\n"
                        + "</body>\n"
                        + "</html>");
            }
            // Delete
            if(service.equals("delete")){
                int id = Integer.parseInt(request.getParameter("id"));
                int n = dao.removeKhachHang(id);
                request.getRequestDispatcher("ListAllCustomer").forward(request, response);

            }
            
            // PreUpdate
            if (service.equals("preUpdate")) {
                //get id
                int id = Integer.parseInt(request.getParameter("id"));
                //sql
                String sql = "select * from KhachHang where cid=" + id;
                ResultSet rs = db.getData(sql);
                try {
                    if (rs.next()) {
                        out.println("<!DOCTYPE html>\n"
                                + "<html lang=\"en\">\n"
                                + "    <head>\n"
                                + "        <title>Add Product</title>\n"
                                + "        <meta charset=\"UTF-8\">\n"
                                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                                + "\n"
                                + "        <link rel=\"icon\" type=\"image/png\" href=\"assets/images/icons/favicon.ico\"/>\n"
                                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/vendor/bootstrap/css/bootstrap.min.css\">\n"
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
                                + "                    <form class=\"contact2-form validate-form\" action=\"Customer\" method=\"POST\">\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"sid\">ID:</label>\n"
                                + "                            <input type=\"text\" class=\"form-control\" value=\""+rs.getInt(1)+"\" name=\"sid\" readonly>\n"
                                + "                        </div>\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"sname\">Full name:</label>\n"
                                + "                            <input type=\"text\" class=\"form-control\" name=\"sname\" value=\""+rs.getString(2)+"\">\n"
                                + "                        </div>\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"address\">Address:</label>\n"
                                + "                            <input type=\"text\" class=\"form-control\" name=\"address\" value=\""+rs.getString(3)+"\">\n"
                                + "                        </div>\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"phone\">Phone:</label>\n"
                                + "                            <input type=\"text\" class=\"form-control\" name=\"phone\" value=\""+rs.getInt(4)+"\">\n"
                                + "                        </div>\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"username\">Username:</label>\n"
                                + "                            <input type=\"text\" class=\"form-control\" name=\"username\" value=\""+rs.getString(5)+"\" readonly>\n"
                                + "                        </div>\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"password\">Password:</label>\n"
                                + "                            <input type=\"text\" class=\"form-control\" name=\"password\" value=\""+rs.getString(6)+"\">\n"
                                + "                        </div>\n"
                                + "                        <div class=\"form-group\">\n"
                                + "                            <label for=\"status\">Status:</label>\n"
                                + "                            <input type=\"radio\" name=\"status\" id=\"status\" value=\"1\""+(rs.getInt(7)==1?"checked":"")+" >Active\n"
                                + "                            <input type=\"radio\" name=\"status\" id=\"status\" value=\"0\""+(rs.getInt(7)==0?"checked":"")+" >De-Active\n"
                                + "                        </div>\n"
                                + "\n"
                                + "                        <div class=\"container-contact2-form-btn\">\n"
                                + "                            <div class=\"wrap-contact2-form-btn\">\n"
                                + "                                <div class=\"contact2-form-bgbtn\"></div>\n"
                                + "                                <button class=\"contact2-form-btn\" onclick=\"this.submit()\">Add</button>\n"
                                + "                                <input type=\"hidden\" name=\"service\" value=\"update\">\n"
                                + "                            </div>\n"
                                + "                        </div>\n"
                                + "                    </form>\n"
                                + "                </div>\n"
                                + "            </div>\n"
                                + "        </div>\n"
                                + "\n"
                                + "        <script src=\"assets/vendor/jquery/jquery-3.2.1.min.js\"></script>\n"
                                + "        <script src=\"assets/vendor/bootstrap/js/popper.js\"></script>\n"
                                + "        <script src=\"assets/vendor/bootstrap/js/bootstrap.min.js\"></script>\n"
                                + "        <script src=\"assets/vendor/select2/select2.min.js\"></script>\n"
                                + "        <script src=\"assets/js/main.js\"></script>\n"
                                + "        <script src=\"assets/js/addProduct.js\"></script>\n"
                                + "\n"
                                + "    </body>\n"
                                + "</html>\n"
                                + "");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(service.equals("update")){
                int id=Integer.parseInt(request.getParameter("sid"));
                String name = request.getParameter("sname");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                String user = request.getParameter("username");
                String pass = request.getParameter("password");
                int status=Integer.parseInt(request.getParameter("status"));
                KhachHang kh=new KhachHang(id, name, address, phone, user, pass, status);
                int n=dao.updateInforKhachHang(kh);
                request.getRequestDispatcher("ListAllCustomer").forward(request, response);
            }
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
