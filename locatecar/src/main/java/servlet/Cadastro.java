package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");
        String tipoDeCliente = req.getParameter("tipoDeCliente");

        if (nome.equals("") || idade.equals("") || tipoDeCliente.equals("")) {
            resp.setContentType("text/html");
            resp.getWriter().println("<h3>Dados obrigatórios não preenchidos!</h3>");
        } else {
            req.setAttribute("nome", nome);
            req.setAttribute("idade", idade);
            req.setAttribute("tipoDeCliente", tipoDeCliente);

            RequestDispatcher rd = req.getRequestDispatcher("data.jsp");

            rd.forward(req, resp);
        }

    }
}