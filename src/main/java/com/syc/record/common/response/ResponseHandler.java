package com.syc.record.common.response;

import com.google.gson.Gson;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class ResponseHandler{
    public void handler(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("application/json");
        String result = new Gson().toJson(getResponseData(request));
        try {
            PrintWriter writer = response.getWriter();
            writer.write(result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract ResponseData getResponseData(HttpServletRequest request);
}
