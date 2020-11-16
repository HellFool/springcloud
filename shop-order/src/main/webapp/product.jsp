<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>商城首页</title>
    <script src="jquery-2.2.1.min.js" type="text/javascript"></script>
    <script>
        function addCart(id) {
            $.ajax({
                url:'${pageContext.request.contextPath}/cart/addCart',
                data:{id:id},
                datatype:'json',
                type:'post',
                success:function () {

                }
            })
        }

    </script>

</head>
<body>

    <c:forEach items="${sessionScope.list}" var="pro">
        ID:${pro.productId}&emsp;&emsp;
        名称：${pro.productName}&emsp;&emsp;
        价格：${pro.productPrice}
        <input type="button" onclick="addCart('${pro.productId}')" value="购买">
        <br/>
    </c:forEach>

    <a href="${pageContext.request.contextPath}/cart.jsp">购物车</a>

</body>
</html>