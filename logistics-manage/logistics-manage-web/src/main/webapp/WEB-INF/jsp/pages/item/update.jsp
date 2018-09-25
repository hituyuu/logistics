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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/treeselect.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/treeselect.js" charset="utf-8"></script>--%>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-body">
    <form class="layui-form" action="${pageContext.request.contextPath}/update.do">
        <%--<div class="layui-form-item">--%>
            <%--<label for="cid" class="layui-form-label">--%>
                <%--<span class="we-red">*</span>商品类别--%>
            <%--</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="cid" lay-filter="demo" autocomplete="off" class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>

        <div class="layui-form-item">
            <label for="servicecompy" class="layui-form-label">
                <span class="we-red">*</span>服务公司
            </label>
            <div class="layui-input-inline">
                <input type="text" id="servicecompy" name="servicecompy" value="${servers.servicecompy}" required="" lay-verify="required" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label for="freight" class="layui-form-label">运费</label>
            <div class="layui-input-block">
                <input placeholder="运费" id="freight" name="freight" value="${servers.freight}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="days" class="layui-form-label">
                <span class="we-red">*</span>天数
            </label>
            <div class="layui-input-inline">
                <input type="text" id="days" name="days" value="${servers.days}" required="" lay-verify="number" autocomplete="off"
                       class="layui-input">

            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label for="num" class="layui-form-label">--%>
                <%--<span class="we-red">*</span>商品库存--%>
            <%--</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="num" name="num" required="" lay-verify="number" autocomplete="off"--%>
                       <%--class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="layui-form-item">--%>
            <%--<label for="barcode" class="layui-form-label">--%>
                <%--<span class="we-red">*</span>条形码--%>
            <%--</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="barcode" name="barcode" required="" lay-verify="required" autocomplete="off"--%>
                       <%--class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="layui-form-item layui-form-text">--%>
            <%--<label for="itemDesc" class="layui-form-label">描述</label>--%>
            <%--<div class="layui-input-block">--%>
                <%--&lt;%&ndash;第一步&ndash;%&gt;--%>
                <%--<textarea id="itemDesc" name="itemDesc" class="layui-textarea" style="display: none"></textarea>--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label for="eidt" class="layui-form-label">
            </label>
            <button id="eidt" class="layui-btn" lay-filter="eidt" lay-submit="">编辑</button>
        </div>
    </form>
</div>
<script>
    layui.extend({
        admin: '{/}../../static/js/admin',
        treeselect: '{/}../../static/js/treeselect'
    });
    layui.use(['form', 'admin','layer', 'layedit', 'treeselect'], function (obj) {
        var form = layui.form,
//            admin = layui.admin,
            layer = layui.layer,
            layedit = layui.layedit,
            treeselect = layui.treeselect;
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        //初始化树形下拉框
//        treeselect.render(
//            {
//                elem: "#cid",
//                data: [{ //节点
//                    name: '父节点1',
//                    spread: false
//                    ,children: [{
//                        name: '子节点11'
//                    },{
//                        name: '子节点12'
//                    }]
//                },{
//                    name:'父节点2',
//                    spread:false
//                    ,children:[{
//                        name: '子节点21'
//                    }]
//                }],
//                method: "GET"
//            });
//
//        //第二步
//        //初始化富文本编辑器
//        layedit.build('itemDesc', {
//            height: 100,//设置编辑器高度
//            uploadImage:{
//                url:'../../uploadImage',
//                type:'post'
//            }
//        });

        //监听提交
        form.on('tool(eidt)', function (obj) {
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr- 的DOM对象
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("修改成功", {
                icon: 6
            }, function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return true;
        });
        if(layEvent === 'eidt'){ //编辑
            //do something

            //同步更新缓存对应的值
            obj.({
                servicecompy: '${servicecompy}',
                freight: '${freight}',
                days:'${days}'
            });
        }

    });

</script>
</body>

</html>