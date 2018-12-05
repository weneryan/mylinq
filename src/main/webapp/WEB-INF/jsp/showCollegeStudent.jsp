<%--
  Created by IntelliJ IDEA.
  User: weneryan
  Date: 2018/6/15
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>显示该学院包含的所有学生的名字</title>
</head>
<body>
    <table>
        <c:forEach var="stu" items="${students}">
            <tr>  <td>

                    SID=${stu.number}
                </td>
                <td>
                    SName=${stu.name}
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
