<%--
  Created by IntelliJ IDEA.
  User: BaoTruc
  Date: 9/23/2023
  Time: 5:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Account</title>
    <style>
        body {
            background-color: rgb(210, 244, 248);
        }
        .container{
            text-align: center;
        }
        form{
            text-align: right;
            width: 80%;
        }

        label  {
            margin-left: 10%;
        }

        select,input {
            margin-top: 20px;
            margin-right: 15%;
            width: 40%;

        }

        button {
            margin-right: 30%;
            background-color: aquamarine;
            border: black solid 1px
        }

    </style>
</head>
<body>
<div class="container">
    <h1>Insert Account</h1>
    <form action="controls?action=insertAccount" method="post">
        Id: <input type="text" name="id"><br>
        Full name: <input type="text" name="fullName"><br>
        Password: <input type="text" name="passWord"><br>
        Email: <input type="text" name="email"><br>
        Phone: <input type="text" name="phone"><br>
        Status: <select name="status">
            <option value="1">active</option>
            <option value="0">deactive</option>
            <option value="-1">delete</option>
        </select><br><br>
        <button type="submit">Thêm</button>

    </form>
</div>

</body>
</html>
