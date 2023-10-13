<%@ page import="vn.com.edu.fit.week01.models.Account" %>
<%@ page import="vn.com.edu.fit.week01.enums.Status" %>
<%@ page import="vn.com.edu.fit.week01.repositories.AccountRepository" %><%--
  Created by IntelliJ IDEA.
  User: BaoTruc
  Date: 9/23/2023
  Time: 5:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Account</title>
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
<%
    AccountRepository accountRepository = new AccountRepository();
    Account account = accountRepository.getAccountByID(request.getParameter("id"));
//    Account account = new Account("AC0001","Bao Truc","123456","baotruc2002@gmail.com", "0338030540", Status.delete);
%>
<div class="container">
    <h1>Update Account</h1>
    <form action="controls?action=updateAccount" method="post">
        Id: <input type="text" name="id" value="<%=account.getId()%>"><br>
        Full name: <input type="text" name="fullName" value="<%=account.getFullName()%>"><br>
        Email: <input type="text" name="email" value="<%=account.getEmail()%>"><br>
        Phone: <input type="text" name="phone" value="<%=account.getPhone()%>"><br>

        Status: <select name="status">
        <% if(account.getStatus()==Status.active){%>
            <option value="1" selected>active</option>
            <option value="0">deactive</option>
            <option value="-1">delete</option>
        <%}%>
        <% if(account.getStatus()==Status.deactive){%>
        <option value="1" >active</option>
        <option value="0" selected>deactive</option>
        <option value="-1">delete</option>
        <%}%>
        <% if(account.getStatus()==Status.delete){%>
        <option value="1" >active</option>
        <option value="0">deactive</option>
        <option value="-1" selected>delete</option>
        <%}%>
        </select><br><br>
        <button type="submit">Xác nhận</button>

    </form>
</div>

</body>
</html>
