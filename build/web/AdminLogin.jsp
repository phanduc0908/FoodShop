<%-- 
    Document   : AdminLogin
    Created on : Nov 5, 2018, 3:20:15 PM
    Author     : Phan Van Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Veneto Admin &middot; Sign In </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="asset/css/bootstrap.css">
        <link rel="stylesheet" href="asset/css/bootstrap.min.css">
        <link rel="stylesheet" href="dist/Admin/veneto-admin.min.css">
        <link rel="stylesheet" href="dist/Admin/demo.css">

    </head>
    <body class="body-sign-in">
        <div class="container">
            <div class="panel panel-default form-container">
                <div class="panel-body">
                    <form role="form" action="AdminLoginServelet" method="POST">
                        <h3 class="text-center margin-xl-bottom">Welcome Back!</h3>
                        <h4 style="color: red">${errorLoginAdmin}</h4>
                        <div class="form-group text-center">
                            <label class="sr-only" for="email">Username</label>
                            <input type="text" class="form-control input-lg" id="username" name="username" placeholder="Username">
                        </div>
                        <div class="form-group text-center">
                            <label class="sr-only" for="password">Password</label>
                            <input type="password" class="form-control input-lg" id="password" name="password" placeholder="Password">
                        </div>
                        <button type="submit" class="btn btn-primary btn-block btn-lg">SIGIN</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
