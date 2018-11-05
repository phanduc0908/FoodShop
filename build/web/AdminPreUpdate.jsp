<%-- 
    Document   : AdminPreUpdate
    Created on : Nov 5, 2018, 9:32:25 PM
    Author     : Phan Van Duc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang= "en ">
    <head>
        <title>Add Product</title>  
        <meta charset= "UTF-8 ">  
        <meta name= "viewport " content= "width=device-width, initial-scale=1 ">  

        <link rel= "icon " type= "image/png " href= "assets/images/icons/favicon.ico "/>  
        <link rel= "stylesheet " type= "text/css " href= "assets/vendor/bootstrap/css/bootstrap.min.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/fonts/font-awesome-4.7.0/css/font-awesome.min.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/vendor/animate/animate.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/vendor/css-hamburgers/hamburgers.min.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/vendor/select2/select2.min.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/css/util.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/css/main.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/css/bootstrap.min.css ">  
        <link rel= "stylesheet " type= "text/css " href= "assets/css/addProduct.css ">  
    </head>  
    <body>  
        <%
            ResultSet rs = (ResultSet) request.getAttribute("rs");
        %>
        <div class= "bg-contact2 " style= "background-image: url('assets/images/bg-food.jpg'); ">  
            <div class= "container-contact2 ">  
                <div class= "wrap-contact2 ">  
                    <form class= "contact2-form validate-form " action= "Customer " method= "POST ">  
                        <div class= "form-group ">  
                            <label for= "sid ">ID:</label>  
                            <input type= "text " class= "form-control " value= "rs.getInt(1)" name= "sid " readonly>  
                        </div>  
                        <div class= "form-group ">  
                            <label for= "sname ">Full name:</label>  
                            <input type= "text " class= "form-control " name= "sname" value= "rs.getInt(4)">  
                        </div>  
                        <div class= "form-group ">  
                            <label for= "address ">Address:</label>  
                            <input type= "text " class= "form-control " name= "address " value= "rs.getString(2)">  
                        </div>  
                        <div class= "form-group ">  
                            <label for= "phone ">Phone:</label>  
                            <input type= "text " class= "form-control " name= "phone " value= "rs.getInt(4)">  
                        </div>  
                        <div class= "form-group ">  
                            <label for= "username ">Username:</label>  
                            <input type= "text " class= "form-control " name= "username " value= "rs.getString(5)" readonly>  
                        </div>  
                        <div class= "form-group ">  
                            <label for= "password ">Password:</label>  
                            <input type= "text " class= "form-control " name= "password " value= "rs.getString(6)">  
                        </div>  
                        <div class= "form-group ">  
                            <label for= "status ">Status:</label>  
                            <input type= "radio " name= "status " id= "status " value= "1 <%=(rs.getInt(7)==1 ? "checked":""%>">Active  
                            <input type= "radio " name= "status " id= "status " value= "0 <%=(rs.getInt(7)==0 ? "checked":""%>" >De-Active  
                        </div>  

                        <div class= "container-contact2-form-btn ">  
                            <div class= "wrap-contact2-form-btn ">  
                                <div class= "contact2-form-bgbtn "></div>  
                                <button class= "contact2-form-btn " onclick= "this.submit()">Add</button>  
                                <input type= "hidden " name= "service " value= "update ">  
                            </div>  
                        </div>  
                    </form>  
                </div>  
            </div>  
        </div>  

        <script src= "assets/vendor/jquery/jquery-3.2.1.min.js "></script>  
        <script src= "assets/vendor/bootstrap/js/popper.js "></script>  
        <script src= "assets/vendor/bootstrap/js/bootstrap.min.js "></script>  
        <script src= "assets/vendor/select2/select2.min.js "></script>  
        <script src= "assets/js/main.js "></script>  
        <script src= "assets/js/addProduct.js "></script>  

    </body>  
</html>  
