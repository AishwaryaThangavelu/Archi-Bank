<%-- 
    Document   : output
    Created on : 16 Jun, 2013, 8:52:43 AM
    Author     : Aishu
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Output Page</title>
    </head>
    <body>
        <center>
            <table border="1">
                <h1>${iMusicService.play()}</h1>
                <tr>
                    <td><b>Language</b></td>
                    <td>${songDetails.language}</td>
                </tr>
                <tr>
                    <td><b>Song Type</b></td>
                    <td>${songDetails.songType}</td>
                </tr>    
                <tr>
                    <td><b>Song Name</b></td>
                    <td>${songDetails.songName}</td>
                </tr>
           </table>
        </center>       
    </body>
</html>
