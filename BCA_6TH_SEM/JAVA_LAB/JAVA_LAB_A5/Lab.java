package com;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lab extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Voting</title>");
            out.println("</head>");
            out.println("<body>");

            String name = request.getParameter("uname");
            String ageParam = request.getParameter("uage");

            try {
                int age = Integer.parseInt(ageParam);
                if (age >= 18) {
                    out.println("<h4>" + name + ", You are eligible for voting.</h4>");
                } else {
                    out.println("<h4>" + name + ", You are not eligible for voting.</h4>");
                }
            } catch (NumberFormatException e) {
                out.println("<h4>Invalid age input. Please enter a valid number.</h4>");
            }

            out.println("<a href=\"index.html\">Home</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
}
