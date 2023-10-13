<%@ page import="vn.com.edu.fit.week01.services.AccountServices" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.com.edu.fit.week01.models.Account" %><%--
  Created by IntelliJ IDEA.
  User: BaoTruc
  Date: 9/24/2023
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quản lý account</title>
    <style>
        table{
            border: 1px;
        }
    </style>
</head>
<body>
<%
    AccountServices services = new AccountServices();
    List<Account> listAccount = services.getAll();
%>
<h1><%=listAccount.size()%></h1>
<table border="1px solid ">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Status</th>
        <th>#</th>
    </tr>

    <% for (Account account: listAccount){%>
    <tr id="row_<%= account.getId() %>">
        <td><%=account.getId()%></td>
        <td><%=account.getFullName()%></td>
        <td><%=account.getEmail()%></td>
        <td><%=account.getPhone()%></td>
        <td><%=account.getStatus()%></td>
        <td><a href="UpdateAccount.jsp?id=<%= account.getId() %>">Update Account</a></td>
<%--        <a href="login?upDateAccID=<%= account.getAccount_id() %>&amp;action=nextLayoutUpdateAccount">--%>
<%--        <td><a href="ControlServlet?action=deleteAccount&id=<%= account.getId() %>">Delete Account</a></td>&ndash;%&gt;--%>
<%--        href="ControlServlet?action=add-grant-access&id=<%= account.getId() %>--%>

    </tr>
    <%}%>

</table>

<a href="InsertAccount.jsp">Insert Account</a><br>
</body>
</html>
