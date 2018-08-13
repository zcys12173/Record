package com.syc.record.servlet;

import com.syc.record.common.HandlerFactory;
import com.syc.record.common.response.ResponseData;
import com.syc.record.common.response.ResponseDataFactory;
import com.syc.record.handler.user.LoginHandler;
import com.syc.record.handler.user.RegisterHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(urlPatterns = "/user")
public class UserServlet extends CommonServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Objects.requireNonNull(HandlerFactory.createHandler(LoginHandler.class)).handler(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Objects.requireNonNull(HandlerFactory.createHandler(RegisterHandler.class)).handler(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }
}
