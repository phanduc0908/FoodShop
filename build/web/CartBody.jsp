<%-- 
    Document   : CartBody
    Created on : Oct 31, 2018, 12:35:25 PM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="paging">
        <ul class="breadcrumb">
            <li><a href="homepage.html">Home</a></li>
            <li>Giỏ hàng</li>
        </ul>
    </div>
    <div class="cart-info">
        <h3>Thông tin giỏ hàng</h3>
        <table class="table table-bordered">
            <thead>
                <tr>
                  <th>ID</th>
                  <th>Tên sản phẩm</th>
                  <th>Đơn giá</th>
                  <th>Số lượng</th>
                  <th>Thành tiền</th>
                  <th>Xóa</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>2</td>
                    <td>Dell</td>
                    <td>50.000 Đ</td>
                    <td><input type="text" name="quantity" id="quantity" value="1"></td>
                    <td>50.000 Đ</td>
                    <td>
                        <a href="#">
                            <i class="far fa-trash-alt"></i>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <div class="row">
                            <div class="col-md-6 update-cart">
                                <a href="#" class="btn btn-warning">Cập nhật giỏ hàng</a>
                            </div>
                            <div class="col-md-6 remove-back">
                                <a href="#" class="btn btn-danger">Hủy đơn hàng</a>
                                <a href="homepage.html" class="btn btn-primary">Tiếp tục mua hàng</a>
                            </div>
                        </div>

                    </td>
                </tr>
            </tbody>
        </table>
        <h4>Tổng tiền: 800.00 Đ</h4>
        <a href="#" class="btn btn-warning">Thanh toán</a>
    </div>
</div>