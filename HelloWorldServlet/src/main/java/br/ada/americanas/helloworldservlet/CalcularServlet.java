package br.ada.americanas.helloworldservlet;

import br.ada.americanas.helloworldservlet.operation.Operation;
import br.ada.americanas.helloworldservlet.operation.OperationFactory;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CalcularServlet", value = "/calcular")
public class CalcularServlet extends HttpServlet {

    private List<Operation> operations = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BigDecimal first = new BigDecimal(request.getParameter("first"));
        BigDecimal second = new BigDecimal(request.getParameter("second"));
        String operator = request.getParameter("operator");

        Operation operation = OperationFactory.create(operator);
        operation.execute(first, second);

        this.operations.add(operation);


        request.setAttribute("historico_operacoes", this.operations);
        request.getRequestDispatcher("/historico.jsp").forward(request, response);
    }


}
