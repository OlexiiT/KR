<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body id="menu">
        <table width="100%">
            <tr>
                <td width="60%"><h1>Task Scheduler</h1></td>
                <td width="20%" align="right" id="menu_hu">Hello, 
                    <c:out value="${sessionScope.username}" default="guest"></td>
                    <td width="20%" align="right" id="menu_act"><a href="<c:out value="${requestScope.link}">"><c:out value="${requestScope.linkText}"></a></td>
            </tr>
        </table>
    </body>
</html>

body {
    font: 16pt serif;
}

#body {
    padding: 2%;
}

#footer {
    left: 0;
    bottom: 0;
    position: fixed;
    padding: 10px;
    background: yellow;
    width: 100%;
    font: 12pt serif;
}

#menu {
    background: aqua;
}

#list {
    background: lime;
}

#menu_hu {
    padding: 20px;
    vertical-align: top;
}

#menu_act {
    padding: 20px;
    vertical-align: bottom;
}
