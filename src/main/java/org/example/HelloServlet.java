// Reflecting the directory structure where the file lives
package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter(  );
        response.setContentType("text/html");
        out.println("<h1>%STUDENT_NAME%</h1>");
        out.println("<img src='http://orig07.deviantart.net/763e/f/2008/366/a/0/homer_yahoo_by_danielgoettig.jpg'>");
    }
}