<%-- 
    Document   : CartBody
    Created on : Oct 31, 2018, 12:35:25 PM
    Author     : Phan Van Duc
--%>

<%@page import="model.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Cart> list = null;
    if(session.getAttribute("cartID") != null){
        list = (ArrayList)request.getAttribute("listCart");
    }else{
        list = new ArrayList<Cart>();
    }
    
%>
<div class="container">
    <div class="paging">
        <ul class="breadcrumb">
            <li><a href="HomePage.jsp">Home</a></li>
            <li>Giỏ hàng</li>
        </ul>
    </div>
    <div class="cart-info">
        <h3>Thông tin giỏ hàng</h3>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Tên sản phẩm</th>
                    <th>Đơn giá</th>
                    <th>Số lượng</th>
                    <th>Thành tiền</th>
                    <th>Xóa</th>
                </tr>
            </thead>
            <form action="Update" method="POST">
                <tbody>
                    <%                    
                        double totalPrice = 0;
                        double total = 0;
                        for (Cart c : list) {
                            out.println("<tr>");
                            out.println("<td>" + c.getId() + "</td>");
                            out.println("<td>" + c.getName() + "</td>");
                            out.println("<td>" + c.getPrice() + " $</td>");
                            out.println("<td><input type=\"text\" name=\"quantity\" value=\"" + c.getQuantity() + "\"></td>");
                            totalPrice += c.getPrice() * c.getQuantity();
                            total += totalPrice;
                            out.println("<td>" + (double) Math.round(totalPrice * 100) / 100 + " $</td>");
                            out.println("<td><a href=\"Remove?id=" + c.getId() + "\"><i class=\"far fa-trash-alt\"></i></a></td>");
                            out.println("</tr>");

                        }
                    %>
                    <tr>
                        <td colspan="6">
                            <div class="row">
                                <div class="col-md-6 update-cart">
                                    <button type="submit" class="btn btn-warning">Cập nhật đơn hàng</button>
                                </div>
                                <div class="col-md-6 remove-back">
                                    <a href="CancelCart" class="btn btn-danger">Hủy đơn hàng</a>
                                    <a href="HomePage.jsp" class="btn btn-primary">Tiếp tục mua hàng</a>
                                </div>
                            </div>

                        </td>
                    </tr>
                </tbody>
            </form>
            
        </table>
        <h4>Tổng tiền: <%=(double)Math.round(total*100)/100%> $</h4>
        <a href="#" class="btn btn-warning">Thanh toán</a>
    </div>
</div>