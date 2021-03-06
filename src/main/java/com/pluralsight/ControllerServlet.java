package com.pluralsight;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jakerman on 08/02/2017.
 */
public class ControllerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // This is an example of setting global scope
        ApplicationSettings applicationSettings = new ApplicationSettings();
        applicationSettings.setFormCssClass(new CSSClass("redUser"));
        applicationSettings.setTabNames(new String[]{"Jan", "John", "James"});
        getServletContext().setAttribute("app", applicationSettings);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("Kevin", "kevinj@mantiso.com");

        //        getServletContext().setAttribute("user", user); // Global scope - any servlet or page
//        req.getSession().setAttribute("user", user); // Session scope - one user and browser
        req.setAttribute("user", user); // Request scope - just this request

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        dispatcher.forward(req, resp);
    }
}
