package ua.training.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;


public class IntegerHashSet {

    Set<Integer> integerHashSet = new HashSet<>();
    int index = 0;
    public IntegerHashSet() {
        integerHashSet.add(29);
        integerHashSet.add(12);
        integerHashSet.add(1998);
        integerHashSet.add(19);
        integerHashSet.add(11);
        integerHashSet.add(1999);
        integerHashSet.add(13);
        integerHashSet.add(4);
        integerHashSet.add(1972);
        integerHashSet.add(15);

    }

    public int getCurrentIndex(){
        return index;
    }
    public Object getCurrentValue() {
        Object[] arr = integerHashSet.toArray();
        return arr[index];
    }
    public int nextIndex(){
        index++;
        return index;
    }
    public Object getNextValue(){
        Object[] arr = integerHashSet.toArray();
        return arr[index];
    }
    public int previousIndex(){
        index--;
        return index;
    }
    public Object getPreviousValue(){
        Object[] arr = integerHashSet.toArray();
        return arr[index];
    }
    public Object sortByTreeSet()  {

        Set<Integer> sortedHashSet = new TreeSet<>(integerHashSet);
        return sortedHashSet;//request.setAttribute("sortedArr", sortedHashSet.toString());
    }
    public int getSize(){
        return integerHashSet.size();
    }
    public boolean isAlreadyInSet(int number){
       return integerHashSet.contains(number);
    }
    public boolean addNumber(int element){
        return integerHashSet.add(element);
    }

    public String toString() {
        return "your integer hashset: {" + "size=" + getSize() + ": " + integerHashSet + '}'; }
}

