<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加员工-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/weadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/memberlist.js" charset="utf-8"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.all.js" charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-body">
    <form class="layui-form">
        <div class="layui-form-item">
            <label for="L_username" class="layui-form-label">
                <span class="we-red">*</span>姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_username" name="sname" lay-verify="required|sname" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="L_idcard" class="layui-form-label">
                <span class="we-red">*</span>身份证
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_idcard" name="idcard" lay-verify="required|idcard" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_pass" class="layui-form-label">
                <span class="we-red">*</span>密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="L_pass" name="password" lay-verify="required|password" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
                <span class="we-red">*</span>确认密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="L_repass" name="repass" lay-verify="required|repass" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_phone" class="layui-form-label">
                <span class="we-red">*</span>电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_phone" name="phone" lay-verify="required|phone" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
        <label for="L_jobnumber" class="layui-form-label">
            <span class="we-red">*</span>工号
        </label>
        <div class="layui-input-inline">
            <input type="text" id="L_jobnumber" name="jobnumber" lay-verify="required|jobnumber" autocomplete="" class="layui-input">
        </div>
    </div>
        <div class="layui-form-item">
            <label for="L_did" class="layui-form-label">
                <span class="we-red">*</span>负责网点
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_did" name="did" lay-verify="required|did" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_department" class="layui-form-label">
                <span class="we-red">*</span>部门
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_department" name="department" lay-verify="required|department" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_duties" class="layui-form-label">
                <span class="we-red">*</span>职务(1管理2司机3快递)
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_duties" name="duties" lay-verify="required|duties" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_education" class="layui-form-label">
                <span class="we-red">*</span>学历
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_education" name="education" lay-verify="required|education" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_nativeplace" class="layui-form-label">
                <span class="we-red">*</span>籍贯
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_nativeplace" name="nativeplace" lay-verify="required|nativeplace" autocomplete="" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <button class="layui-btn" lay-filter="add" lay-submit="">确定</button>
        </div>
    </form>
</div>
<script type="text/javascript">
    layui.use(['form', 'jquery', 'layer'], function () {
        var form = layui.form,
                $ = layui.jquery,
                layer = layui.layer;
        form.on('submit(add)', function (data) {
            $.ajax({
                url: "${pageContext.request.contextPath}/staff/add",
                method: "post",
                data: data.field,
                success: function (d) {

                },
                dateType: "json"
            });
            var index = top.layer.msg('正在处理了呢，请一定要耐心等候!', {icon: 16, time: false, shade: 0.8});
            setTimeout(function () {
                top.layer.close(index);
                top.layer.msg("添加成功！");
                layer.closeAll("iframe");
                //刷新父页面
                parent.location.reload();
            }, 200);
            return false;
        });
    });



</script>
</body>


</html>