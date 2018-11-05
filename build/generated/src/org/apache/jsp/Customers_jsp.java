package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Customers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Customers</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--        <link rel=\"stylesheet\" type=\"text/css\" href=\"asset/css/bootstrap.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/vendor/animate/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/vendor/select2/select2.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"listCSS/css/listCus.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ResultSet rs = (ResultSet) request.getAttribute("listCustomer");
        
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-table100\">\n");
      out.write("                <div class=\"wrap-table100\">\n");
      out.write("                    <h1>List all Customer</h1>\n");
      out.write("                    <div class=\"table\">\n");
      out.write("                        <div class=\"row header\">\n");
      out.write("                            <div class=\"cell\">ID</div>\n");
      out.write("                            <div class=\"cell\">Full Name</div>\n");
      out.write("                            <div class=\"cell\">Address</div>\n");
      out.write("                            <div class=\"cell\">Phone</div>\n");
      out.write("                            <div class=\"cell\">UserName</div>\n");
      out.write("                            <div class=\"cell\">Password</div>\n");
      out.write("                            <div class=\"cell\">Status</div>\n");
      out.write("                            <div class=\"cell\">Update</div>\n");
      out.write("                            <div class=\"cell\">Delete</div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            while (rs.next()) {
                                out.println("<div class=\"row\">");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(1) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(2) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(3) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(4) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(5) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + rs.getString(6) + "</div>");
                                out.println("<div class=\"cell\" data-title=\"ID\">" + (rs.getInt(7) == 1 ? "Active": "De-Active") + "</div>");

                                out.println("<div class=\"cell\" data-title=\"ID\"><a href=\"Customer?service=preUpdate&id=" + rs.getInt(1) + "\">update</a></div>");
                                out.println("<div class=\"cell\" data-title=\"ID\"><a href=\"Customer?service=delete&id=" + rs.getInt(1) + "\">Delete</a></div>");
                                out.println("</div>");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"listCSS/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"listCSS/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"listCSS/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"listCSS/vendor/select2/select2.min.js\"></script>\n");
      out.write("        <script src=\"listCSS/js/main.js\"></script>\n");
      out.write("    </body>\n");
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
