package com.invillia.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContaServlet extends HttpServlet {
    @Override
    protected void doGet(
            final HttpServletRequest req,
            final HttpServletResponse resp
    ) throws ServletException, IOException {
        final PrintWriter writer = resp.getWriter();
        writer.println("valor = 123.00");
    }
}
