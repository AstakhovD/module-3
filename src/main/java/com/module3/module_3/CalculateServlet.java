package com.module3.module_3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        int firstNumber = Integer.parseInt(request.getParameter("firstNum"));
        int secondNumber = Integer.parseInt(request.getParameter("secondNum"));
        String operator = request.getParameter("operator");
        int result = 0;

        if("+".equals(operator)){
            result = firstNumber + secondNumber;
        }else if("-".equals(operator)){
            result = firstNumber - secondNumber;
        }else if("*".equals(operator)){
            result = firstNumber * secondNumber;
        }else if("/".equals(operator)){
            result = firstNumber / secondNumber;
        }

        out.print(firstNumber + " " + operator +  " " + secondNumber + " = " + result);
        out.print("<br><a href='index.jsp'>Return</a>");
        out.flush();
        out.close();
    }
}