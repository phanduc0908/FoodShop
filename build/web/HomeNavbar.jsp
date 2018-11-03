<%-- 
    Document   : HomeNavbar
    Created on : Oct 30, 2018, 11:19:02 AM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="row top-header">
        <div class="container">
            <nav class="navbar hidden-sm hidden-xs">
                <div class="col-lg-3 col-md-5 hidden-xs hidden-sm " id="head">
                    Chào mừng đến với BigFood    ${username}
                </div>
                <div class="col-lg-9 col-md-7 col-sm-9">
                    <ul class="nav navbar-nav navbar-right hidden-xs hidden-sm">
                        <li><a href="Register.jsp">Đăng ký</a></li>
                        <li><a href="Login.jsp">Đăng nhập</a></li>
                        <li><a href="#">Đăng xuất</a></li>
                        <li><a href="Cart.jsp">Giỏ hàng</a></li>
                    </ul>
                </div>
            </nav>
        </div>  
    </div>
    <div class="container logo-info-menu">
        <!-- Logo -->
        <div class="row">
            <div class="logo">
                <img src="images/logo_03.gif" alt="Logo">
            </div>

             <nav class="navbar hidden-xs hidden-sm">
                <div class=" info">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <i class="fas fa-phone"></i>
                            <span>
                                <h5>HOTLINE</h5>
                                <p>(04) 9500 9600</p>
                            </span>
                        </li>
                        <li>
                            <i class="fas fa-envelope"></i>
                            <span>
                                <h5>EMAIL</h5>
                                <p>support@bizweb.vn</p>
                            </span>
                        </li>
                        <li>
                            <i class="far fa-clock"></i>
                            <span>
                                <h5>OPEN</h5>
                                <p>8:00 AM - 10:00 PM</p>
                            </span>
                            </li>
                    </ul>  
                </div>
            </nav>
        </div>
    </div>
</header>