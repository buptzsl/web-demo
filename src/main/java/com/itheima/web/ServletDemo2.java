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
 * Servlet 生命周期方法
 */
@WebServlet(urlPatterns="/demo2",loadOnStartup=0)
public class ServletDemo2 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");

    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");

    }

    public void destroy() {
        System.out.println("destroy...");

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }

}
