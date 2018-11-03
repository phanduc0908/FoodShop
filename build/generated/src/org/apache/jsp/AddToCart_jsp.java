package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Cart;
import java.sql.ResultSet;
import model.DBConnection;
import entity.SanPham;

public final class AddToCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add To Cart</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = request.getParameter("id"); // id - key
            // check session is exist in

            DBConnection dbconn = new DBConnection();
            String sql = "Select sid,sname,price from SanPham where sid = '" + id + "'";
            ResultSet rs = dbconn.getData(sql);
            Cart cart = new Cart();
            cart.setId(rs.getString(1));
            cart.setName(rs.getString(2));
            cart.setPrice(Double.parseDouble(rs.getString(3)));
            cart.setQuantity(1);
            
            
            //Object value = session.getAttribute("cartID");//getKey(id)
            if (session.getAttribute("cartID") == null) {
                ArrayList<Cart> listCart = new ArrayList<Cart>();
                listCart.add(cart);
                session.setAttribute("cartID", listCart);
            } else {
                
            }
            //out.println(listCart.size());
        
      out.write("\n");
      out.write("        <h1>Item with id=");
      out.print(id);
      out.write(" was added to the Shopping Cart</h1>\n");
      out.write("        <h2><a href=\"showCart.jsp\">Show Shopping Cart</h2>\n");
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
