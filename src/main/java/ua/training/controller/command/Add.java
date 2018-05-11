package ua.training.controller.command;


import ua.training.model.IntegerHashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import static ua.training.controller.Servlet.*;

public class Add implements Command {
    public String execute(HttpServletRequest request, IntegerHashSet integerHashSet)  {
        if(request.getParameter("add")!=null){
            int number = Integer.parseInt(request.getParameter("addNumber"));
                if (!integerHashSet.isAlreadyInSet(number)) {
                    integerHashSet.addNumber(number);
                    request.setAttribute(AMOUNT_OF_NUMBERS, integerHashSet.getSize());
                    System.out.println(integerHashSet.getSize());
                    //request.setAttribute(SORTED_HASHSET, integerHashSet.sortByTreeSet().toString());


        }
    }
        return "/index.jsp";
    }

}

