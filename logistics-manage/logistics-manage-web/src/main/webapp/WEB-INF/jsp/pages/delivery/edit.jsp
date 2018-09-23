<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<br/>
<br/>

<form id="form1" class="layui-form" >
    <div class="layui-form-item">
        <label class="layui-form-label">运单号</label>
        <div class="layui-input-block">
            <input type="text" name="orderId"  value="${deliveryPO.orderId}" readonly="true" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">下一站点:</label>
        <div class="layui-input-block">
        <select name="nextNet" >
            <option value="江干">江干</option>
            <option value="上海">上海</option>
            <option value="南京">南京</option>
            <option value="南昌">南昌</option>
        </select>
        </div>
    </div>
</form>

</body>
</html>
