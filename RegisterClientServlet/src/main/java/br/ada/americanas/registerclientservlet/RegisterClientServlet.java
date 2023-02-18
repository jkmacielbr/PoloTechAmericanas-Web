package br.ada.americanas.registerclientservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterClientServlet", value = "/RegisterClientServlet")
public class RegisterClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");

        PrintWriter writer = response.getWriter();
        writer.println( "<html><body> <div align =\"center\">" +
                "<h1> Successfully registered user</h1>" +
                "<p>Name: " +  name+"</p>" +
                "<p>CPF: " +  cpf+"</p>" +
                        "<p>E-mail: " +  email+"</p>"+
                "</body></html>");

    }
}
