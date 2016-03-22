// Reflecting the directory structure where the file lives
package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter(  );
        response.setContentType("text/html");

        String fileLocation = HelloServlet.class.getClassLoader().getResource("build-info.txt").getPath();
        Path path = Paths.get(fileLocation);
        String content = new String(Files.readAllBytes(path));
        out.println("<pre>");
        out.println("BUILD DETAILS:");
        out.println(content);
        out.println("</pre>");

        String fileLocation = HelloServlet.class.getClassLoader().getResource("deploy-info.txt").getPath();
        Path path = Paths.get(fileLocation);
        String content = new String(Files.readAllBytes(path));
        out.println("<br><pre>");
        out.println("Deploy DETAILS:");
        out.println(content);
        out.println("</pre>");

        out.println("<img src='http://orig07.deviantart.net/763e/f/2008/366/a/0/homer_yahoo_by_danielgoettig.jpg'>");
    }
}
