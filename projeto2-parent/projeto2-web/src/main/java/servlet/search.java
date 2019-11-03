package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.Item;
import data.User;
import ejb.serverbeans.ItemsEJBLocal;

@WebServlet("/search")
public class search extends Application {
    private static final long serialVersionUID = 1L;

    @EJB
    ItemsEJBLocal itemsEJBLocal;

    public void searchForm(HttpServletResponse response, boolean withErrorMessage, boolean isEmpty)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (isEmpty)
            out.println("<BR>Empty Search");

        if (withErrorMessage)
            out.println("<BR> Something wrong happened, try again");

        out.println("<TITLE>Search Items</TITLE>");

        out.println("<BR>Search");
        out.println("<BR><form method=post>");

        out.println("<BR> Name: <INPUT TYPE=TEXT NAME=name>");

        out.println("<BR>Category: <INPUT TYPE=TEXT NAME=category>");

        out.println(
                "<BR>Price Range:  min <INPUT TYPE=NUMBER MIN=0 VALUE=0 REQUIRED NAME=minPriceRange>  max <INPUT TYPE=NUMBER MIN=0 VALUE=0 REQUIREDX     NAME=maxPriceRange>");

        out.println("<BR>In Country: <Input TYPE=CHECKBOX NAME=inCountry>");

        out.println("<BR>After Date: <Input TYPE=DATE value=YYYY-MM-DD min=2018-01-01 max=2019-12-31 NAME=afterDate>");

        out.println("<BR><INPUT TYPE=SUBMIT VALUE=Submit></form>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.header(request, response);
        super.checkLogin(request, response);
        searchForm(response, false, false);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        super.header(request, response);
        super.checkLogin(request, response);
        HttpSession session = request.getSession(false);

        response.setContentType("text/html");
        String name = request.getParameter("name");
        if (name == null || name.equals(""))
            name = "";

        String category = request.getParameter("category");
        if (category == null || category.equals(""))
            category = "";

        int minPrice = Integer.parseInt(request.getParameter("minPriceRange"));
        int maxPrice = Integer.parseInt(request.getParameter("maxPriceRange"));
        if (minPrice > maxPrice)
            searchForm(response, true, false);

        String inCountry = request.getParameter("inCountry");
        if (inCountry != null && !inCountry.equals("")) {
            // Value is true
            User user = (User) session.getAttribute("user");
            inCountry = user.getCountry();
        } else
            inCountry = "";

        String date = request.getParameter("afterDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date afterDate = null;
        try {
            afterDate = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Item> items = itemsEJBLocal.search(name, category, minPrice, maxPrice, inCountry, afterDate);
        if (items == null)
            searchForm(response, true, false);
        else {
            if (items.isEmpty())
                searchForm(response, false, true);
            else {
                // Store list on array
                session.setAttribute("items", items);
                response.sendRedirect(request.getContextPath() + "/result");
            }
        }
    }
}
