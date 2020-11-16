<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>商城首页</title>
    <script src="jquery-2.2.1.min.js" type="text/javascript"></script>
    <script>
        function addOrder() {
            $.ajax({
                url:'${pageContext.request.contextPath}/product/addOrder',
                datatype:'json',
                type:'post',
                success:function (data) {
                    $("#content").html(data)
                }
            })
        }

    </script>

</head>
<body>

    <c:forEach items="${sessionScope.cart}" var="entry">
        ID:${entry.key}&emsp;&emsp;
        数量：${entry.value}
        <br/>
    </c:forEach>

    <br/><br/>
    <input type="button" onclick="addOrder()" value="下单">
    <br/><br/>
    <div id="content" style="color: red"></div>
</body>
</html>