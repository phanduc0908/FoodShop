<%-- 
    Document   : LoginBody
    Created on : Oct 31, 2018, 12:29:10 PM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="paging">
        <ul class="breadcrumb">
            <li><a href="homepage.html">Home</a></li>
            <li>Đăng nhập</li>
        </ul>
    </div>
    <div class="login-info">
        <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
                <h3>Thông tin tài khoản</h3>
                <form action="AccountController" id="loginForm" method="POST">
                    <div class="form-group">
                        <label for="username">Tên đăng nhập:<span>*</span></label>
                        <input type="username" class="form-control" id="username" name="username">
                    </div>
                    <div class="form-group">
                        <label for="password">Mật khẩu:<span>*</span></label>
                        <input type="password" class="form-control" id="password" name="password">
                    </div>
                    <button type="submit" class="btn btn-warning">ĐĂNG NHẬP</button>
                </form>
            </div>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <h3>Bạn chưa có tài khoản ?</h3>
                <p>Đăng ký tài khoản để mua hàng nhanh hơn. Theo dõi đơn đặt hàng, vận chuyển. 
                    Cập nhật các tin tức sự kiện và các chương trình giảm giá của chúng tôi.</p>
                <button type="button" class="btn btn-warning"><a href="register.html">ĐĂNG KÝ</a></button>
            </div>
        </div>
    </div>
</div>