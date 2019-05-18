package com.module;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {

    public static final double PERCENT = 0.01;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = getString(request, "description");
        double price = getPrice(request, "price");
        double percent = getPrice(request, "percent");

        double discountAmount = getDiscountAmount(price, percent);

        double priceDiscount = getPriceDiscount(price, discountAmount);

        getShow(response, description, discountAmount, priceDiscount);

    }

    private double getPriceDiscount(double price, double discountAmount) {
        return price - discountAmount;
    }

    private double getDiscountAmount(double price, double percent) {
        return price * percent * PERCENT;
    }

    private void getShow(HttpServletResponse response, String description, double discountAmount, double priceDiscount) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Mo ta san pham: " + description);
        writer.println("Luong triet khau san pham: " + discountAmount);
        writer.println("Gia san pham sau triet khau: " + priceDiscount);
    }

    private double getPrice(HttpServletRequest request, String price) {
        return Double.parseDouble(request.getParameter(price));
    }

    private String getString(HttpServletRequest request, String description) {
        return request.getParameter(description);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
