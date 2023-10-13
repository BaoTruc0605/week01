<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>

        ul{
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: rgb(25, 138, 138);
        }
        li{
            float: left;
        }
        li a:hover{
            background-color: cornflowerblue;
        }
        li a{
            display: inline-block;
            color: white;
            text-align: center;
            padding: 10px 14px;
            text-decoration: none;
        }
    </style>
</head>
<body>
<h1><%= "Hello Bao Truc cute" %>
</h1>
<br/>

<div class="container">
    <div class="head">
        <ul>
            <li><a href="index.jsp">Trang chủ</a></li>
            <li><a href="QuanLyAccount.jsp">Quản lý account</a></li>
            <li><a href="">Quản lý role</a></li>
            <li><a href="">Quản lý log</a></li>
            <li><a href="">Thông tin tài khoản</a></li>
        </ul>
    </div>
    <div class="body">
        <a href="hello-servlet">Hello Work</a><br>
        <a href="InsertAccount.jsp">Insert Account</a><br>
        <a href="Login.jsp">Login</a>
        <a href="controls?action=AccountList">Quản lý account</a>
    </div>
</div>
</body>
</html>