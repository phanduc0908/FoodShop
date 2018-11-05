<%-- 
    Document   : AdminNavbar
    Created on : Nov 5, 2018, 8:10:40 PM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="row top-header">
        <div class="container">
            <nav class="navbar hidden-sm hidden-xs">
                <div class="col-md-7" id="head">
                    Chào mừng đến trang quản trị FoodShop <span style="color: red">${username}</span>
                </div>
                <div class="col-md-5">
                    <ul class="nav navbar-nav navbar-right hidden-xs hidden-sm">
                        <li><a href="AdminLogoutServelet">Đăng xuất</a></li>
                    </ul>
                </div>
            </nav>
        </div>  
    </div>
</header>
