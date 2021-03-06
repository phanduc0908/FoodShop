package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/HomeNavbar.jsp");
    _jspx_dependants.add("/CartSlider.jsp");
    _jspx_dependants.add("/CartBody.jsp");
    _jspx_dependants.add("/HomeFooter.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Giỏ hàng</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Boostrap 3.3.7 CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- FontAwesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <!-- OwnStyle -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/cart.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Icon for a page -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/icon.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- OwlCarousel -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/assets/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/assets/owl.theme.default.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"row top-header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <nav class=\"navbar hidden-sm hidden-xs\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-5 hidden-xs hidden-sm \" id=\"head\">\r\n");
      out.write("                    Chào mừng đến với BigFood    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9 col-md-7 col-sm-9\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right hidden-xs hidden-sm\">\r\n");
      out.write("                        <li><a href=\"Register.jsp\">Đăng ký</a></li>\r\n");
      out.write("                        <li><a href=\"Login.jsp\">Đăng nhập</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Đăng xuất</a></li>\r\n");
      out.write("                        <li><a href=\"Cart.jsp\">Giỏ hàng</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>  \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container logo-info-menu\">\r\n");
      out.write("        <!-- Logo -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <img src=\"images/logo_03.gif\" alt=\"Logo\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("             <nav class=\"navbar hidden-xs hidden-sm\">\r\n");
      out.write("                <div class=\" info\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"fas fa-phone\"></i>\r\n");
      out.write("                            <span>\r\n");
      out.write("                                <h5>HOTLINE</h5>\r\n");
      out.write("                                <p>(04) 9500 9600</p>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"fas fa-envelope\"></i>\r\n");
      out.write("                            <span>\r\n");
      out.write("                                <h5>EMAIL</h5>\r\n");
      out.write("                                <p>support@bizweb.vn</p>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"far fa-clock\"></i>\r\n");
      out.write("                            <span>\r\n");
      out.write("                                <h5>OPEN</h5>\r\n");
      out.write("                                <p>8:00 AM - 10:00 PM</p>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                    </ul>  \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"slide\">\r\n");
      out.write("    <div class=\"text\">\r\n");
      out.write("        <h3>Giỏ hàng</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"paging\">\r\n");
      out.write("        <ul class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"homepage.html\">Home</a></li>\r\n");
      out.write("            <li>Giỏ hàng</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"cart-info\">\r\n");
      out.write("        <h3>Thông tin giỏ hàng</h3>\r\n");
      out.write("        <table class=\"table table-bordered\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>ID</th>\r\n");
      out.write("                  <th>Tên sản phẩm</th>\r\n");
      out.write("                  <th>Đơn giá</th>\r\n");
      out.write("                  <th>Số lượng</th>\r\n");
      out.write("                  <th>Thành tiền</th>\r\n");
      out.write("                  <th>Xóa</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>2</td>\r\n");
      out.write("                    <td>Dell</td>\r\n");
      out.write("                    <td>50.000 Đ</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"quantity\" id=\"quantity\" value=\"1\"></td>\r\n");
      out.write("                    <td>50.000 Đ</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"far fa-trash-alt\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"6\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6 update-cart\">\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-warning\">Cập nhật giỏ hàng</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 remove-back\">\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-danger\">Hủy đơn hàng</a>\r\n");
      out.write("                                <a href=\"homepage.html\" class=\"btn btn-primary\">Tiếp tục mua hàng</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        <h4>Tổng tiền: 800.00 Đ</h4>\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-warning\">Thanh toán</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"quick-menu\">\r\n");
      out.write("                <div class=\"col-md-9 col-sm-12\">\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3\">\r\n");
      out.write("                        <h3>Về chúng tôi</h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Giới thiệu chung</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Quy chế hoạt động</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Lịch sử hình thành</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Góp ý khiếu nại</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Bản đồ chỉ đường</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Chính sách tuyển dụng</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3\">\r\n");
      out.write("                        <h3>Thông tin khách hàng</h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Tài khoản của tôi</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Chính sách đổi trả</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Thông tin cá nhân</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Lịch sử mua hàng</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Danh sách đơn hàng</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Giao hàng & thanh toán</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3\">\r\n");
      out.write("                        <h3>Hướng dẫn mua hàng </h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Mua hàng trả cóp</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Hướng dẫn mua hàng</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Chính sách đổi trả</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Thông tin khiếu nại</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Mua hàng online</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Giao dịch chuyển khoản</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3\">\r\n");
      out.write("                        <h3>Dịch vụ ưu đãi</h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Bảo hành miễn phí</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Thông tin khuyến mại</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Chính sách ưu đãi</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Chuyển phát nhanh</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Tài liệu hướng dẫn</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Mua hàng online</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3 col-sm-4\">\r\n");
      out.write("                    <h3>Đăng ký nhận tin</h3>\r\n");
      out.write("                    <p>Đăng ký nhận thông tin ưu đãi cùng với\r\n");
      out.write("                            khuyến mãi khủng từ bigfood.vn</p>\r\n");
      out.write("                    <div class=\"getEmail\">\r\n");
      out.write("                        <form action=\"\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Nhập email của bạn ..\">\r\n");
      out.write("                                <button type=\"button\"><i class=\"fas fa-paper-plane\"></i></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"public\">\r\n");
      out.write("                        <a href=\"https://www.facebook.com/profile.php?id=100009850397613\"><img src=\"images/mangXH/fb_03.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"images/mangXH/tw_03.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"images/mangXH/gg_03.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"images/mangXH/istag_03.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"images/mangXH/vim_03.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"images/mangXH/rss_03.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"images/mangXH/youtube_03.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-8 hidden-md hidden-lg hidden-xs company \">\r\n");
      out.write("                        <h3>Công ty Cổ phần Công nghệ bigfood</h3>\r\n");
      out.write("                        <p>Địa chỉ: Tầng 4 Tòa nhà Hanoi Group, 442 Đội Cấn, Ba Đình, Hà Nội  </p>\r\n");
      out.write("                        <p>Chi nhánh: Lầu 3 - Tòa nhà Lữ Gia - Số 70 Lữ Gia - Phường 15 - Quận 11 - TP Hồ Chí Minh</p>      \r\n");
      out.write("                        <p>ĐT: (84-4) 6655 8868     Fax: (84-4) 3786 8904     Email: info@dkt.com.vn</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"hidden-sm company\">\r\n");
      out.write("            <h3>Công ty Cổ phần Công nghệ bigfood</h3>\r\n");
      out.write("            <p>Địa chỉ: Tầng 4 Tòa nhà Hanoi Group, 442 Đội Cấn, Ba Đình, Hà Nội  </p>\r\n");
      out.write("            <p>Chi nhánh: Lầu 3 - Tòa nhà Lữ Gia - Số 70 Lữ Gia - Phường 15 - Quận 11 - TP Hồ Chí Minh</p>      \r\n");
      out.write("            <p>ĐT: (84-4) 6655 8868     Fax: (84-4) 3786 8904     Email: info@dkt.com.vn</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-9 col-xs-12\">\r\n");
      out.write("                    <p>&#169 Copyright 2008-2015 BIGFOOD JSC. All rights reserved. Phát triển bởi <a href=\"#\">Bizweb</a>.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3 col-xs-12\">\r\n");
      out.write("                    <img src=\"images/pay_03.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("        <!-- Boostrap JS -->\r\n");
      out.write("        <script src=\"asset/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
