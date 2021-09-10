package com.hello.servlet.basic.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("전체 파라미터 조회 - start");

        req.getParameterNames().asIterator()
                .forEachRemaining(paramname -> System.out.println(paramname + ":" + req.getParameter(paramname)));
        System.out.println("전체 파라미터 조회 - end\n");
        System.out.println("단일 파라미터 조회");
        String username = req.getParameter("username");

        System.out.println(username);
    }
}
