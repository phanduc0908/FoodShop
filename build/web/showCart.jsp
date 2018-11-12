<%-- 
    Document   : showCart
    Created on : Oct 11, 2018, 10:11:01 AM
    Author     : Quang Hiep
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Cart> listCart = (ArrayList)request.getAttribute("listCart");
        %>
        <table width=50% border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th></th>
            </tr>
            <%
                double totalPrice = 0;
                for (Cart c : listCart) {
                    out.println("<tr>");
                    out.println("<td>" + c.getId() + "</td>");
                    out.println("<td>" + c.getName() + "</td>");
                    out.println("<td>" + c.getPrice()+ "</td>");
                    out.println("<td>" + c.getQuantity()+ "</td>");
                    out.println("<td><a href=\"ProductControllerJSP?service=remove&id="+c.getId()+"\">Remove</a></td>");
                    out.println("</tr>");
                    
                    totalPrice += c.getPrice() * c.getQuantity();
                }
            %>
        </table>
        <h3>Total price: <%=totalPrice%></h3>
        <h2><a href="ProductControllerJSP">Items List</h2>
        <br>
        <h2><a href="ProductControllerJSP?service=checkout">Check-out</h2></body>
</html>
