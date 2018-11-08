package com.big.ssm.util;

import javax.servlet.*;
import java.io.IOException;

public class charFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("charFilter预备执行");
        chain.doFilter(request,response);
        System.out.println("charFilter执行后");;
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
