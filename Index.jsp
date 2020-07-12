<%-- 
    Document   : Index
    Created on : Jul 9, 2020, 10:04:20 AM
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="layouts/head.jsp">
            <jsp:param name="Tittle" value="Hello World"></jsp:param>
        </jsp:include>
    </head>
    <body>
        <div class='container pt-4'>
            <jsp:include page="layouts/navbar.jsp"></jsp:include>
            <div class="row">
                <div class="col-12">
                    <table class="table table-responsive table-hover">
                        <thead>
                            <tr>
                                <td>ID</td>
                                <td>Name</td>
                                <td>Category</td>
                                <td>Qty</td>
                                <td>Expired At</td>
                                <td>Action</td>
                            </tr> 
                        </thead>
                        <tbody>
                        <c:forEach items="${data}" var="item">
                            <tr>
                                <td><p>${item.id}</p></td>
                                <td><p>${item.name}</p></td>
                                <td><p>${item.category}</p></td>
                                <td><p>${item.qty}</p></td>
                                <td><p>${item.expired_at}</p></td>
                                <td>
                                    <a class="btn btn-sm btn-primary"
                                       href="#">Edit</a>
                                    <a class="btn btn-sm btn-danger"
                                       href="#">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <jsp:include page="layouts/footer.jsp"></jsp:include>
        </div>
            <jsp:include page="layouts/scripts.jsp"></jsp:include>
    </body>
</html>
