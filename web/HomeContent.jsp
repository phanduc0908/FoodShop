<%-- 
    Document   : HomeContent
    Created on : Oct 30, 2018, 11:31:31 AM
    Author     : Phan Van Duc
--%>

<%@page import="model.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DBConnection dbconnContent = new DBConnection();
    String query = "Select sid,sname,quantity,price,picture,description from SanPham";
    ResultSet rsContent = dbconnContent.getData(query);
%>
<div class="main-content">
    <!-- Sản phẩm nổi bật -->
    <div class="sp-noi-bat">
        <div class="title">
            <h2>Sản phẩm nổi bật</h2>
        </div>
        <div class="products">
            <div class="row">
                <!--                <div class="col-md-4">
                                    <div class="products-img">
                                        <img src="images/products/sp1_03.png" alt="">
                                        <div class="add-to-cart">
                                            <a href="#" class="btn btn-warning" role="button">Thêm vào giỏ hàng</a>
                                        </div>
                                    </div>
                                    <div class="mo-ta-sp">
                                        <p>245.000 Đ</p>
                                        <a href="#"><h3>Bánh Nướng Augosuti Alena</h3></a>
                                        <p>Thêm phần mô tả</p>
                
                                    </div>  
                                </div>
                                <div class="col-md-4">
                                    <div class="products-img">
                                        <img src="images/products/sp1_03.png" alt="">
                                        <div class="add-to-cart">
                                            <a href="#" class="btn btn-warning" role="button">Thêm vào giỏ hàng</a>
                                        </div>
                                    </div>
                                    <div class="mo-ta-sp">
                                        <p>245.000 Đ</p>
                                        <a href="#"><h3>Bánh Nướng Augosuti Alena</h3></a>
                                        <p>Thêm phần mô tả</p>
                                    </div>  
                                </div>
                                <div class="col-md-4">
                                    <div class="products-img">
                                        <img src="images/products/sp1_03.png" alt="">
                                        <div class="add-to-cart">
                                            <a href="#" class="btn btn-warning" role="button">Thêm vào giỏ hàng</a>
                                        </div>
                                    </div>
                                    <div class="mo-ta-sp">
                                        <p>245.000 Đ</p>
                                        <a href="#"><h3>Bánh Nướng Augosuti Alena</h3></a>
                                        <p>Thêm phần mô tả</p>
                
                                    </div>  
                                </div>
                                <div class="col-md-4">
                                    <div class="products-img">
                                        <img src="images/products/sp1_03.png" alt="">
                                        <div class="add-to-cart">
                                            <a href="#" class="btn btn-warning" role="button">Thêm vào giỏ hàng</a>
                                        </div>
                                    </div>
                                    <div class="mo-ta-sp">
                                        <p>245.000 Đ</p>
                                        <a href="#"><h3>Bánh Nướng Augosuti Alena</h3></a>
                                        <p>Thêm phần mô tả</p>
                
                                    </div>  
                                </div>-->
              <%
                  while(rsContent.next()){
                      out.println("<div class=\"col-md-4\">");
                      out.println("  <div class=\"products-img\">");
                      out.println("    <img src=\"images/products/"+ rsContent.getString(5) +"\" style=\"width: 253px;height: 252px;\" >");
                      out.println("    <div class=\"add-to-cart\">");
                      out.println("       <a href=\"ProductControllerJSP?service=addToCart&id="+rsContent.getString(1)+"\" class=\"btn btn-warning\" role=\"button\" onclick=\"alert('Thêm thành công')\" >Thêm vào giỏ hàng</a>");
                      out.println("    </div>");
                      out.println("  </div>");
                      out.println("  <div class=\"mo-ta-sp\">");
                      out.println("    <p>"+rsContent.getString(4)+" $</p>");
                      out.println("    <a href=\"#\"><h3>"+rsContent.getString(2)+"</h3></a>");
                      out.println("    <p>"+rsContent.getString(6)+"</p>");
                      out.println("    </div>");
                      out.println(" </div>");
                  }
              %>
            </div>
        </div>
    </div>
</div>
