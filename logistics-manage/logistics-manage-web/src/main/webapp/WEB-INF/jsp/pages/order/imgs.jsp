<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加订单-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
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
    <form class="layui-form">

        <div class="layui-form-item layui-form-text">
            <label for="itemDesc" class="layui-form-label">
                <span class="we-red">*</span>收件人
            </label>

            <div class="layui-input-inline">
                <textarea id="itemDesc" name="itemDesc" placeholder="请输入" class="layui-textarea"
                          style="display: none"></textarea>
            </div>
        </div>

    </form>
</div>
<script>
    layui.extend({
        admin: '{/}../../static/js/admin'
    });
    layui.use(['form', 'admin', 'jquery', 'table', 'layer', 'layedit','laydate'], function () {
        var form = layui.form,
                admin = layui.admin,
                $ = layui.jquery,
                table = layui.table,
                layer = layui.layer,
                laydate = layui.laydate,
                layedit = layui.layedit;
                layedit.build('itemDesc',{
                   // height:100,
                    uploadImage:{
                        url:'../../uploadimg',
                        type:'post'
                    }
                });

        //执行一个laydate实例
        laydate.render({
            elem: '#date' //指定元素
        });

        //自定义验证规则
//        form.verify({
//            nikename: function (value) {
//                if (value.length < 5) {
//                    return '昵称至少得5个字符啊';
//                }
//            },
//            pass: [/(.+){6,12}$/, '密码必须6到12位'],
//            repass: function (value) {
//                if ($('#L_pass').val() != $('#L_repass').val()) {
//                    return '两次密码不一致';
//                }
//            }
//        });

        //监听提交
        form.on('submit(add)', function (data) {
            var goodsView = data.field;
            console.log(goodsView);
            // layer.msg(JSON.stringify(data.field));
            //发异步，把数据提交给php
            $.ajax({
                url: '../../adsd/goods',
                data: goodsView,
                type: 'post',
                dataType: 'text',
                success: function () {
                    layer.alert("增加成功", {
                                icon: 6
                            },
                            function () {
                                // 获得frame索引
                                var index = parent.layer.getFrameIndex(window.name);
                                //关闭当前frame
                                parent.layer.close(index);
                                parent.location.reload();//添加数据后刷新页面
                            });
                }
            });
            // $('.layui-laypage-btn').click();
            return false;
        });

        var num = 3;

        window.addTable = function () {
            var tableHtml = "";
            tableHtml += '<tr id="tr' + num + '">' +
                    '<td>' + num + '</td>' +
                    '<td><div class="layui-input-inline"><input type="text" name="canshu1" class="layui-input"></div></td>' +
                    '<td><div class="layui-input-inline"><input type="text" name="canshu2" class="layui-input"></div></td>' +
                    '<td><div class="layui-input-inline"><input type="text" name="canshu3" class="layui-input"></div></td>' +
                    '<td><div class="layui-input-inline"><input type="text" name="canshu4" class="layui-input"></div></td>' +
                    '<td><a style="cursor: pointer; color: blue;" onclick="removeTr(' + num + ')">删除</a>' +
                    '</td>' +
                    '</tr>';

            var elements = $("#myTable").children().length; //表示id为“mtTable”的标签下的子标签的个数

            $("#myTable").children().eq(elements - 1).after(tableHtml); //在表头之后添加空白行
            num++;
        }
        //删除行
        function removeTr(trNum) {
            $("#tr" + trNum).remove();
        }

    });
</script>
</body>

</html>