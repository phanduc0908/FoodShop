<%-- 
    Document   : HomeMenu
    Created on : Oct 30, 2018, 11:30:42 AM
    Author     : Phan Van Duc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.DAOHangSanXuat"%>
<%@page import="model.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    DBConnection dbconn = new DBConnection();
//    DAOHangSanXuat dao = new DAOHangSanXuat(dbconn);
//    ArrayList<String> listHangSanXuat = new ArrayList<>();
//
//    String query = "select * from HangSanXuat where status = 1";
//    ResultSet rs = dbconn.getData(query);

%>
<div class="menu">
    <div class="danh-muc-sp">
        <div class="title">
            <h2>DANH MỤC SẢN PHẨM</h2>
        </div>
        <div class="list-sp">
            <ul> 
                <%
//                    while(rs.next()){
//                        out.println(" <li><a href=\"#\">"+rs.getString(2)+"</a></li>");
//                    }
                %>
            </ul>
        </div>
    </div>

</div>
