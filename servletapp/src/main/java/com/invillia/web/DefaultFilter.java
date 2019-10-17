package com.invillia.web;

import org.eclipse.jetty.servlet.Source;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DefaultFilter implements Filter{

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(
            final ServletRequest request,
            final ServletResponse response,
            final FilterChain chain
    ) throws IOException, ServletException {
        System.out.println("passou no filtro");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if (req.getHeader("X-ablau") != null) {
            res.setStatus(500);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }

}