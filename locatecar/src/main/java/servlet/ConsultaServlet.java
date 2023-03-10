package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/consultarServlet")
public class ConsultaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Object nome = req.getSession().getAttribute("nome");
        if(Objects.nonNull(nome)){
            String nomeEmTexto = String.valueOf(nome);
            out.println("<h1>" + nomeEmTexto + "</h1>");
        } else {
            out.println("<h1>Nao ha dados na sessão</h1>");
        }

    }
}