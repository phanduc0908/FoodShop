<%-- 
    Document   : RegisterBody
    Created on : Oct 31, 2018, 12:21:02 PM
    Author     : Quang Hiep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="paging">
        <ul class="breadcrumb">
            <li><a href="HomePage.jsp">Home</a></li>
            <li>Đăng ký</li>
        </ul>
    </div>
    <div class="login-info">
        <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
                <h3>Thông tin tài khoản</h3>
                <h4 style="color: #1d9c33">${successRegister}</h4>
                <h4 style="color: red">${errorRegister}</h4>
                <form action="AddCustomerServelet" id="registerForm" method="POST">
                    <div class="form-group">
                        <label for="sname">Họ và tên:<span>*</span></label>
                        <input type="sname" class="form-control" id="sname" name="sname">
                    </div>
                    <div class="form-group">
                        <label for="address">Địa chỉ:<span>*</span></label>
                        <input type="address" class="form-control" id="address" name="address">
                    </div>
                    <div class="form-group">
                        <label for="phone">Điện thoại:<span>*</span></label>
                        <input type="phone" class="form-control" id="phone" name="phone">
                    </div>
                    <div class="form-group">
                        <label for="username">Tên đăng nhập:<span>*</span></label>
                        <input type="username" class="form-control" id="username" name="username">
                    </div>
                    <div class="form-group">
                        <label for="password">Mật khẩu:<span>*</span></label>
                        <input type="password" class="form-control" id="password" name="password">
                    </div>
                    <button type="submit" class="btn btn-warning">ĐĂNG KÝ</button>
                </form>
            </div>
        </div>
    </div>
</div>