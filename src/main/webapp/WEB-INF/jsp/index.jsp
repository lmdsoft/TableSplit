<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>分表测试</title>
</head>
<body>


<table border="1" style="margin: auto" width="300px">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <tbody>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.sex}</td>
            <td>${item.age}</td>
            <td> <a href="/">删除</a> <a href="/">修改</a> </td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<div>
<p>总共有${pageInfo.pages}页，总共有${pageInfo.total}条记录</p>
<p>当前是第${pageInfo.pageNum}页</p>
<c:forEach begin="1" end="${pageInfo.pages}" var="p">
<a href="/?page=${p}">第${p}页</a>
</c:forEach>
</div>

</body>
</html>
