package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Veneto Admin &middot; Sign In </title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../asset/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../asset/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/Admin/veneto-admin.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/Admin/demo.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body-sign-in\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"panel panel-default form-container\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form role=\"form\" action=\"AdminLoginServelet\" method=\"POST\">\n");
      out.write("                        <h3 class=\"text-center margin-xl-bottom\">Welcome Back!</h3>\n");
      out.write("                        <h4 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorLoginAdmin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <label class=\"sr-only\" for=\"email\">Username</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control input-lg\" id=\"username\" name=\"username\" placeholder=\"Username\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <label class=\"sr-only\" for=\"password\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control input-lg\" id=\"password\" placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-block btn-lg\">SIGIN</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
