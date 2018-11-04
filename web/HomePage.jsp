<%-- 
    Document   : index
    Created on : Sep 27, 2018, 10:22:55 AM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FoodShop</title>

        <!-- Boostrap 3.3.7 CSS -->
        <link rel="stylesheet" href="asset/css/bootstrap.min.css">
        <link rel="stylesheet" href="asset/css/bootstrap.css">

        <!-- FontAwesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- OwnStyle -->
        <link rel="stylesheet" href="asset/css/ownStyles.css">

        <!-- Icon for a page -->
        <link rel="shortcut icon" href="images/icon.png">

        <!-- OwlCarousel -->
        <link rel="stylesheet" href="dist/assets/owl.carousel.min.css">
        <link rel="stylesheet" href="dist/assets/owl.theme.default.min.css">
    </head>
    <body>
        <%@include file="HomeNavbar.jsp" %>
        <%@include file="HomeSlider.jsp" %>
        <%@include file="HomeBanner.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <%@include file="HomeMenu.jsp" %>
                </div>
                <div class="col-md-9">
                    <%@include file="HomeContent.jsp" %>
                </div>
            </div>
            <%@include file="HomeBrand.jsp" %>
        </div>
        <%@include file="HomeFooter.jsp" %>
        <!-- Boostrap JS -->
        <script src="asset/js/bootstrap.min.js"></script>
        <!-- Owl Carousel JS -->
        <script src="owlcarousel/assets/vendors/jquery.min.js"></script>
        <script src="dist/owl.carousel.js"></script>
        <script src="asset/js/main.js"></script>
    </body>
</html>
