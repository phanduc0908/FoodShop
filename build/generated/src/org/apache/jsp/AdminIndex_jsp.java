package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Đăng nhập</title>\n");
      out.write("\n");
      out.write("    <!-- Boostrap 3.3.7 CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/css/bootstrap.css\">\n");
      out.write("    <!-- OwnStyle -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/css/login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/Admin/admin.css\">\n");
      out.write("    <!-- Icon for a page -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/icon.png\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Header -->\n");
      out.write("    <header>\n");
      out.write("        <div class=\"row top-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar hidden-sm hidden-xs\">\n");
      out.write("                    <div class=\"col-md-7\" id=\"head\">\n");
      out.write("                        Chào mừng đến trang quản trị FoodShop <span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right hidden-xs hidden-sm\">\n");
      out.write("                            <li><a href=\"AdminLogoutServelet\">Đăng xuất</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("<!-- Slide -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"left col-md-2\">\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h3>Menu</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Quản lý khách hàng</a></li>\n");
      out.write("                            <li><a href=\"#\">Quản lý sản phẩm</a></li>\n");
      out.write("                            <li><a href=\"#\">Quản lý hóa đơn</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right col-md-8\">\n");
      out.write("                    <h3>Right Content</h3>\n");
      out.write("                    <p>Đăng ký tài khoản để mua hàng nhanh hơn. Theo dõi đơn đặt hàng, vận chuyển. \n");
      out.write("                        Cập nhật các tin tức sự kiện và các chương trình giảm giá của chúng tôi.</p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
