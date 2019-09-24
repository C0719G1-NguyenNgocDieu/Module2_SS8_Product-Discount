package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class productDiscount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String products = req.getParameter("product");
        Float price = Float.parseFloat(req.getParameter("price"));
        Float discount = Float.parseFloat(req.getParameter("discount"));

        double result = price * discount * 0.1;

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<h2> Product Description: " + products + "</h2>");
        writer.println("<h2> List Price: " + price + "</h2>");
        writer.println("<h2> Discount Percent: " + discount + "</h2>");
        writer.println("<hr>");
        writer.println("<h2> Discount Amount: " + result + "</h2>");
        writer.println("</html>");
    }
}
