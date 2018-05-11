package ua.training.controller.command;

import ua.training.model.IntegerHashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface Command {
    String execute(HttpServletRequest request, IntegerHashSet integerHashSet) ;
}

