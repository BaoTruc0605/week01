package vn.com.edu.fit.week01.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.com.edu.fit.week01.model.AccountModel;
import vn.com.edu.fit.week01.models.Account;
import vn.com.edu.fit.week01.repositories.AccountRepository;

import java.io.IOException;
import java.util.List;

@WebServlet("/controls")
public class ControllerServlet extends HttpServlet {
    private final AccountRepository accountRepository;
//    private HttpServletRequest req;
//    private HttpServletResponse resp;
    {
        try {
            accountRepository = new AccountRepository();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Object actionObject = req.getParameter("action");
            if(actionObject!=null){
                String action = actionObject.toString();
                if(action.equals("insertAccount")){
                    AccountModel accountModel=new AccountModel();
                    accountModel.insertAccount(req,resp);
                }
                if(action.equals("updateAccount")){
                    AccountModel accountModel=new AccountModel();
                    accountModel.updateAccount(req,resp);
                }
                if(action.equals("deleteAccount")){
                    AccountModel accountModel=new AccountModel();
                    accountModel.deleteAccount(req,resp);
                }
            }
            else{
                resp.sendRedirect("index.jsp");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object actionObject = req.getParameter("action");
        if(actionObject!=null){
            String action = actionObject.toString();
            if(action.equals("AccountList")){
                resp.sendRedirect("QuanLyAccount.jsp");
            }
        }
        else{
            resp.sendRedirect("index.jsp");
        }
    }
}
