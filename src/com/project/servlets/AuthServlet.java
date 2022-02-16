
package com.project.servlets;

import com.project.db.DBUtil;
import com.project.db.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AuthServlet", value = "/auth")
public class AuthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        Users user = DBUtil.getUser(login, password);

        if(user!=null){
            request.getSession().setAttribute("USER", user);
        }

        response.sendRedirect("/");

    }
}
