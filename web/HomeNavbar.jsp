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
                <div class="col-md-6" id="head">
                    Chào mừng đến với BigFood <span style="color: #ff0000">${fullName}</span>
                </div>
                <div class="col-md-6">
                    <ul class="nav navbar-nav navbar-right hidden-xs hidden-sm">
                        <li><a href="Register.jsp">Đăng ký</a></li>
                        <li><a href="Login.jsp">Đăng nhập</a></li>
                        <li><a href="CheckoutAccount.jsp" onclick="alert('Đăng xuất thành công')">Đăng xuất</a></li>
                        <li><a href="ProductControllerJSP?service=showCart">Giỏ hàng</a></li>
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