<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyApp</title>
</head>
<body>

<div class="center">
    <div>
        <label>Current index: </label>
        <label> <c:out value="${requestScope.currentIndex}"/></label>
    </div>

    <div>
        <label>Current value: </label>
        <label>  <c:out value="${requestScope.currentValue}"/></label>
    </div>
</div>

<div class="east">
    <form action="Servlet" method="get">
        <input type="submit" name="view" value="View">
        <br>
        <label>Amount of numbers:</label>
        <label>  <c:out value="${requestScope.amountOfNumbers}"/></label>
        <br>

        <input type="submit" name="leftArrow" value="<-">
        <input type="submit" name="rightArrow" value="->">
    </form>

</div>

<div class="south">

    <form action="Servlet" method="get">

        <label>Add new element:</label>
        <input type="text" name="addNumber">
        <input type="submit" name="add" value="Add">
    </form>

    <form action="Servlet" method="get">

        <label>Sort array:</label>
        <label>  <c:out value="${requestScope.sortedHashSet}"/></label>
        <br>
        <input type="submit" name="sort" value="Sort">
    </form>
</div>


</body>
</html>
