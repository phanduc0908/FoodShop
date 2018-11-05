<%-- 
    Document   : Customers
    Created on : Nov 5, 2018, 8:24:02 PM
    Author     : Phan Van Duc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Customers</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <link rel="stylesheet" type="text/css" href="assets/vendor/bootstrap/css/bootstrap.min.css">
        <!--        <link rel="stylesheet" type="text/css" href="asset/css/bootstrap.css">-->
        <link rel="stylesheet" type="text/css" href="listCSS/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="listCSS/vendor/animate/animate.css">
        <link rel="stylesheet" type="text/css" href="listCSS/vendor/select2/select2.min.css">
        <link rel="stylesheet" type="text/css" href="listCSS/vendor/perfect-scrollbar/perfect-scrollbar.css">
        <link rel="stylesheet" type="text/css" href="listCSS/css/util.css">
        <link rel="stylesheet" type="text/css" href="listCSS/css/main.css">
        <link rel="stylesheet" type="text/css" href="listCSS/css/listCus.css">
    </head>
    <body>
        <%
            ResultSet rs = (ResultSet) request.getAttribute("rs");
        %>

        <div class="limiter">
            <div class="container-table100">
                <div class="wrap-table100">
                    <h1>List all Customer</h1>
                    <div class="action" style="padding-bottom: 15px;">
                        <a href="AdminIndex.jsp" style="padding-right: 10px;">Quay lại</a>
                    </div>
                    <div class="table">
                        <div class="row header">
                            <div class="cell">ID</div>
                            <div class="cell">Full Name</div>
                            <div class="cell">Address</div>
                            <div class="cell">Phone</div>
                            <div class="cell">UserName</div>
                            <div class="cell">Password</div>
                            <div class="cell">Status</div>
                            <div class="cell">Update</div>
                            <div class="cell">Delete</div>
                        </div>
                        <%
                            while (rs.next()) {
                                out.println("<div class=\"row\">");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(1) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(2) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(3) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(4) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(5) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(6) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + (rs.getInt(7) == 1 ? "Active" : "De-Active") + "</div>");

                                out.println("<div class=\"cell\" data-title=\"ID\"><a href=\"Customer?service=preUpdate&id=" + rs.getInt(1) + "\">update</a></div>");
                                out.println("<div class=\"cell\" data-title=\"ID\"><a href=\"Customer?service=delete&id=" + rs.getInt(1) + "\">Delete</a></div>");
                                out.println("</div>");
                            }
                        %>

                    </div>
                </div>
            </div>
        </div>
        <script src="listCSS/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script src="listCSS/vendor/bootstrap/js/popper.js"></script>
        <script src="listCSS/vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="listCSS/vendor/select2/select2.min.js"></script>
        <script src="listCSS/js/main.js"></script>
    </body>
</html>