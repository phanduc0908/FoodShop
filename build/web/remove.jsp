<%-- 
    Document   : remove
    Created on : Oct 14, 2018, 11:12:56 PM
    Author     : Phan Van Duc
--%>

<%@page import="model.DAOSanPham"%>
<%@page import="model.DBConnection"%>
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
            response.sendRedirect("ProductControllerJSP?service=showCart");
        %>
    </body>
</html>
