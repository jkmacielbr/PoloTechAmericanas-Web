package br.ada.americanas.helloworldservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalcularServlet", value = "/calcular")
public class CalcularServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer first = Integer.valueOf(request.getParameter("first"));
        Integer second = Integer.valueOf(request.getParameter("second"));

        Integer calculo = first + second;

        PrintWriter writer = response.getWriter();

        writer.println("<html><body>O resultado da soma foi: " + calculo + "</body></html>");
    }


}
