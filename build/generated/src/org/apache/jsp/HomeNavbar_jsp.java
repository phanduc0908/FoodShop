package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomeNavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String username = (String)request.getAttribute("username");

      out.write("\n");
      out.write("<header>\n");
      out.write("    <div class=\"row top-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav class=\"navbar hidden-sm hidden-xs\">\n");
      out.write("                <div class=\"col-lg-3 col-md-5 hidden-xs hidden-sm \" id=\"head\">\n");
      out.write("                    Chào mừng ");
      out.print(username);
      out.write(" đến với BigFood !\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9 col-md-7 col-sm-9\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right hidden-xs hidden-sm\">\n");
      out.write("                        <li><a href=\"#\">Đăng ký</a></li>\n");
      out.write("                        <li><a href=\"#\">Đăng nhập</a></li>\n");
      out.write("                        <li><a href=\"#\">Đăng xuất</a></li>\n");
      out.write("                        <li><a href=\"#\">Giỏ hàng</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>  \n");
      out.write("    </div>\n");
      out.write("    <div class=\"container logo-info-menu\">\n");
      out.write("        <!-- Logo -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"images/logo_03.gif\" alt=\"Logo\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("             <nav class=\"navbar hidden-xs hidden-sm\">\n");
      out.write("                <div class=\" info\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-phone\"></i>\n");
      out.write("                            <span>\n");
      out.write("                                <h5>HOTLINE</h5>\n");
      out.write("                                <p>(04) 9500 9600</p>\n");
      out.write("                            </span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-envelope\"></i>\n");
      out.write("                            <span>\n");
      out.write("                                <h5>EMAIL</h5>\n");
      out.write("                                <p>support@bizweb.vn</p>\n");
      out.write("                            </span>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"far fa-clock\"></i>\n");
      out.write("                            <span>\n");
      out.write("                                <h5>OPEN</h5>\n");
      out.write("                                <p>8:00 AM - 10:00 PM</p>\n");
      out.write("                            </span>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>  \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>");
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
