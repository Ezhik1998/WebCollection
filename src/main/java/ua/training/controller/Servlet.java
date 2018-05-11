package ua.training.controller;

import ua.training.controller.command.*;
import ua.training.model.IntegerHashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


public class Servlet extends HttpServlet {
    public static String CURRENT_INDEX = "currentIndex";
    public static String CURRENT_VALUE = "currentValue";
    public static String AMOUNT_OF_NUMBERS = "amountOfNumbers";
    public static String SORTED_HASHSET = "sortedHashSet";


    private Map<String, Command> commands = new HashMap<String, Command>();


    private IntegerHashSet integerHashSet;


    public void init() {
        this.integerHashSet = new IntegerHashSet();
        commands.put("View", new View());
        commands.put("->", new Next());
        commands.put("<-", new Previous());
        commands.put("Add" , new Add());
        commands.put("Sort" , new Sort());

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        String path = request.getRequestURI();
        System.out.println(path);

        String param = "";

        if (request.getParameter("view") != null) {
            param = request.getParameter("view");
        }
        if (request.getParameter("rightArrow") != null) {
            param = request.getParameter("rightArrow");
        }
        if (request.getParameter("leftArrow") != null) {
            param = request.getParameter("leftArrow");
        }
        if (request.getParameter("add") != null) {
            param = request.getParameter("add");
        }
        if (request.getParameter("sort") != null) {
            param = request.getParameter("sort");
        }

        Command command = commands.get(param);
        String page = command.execute(request, integerHashSet);

        request.getRequestDispatcher(page).forward(request, response);

    }

}