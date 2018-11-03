<%-- 
    Document   : Login
    Created on : Oct 31, 2018, 12:26:03 PM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Đăng nhập</title>

        <!-- Boostrap 3.3.7 CSS -->
        <link rel="stylesheet" href="asset/css/bootstrap.min.css">
        <link rel="stylesheet" href="asset/css/bootstrap.css">

        <!-- FontAwesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- OwnStyle -->
        <link rel="stylesheet" href="asset/css/login.css">

        <!-- Icon for a page -->
        <link rel="shortcut icon" href="images/icon.png">
        <!-- OwlCarousel -->
        <link rel="stylesheet" href="dist/assets/owl.carousel.min.css">
        <link rel="stylesheet" href="dist/assets/owl.theme.default.min.css">
    </head>
    <body>
        <%@include file="HomeNavbar.jsp" %>
        <%@include file="LoginSlider.jsp" %>
        <%@include file="LoginBody.jsp" %>
        <%@include file="HomeFooter.jsp" %>
        <!-- Boostrap JS -->
        <script src="asset/js/bootstrap.min.js"></script>
    </body>
</html>
