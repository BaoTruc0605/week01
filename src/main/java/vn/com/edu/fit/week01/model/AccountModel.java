package vn.com.edu.fit.week01.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.com.edu.fit.week01.enums.Status;
import vn.com.edu.fit.week01.models.Account;
import vn.com.edu.fit.week01.services.AccountServices;

import java.util.ArrayList;
import java.util.List;

public class AccountModel {
    private final AccountServices services = new AccountServices();
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
    public List<Account> getAllAccount(){
       return services.getAll();
    }
    public void updateAccount(HttpServletRequest req, HttpServletResponse resp) {
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
        accountServices.updateAccount(account);
    }
    public void deleteAccount(HttpServletRequest req, HttpServletResponse resp) {
        String id = req.getParameter("id");
        AccountServices accountServices = new AccountServices();
        accountServices.deleteAccount(id);
    }
}
