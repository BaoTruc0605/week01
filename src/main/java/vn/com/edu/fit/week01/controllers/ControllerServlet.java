package vn.com.edu.fit.week01.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.com.edu.fit.week01.model.AccountModel;

import java.io.IOException;

@WebServlet("/controls")
public class ControllerServlet extends HttpServlet {
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
            }
            else{
                resp.sendRedirect("index.jsp");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
