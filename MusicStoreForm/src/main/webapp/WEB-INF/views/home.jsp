<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <center>
            <h1>Hello </h1>
            <p>Enter Song Details</p>
            <form:form method="POST" commandName="songDetForm" action="output.html">
                <table style="appearance:dialog ">
                    <tr>
                        <td>Language</td>
                        <td><form:input path="language" /></td>
                    </tr>
                    <tr>
                        <td>Song Type</td>
                        <td><form:input path="songType"/></td>
                    </tr>
                    <tr>
                        <td>Song Name</td>
                        <td><form:input path="songName"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><form:button name="play" value="Play">Play</form:button></td>
                        
                    </tr>
                </table>
           </form:form>
        </center>
    </body>
</html>