package com.gmail.xmrayq.app.servlets.commands.impl;

import com.gmail.xmrayq.app.dao.impl.UserDaoImpl;
import com.gmail.xmrayq.app.dao.model.User;
import com.gmail.xmrayq.app.servlets.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User newUser = User.newBuilder()
                .withEmail("EMAIL")
                .withPassword("PASSWORD")
                .withFirstName("FIRST_NAME")
                .withLastName("LAST_NAME")
                .build();
        UserDaoImpl.save(newUser);
        return null;
    }
}

    /*  String email = request.getParameter("email");
           String password = request.getParameter("password");
           String firstName = request.getParameter("first name");
           String lastName = request.getParameter("last name");*/
   /* PrintWriter out = response.getWriter();
        out.println("<h1>"+email+password+firstName+lastName+"</h1>");*/
