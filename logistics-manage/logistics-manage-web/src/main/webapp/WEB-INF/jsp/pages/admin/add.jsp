<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加管理员-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/weadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-body">
    <form class="layui-form" action="${pageContext.request.contextPath}/save/add">
        <div class="layui-form-item">
            <label class="layui-form-label">订单号</label>
            <div class="layui-input-block">
                <input type="text" name="gid" required  lay-verify="required" placeholder="请输入订单编号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">寄件人</label>
            <div class="layui-input-inline">
                <input type="text" name="sname" required lay-verify="required" placeholder="请输入寄件人姓名" autocomplete="off" class="layui-input">
            </div>
         </div>
        <div class="layui-form-item">
            <label class="layui-form-label">寄件地址</label>
            <div class="layui-input-inline">
                <input type="text" name="saddress" required lay-verify="required" placeholder="请输入寄件地址" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">当前网点</label>
            <div class="layui-input-inline">
                <input type="text" name="node1" required lay-verify="required" placeholder="请输入网点名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">到达本网点时间</label>
            <div class="layui-input-inline">
                <input type="date" name="time1" required lay-verify="required" placeholder="请选择时间" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">收件地址</label>
            <div class="layui-input-inline">
                <input type="text" name="gaddress" required lay-verify="required" placeholder="请输入收件人的姓名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">收件人</label>
            <div class="layui-input-inline">
                <input type="text" name="gname" required lay-verify="required" placeholder="请输入收件人姓名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">快件状态码</label>
            <div class="layui-input-inline">
                <input type="text" name="status" required lay-verify="required" placeholder="请输入0或1" autocomplete="off" class="layui-input">
            </div>
        </div>




        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type ="submit"  >提交到后台</button>

            </div>
        </div>
    </form>
</div>
<script type="text/javascript">
    layui.extend({
        admin: '{/}../../static/js/admin'
    });
    layui.use(['form','layer','admin','jquery'], function(){
        var form = layui.form,
            admin = layui.admin,
            layer = layui.layer;
             $=layui.$;
        $(function(){


        });
        //自定义验证规则
       /* form.verify({
            nikename: function(value){
                if(value.length < 5){
                    return '昵称至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
        });*/

        //监听提交
        /*form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
        });*/
    });
</script>
</body>

</html>