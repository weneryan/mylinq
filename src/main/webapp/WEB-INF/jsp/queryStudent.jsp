<%--
  Created by IntelliJ IDEA.
  User: weneryan
  Date: 2018/6/13
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>根据学号查学生的姓名</title>
</head>
<body>
    <form action="queryStudentByNumber">
        <table>
            <tr>
                <td>学号：</td>
                <td><input name="number" type="text"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"></td>
            </tr>

        </table>
    </form>
</body>
</html>
