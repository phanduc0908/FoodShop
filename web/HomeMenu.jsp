<%-- 
    Document   : HomeMenu
    Created on : Oct 30, 2018, 11:30:42 AM
    Author     : Quang Hiep
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.DAOHangSanXuat"%>
<%@page import="model.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DBConnection dbconnMenu = new DBConnection();
    String sqlMenu = "Select * from HangSanXuat where status=1";
    ResultSet rsMenu = dbconnMenu.getData(sqlMenu);
%>
<div class="menu">
    <div class="danh-muc-sp">
        <div class="title">
            <h2>DANH MỤC SẢN PHẨM</h2>
        </div>
        <div class="list-sp">
            <ul> 
                <%
                    while(rsMenu.next()){
                        out.println(" <li><a href=\"#\">"+rsMenu.getString(2)+"</a></li>");
                    }
                %>
            </ul>
        </div>
    </div>

</div>
