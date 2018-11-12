/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.KhachHang;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOKhachHang;
import model.DBConnection;

/**
 *
 * @author Quang Hiep
 */
public class AddCustomerServelet extends HttpServlet {

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
        DAOKhachHang daoKH = new DAOKhachHang(dbConn);
        HttpSession session = request.getSession();
        
        String name = request.getParameter("sname");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        //check
        boolean isEmpty = true;
        boolean isDuplicate = daoKH.isDuplicateUser(user);
        boolean isNumberPhone = false;

        if (name.equals("") || address.equals("") || phone.equals("") || user.equals("") || pass.equals("")) {
            request.setAttribute("errorRegister", "Tất cả các trường là bắt buộc");
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        } else {
            isEmpty = false;
        }
        if(isDuplicate){
            request.setAttribute("errorRegister", "Tên đăng nhập đã tồn tại");
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        }
        if (!phone.matches("\\d+")) {
            request.setAttribute("errorRegister", "Định đạng số điện thoại chưa chính xác");
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        } else {
            isNumberPhone = true;
        }
        if (!isDuplicate && !isDuplicate && isNumberPhone) {
            KhachHang kh = new KhachHang(name, address, phone, user, pass);
            int n = daoKH.addKhachHang(kh);
            if (n > 0) {
                session.setAttribute("fullName", name);
                request.setAttribute("successRegister", "Register success !!!");
                request.getRequestDispatcher("Register.jsp").forward(request, response);
            }
        }
        //check duplicate userName
        //database

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
