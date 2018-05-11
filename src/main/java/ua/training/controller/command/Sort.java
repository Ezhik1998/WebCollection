package ua.training.controller.command;

import ua.training.model.IntegerHashSet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.List;

import static ua.training.controller.Servlet.*;

public class Sort implements Command {
    public String execute(HttpServletRequest request, IntegerHashSet integerHashSet) {
        //integerHashSet.sortByTreeSet();
        request.setAttribute(SORTED_HASHSET, integerHashSet.sortByTreeSet().toString());

        return "/index.jsp";
    }
}