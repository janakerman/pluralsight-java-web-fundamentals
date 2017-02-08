package com.pluralsight;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jakerman on 08/02/2017.
 */
// We use init parameters here to provide default values.
// When providing init parameters to our application, we need to do this in the web.xml.
// These init parameters in the web.xml OVERRIDE the ones here.
@WebServlet(urlPatterns = {"/home", "*.do"}, name = "SimpleServlet", initParams = {@WebInitParam(name = "ProductName", value = "Welcome Application")})
public class SimpleServlet extends HttpServlet {

    String appName;

    @Override
    public void init() throws ServletException {
        // Taken from @WebServlet annotation - @WebInitParam
        appName = getInitParameter("ProductName");
        System.out.println(getServletContext().getInitParameter("jans-param"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        if (name == null || name.isEmpty()) {
            resp.getWriter().write("Enter a name value");
            return;
        }

        resp.setContentType("text/xml");
        StringBuilder sb = new StringBuilder();
        sb.append("<application>");
        sb.append("<name>" + name + "</name>");
        sb.append("<product>" + appName + "</product>");
        sb.append("</application>");

        resp.getWriter().write(sb.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        if (name == null || name.isEmpty()) {
            resp.sendRedirect("index.jsp");
            return;
        }

        resp.getWriter().printf("Hello %s", name);
    }
}
