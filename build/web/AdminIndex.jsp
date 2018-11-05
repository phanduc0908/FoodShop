<%-- 
    Document   : Index
    Created on : Nov 5, 2018, 3:35:07 PM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Đăng nhập</title>

    <!-- Boostrap 3.3.7 CSS -->
    <link rel="stylesheet" href="asset/css/bootstrap.min.css">
    <link rel="stylesheet" href="asset/css/bootstrap.css">
    <!-- OwnStyle -->
    <link rel="stylesheet" href="asset/css/login.css">
    <link rel="stylesheet" href="dist/Admin/admin.css">
    <!-- Icon for a page -->
    <link rel="shortcut icon" href="images/icon.png">
</head>
<body>
<!-- Header -->
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
<!-- Slide -->
    <div class="container">
        <div class="content">
            <div class="row">
                <div class="left col-md-2">
                    <div class="title">
                        <h3>Menu</h3>
                    </div>
                    <div class="menu">
                        <ul>
                            <li><a href="#">Quản lý khách hàng</a></li>
                            <li><a href="#">Quản lý sản phẩm</a></li>
                            <li><a href="#">Quản lý hóa đơn</a></li>
                        </ul>
                    </div>
                </div>
                <div class="right col-md-8">
                    <h3>Right Content</h3>
                    <p>Đăng ký tài khoản để mua hàng nhanh hơn. Theo dõi đơn đặt hàng, vận chuyển. 
                        Cập nhật các tin tức sự kiện và các chương trình giảm giá của chúng tôi.</p>
                    
                </div>
            </div>
        </div>
    </div>

</body>
</html>