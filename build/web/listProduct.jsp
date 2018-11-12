<%-- 
    Document   : listProduct
    Created on : Oct 11, 2018, 9:35:05 AM
    Author     : Quang Hiep
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List product</title>
        <style>
            img{
                height: 100px;
                width: 100px;
            }
        </style>
    </head>
    <body>
        <%
            ResultSet rs = (ResultSet)request.getAttribute("rs");
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>SID</th>
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Picture</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>

                <%
                    while (rs.next()) {
                        out.println("<tr>");
                        out.println("<td>" + rs.getString(1) + "</td>");
                        out.println("<td>" + rs.getString(2) + "</td>");
                        out.println("<td>" + rs.getString(3) + "</td>");
                        out.println("<td>" + rs.getString(4) + "</td>");
                        out.println("<td><img src=\"images/"+ rs.getString(5) +"\"></td>");
                        out.println("<td>" + rs.getString(6) + "</td>");
                        out.println("<td><a href=\"ProductControllerJSP?service=addToCart&id="+rs.getString(1)+"\">AddtoCart</a></td>");
                        out.println("</tr>");
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
