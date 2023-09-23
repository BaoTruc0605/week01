package vn.com.edu.fit.week01.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.com.edu.fit.week01.enums.Status;
import vn.com.edu.fit.week01.models.Account;
import vn.com.edu.fit.week01.services.AccountServices;

public class AccountModel {
    public void insertAccount(HttpServletRequest req, HttpServletResponse resp) {
        String id = req.getParameter("id");
        String fullName = req.getParameter("fullName");
        String passWord = req.getParameter("passWord");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        int statusValue = Integer.parseInt(req.getParameter("status"));
        Status status;
        if(statusValue==1)
            status = Status.active;
        else if(statusValue==0)
            status = Status.deactive;
        else
            status = Status.delete;
        Account account = new Account(id,fullName,passWord,email,phone,status);
        AccountServices accountServices = new AccountServices();
        accountServices.insertAccount(account);
    }
}
