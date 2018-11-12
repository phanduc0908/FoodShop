<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : HomeNavbar
    Created on : Oct 30, 2018, 11:19:02 AM
    Author     : Quang Hiep
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
                        <c:if test="${fullName == null}">
                            <li><a href="Register.jsp">Đăng ký</a></li>
                            </c:if>
                            <c:if test="${fullName == null}">
                            <li><a href="Login.jsp">Đăng nhập</a></li>
                            </c:if>
                            <c:if test="${fullName != null}">
                            <li><a href="LogoutAccount" onclick="alert('Bạn có muốn đăng xuất')">Đăng xuất</a></li>
                            </c:if>
                        <li><a href="ShowCart">Giỏ hàng</a></li>
                    </ul>
                </div>
            </nav>
        </div>  
    </div>
    <div class="container logo-info-menu">
        <!-- Logo -->
        <div class="row">
            <div class="logo">
                <a href="HomePage.jsp"><img src="images/logo_03.gif" alt="Logo"></a>
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