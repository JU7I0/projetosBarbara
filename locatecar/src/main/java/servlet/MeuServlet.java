package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/meuServlet")
public class MeuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        req.getSession().setAttribute("nome", "Bárbara Ayres");

        PrintWriter out = resp.getWriter();
        out.println("<h1>Salvo com sucesso!</h1>");

        resp.sendRedirect("/locatecar/consultarServlet");
    }
}
