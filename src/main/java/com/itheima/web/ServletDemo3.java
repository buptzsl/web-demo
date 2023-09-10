package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * ClassName: ServletDemo1
 * Package: com.itheima.web
 * Description:
 *
 * @Author 北邮-赵世龙
 * @Create 2023/8/3 15:21
 * @Version 1.0
 */

/**
 * Servlet 方法介绍
 */
@WebServlet(urlPatterns="/demo3")
public class ServletDemo3 implements Servlet {
    private  ServletConfig config;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        System.out.println("init...");

    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");

    }

    public void destroy() {
        System.out.println("destroy...");

    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return null;
    }

}
