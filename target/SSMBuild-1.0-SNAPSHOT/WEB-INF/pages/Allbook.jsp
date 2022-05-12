<%--
  Created by IntelliJ IDEA.
  User: Wangbaba
  Date: 2022/5/10
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Allbook</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddbook">新增</a>
        </div>
        <div class="col-md-6 column">
            <form action="${pageContext.request.contextPath}/book/findBybook" method="post" style="float: right" class="form-inline">
                <input type="text" class="form-control" name="bookname" placeholder="输入查询的书籍">
                <input type="submit" class="btn bt-primary" name="搜索">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名字</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="book" items="${requestScope.get('list')}">
                    <tr>
                        <td>${book.getBookid()}</td>
                        <td>${book.getBookname()}</td>
                        <td>${book.getBookcounts()}</td>
                        <td>${book.getDetail()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdatebook?id=${book.getBookid()}">修改</a>
                            |
                            <a href="${pageContext.request.contextPath}/book/Delbook/${book.getBookid()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
