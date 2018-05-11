package ua.training.controller.command;

import ua.training.model.IntegerHashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static ua.training.controller.Servlet.*;

public class View implements Command {
    public String execute(HttpServletRequest request, IntegerHashSet integerHashSet) {
        request.setAttribute(CURRENT_INDEX, integerHashSet.getCurrentIndex());
        request.setAttribute(CURRENT_VALUE, integerHashSet.getCurrentValue());
        request.setAttribute(AMOUNT_OF_NUMBERS, integerHashSet.getSize());
        return "/index.jsp";
    }
}
