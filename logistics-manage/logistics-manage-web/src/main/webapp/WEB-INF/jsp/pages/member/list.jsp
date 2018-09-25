<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>会员列表-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/weadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/memberlist.js" charset="utf-8"></script>


    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-nav">
			<span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">员工管理</a>
        <a>
          <cite>员工列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-sm" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">&#x1002;</i></a>
</div>
<div class="weadmin-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 we-search">
            员工搜索：
            <div class="layui-inline">
                <input type="text" id="title"   name="sname" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
            <button class="layui-btn" data-type="reload" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <div class="weadmin-block anlydelete">
        <button class="layui-btn layui-btn-danger" data-type="getCheckData" ><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="WeAdminShow('添加用户','./add',600,400)"><i class="layui-icon"></i>添加</button>
        <span class="fr" style="line-height:40px">共有数据：88 条</span>
    </div>

    <table class="layui-hide" id="articleList" lay-filter="test"></table>

    <script type="text/html" id="operateTpl">
        <a class="layui-btn layui-btn-xs" title="编辑" lay-event="edit" href="javascript:;">
            <i class="layui-icon">&#xe642;</i>编辑
        </a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" title="删除" lay-event="delete" href="javascript:;">
            <i class="layui-icon">&#xe640;</i>删除
        </a>
    </script>

    <script type="text/html" id="dutiesTpl">
        <div class="layui-form">
            <button type="checkbox" class="layui-btn layui-btn-disabled " >"{{3==d.duties?'快递员':''}}{{2==d.duties?'司机':''}}{{1==d.duties?'管理':''}}{{4==d.duties?'下岗':''}}"</button>
        </div>
    </script>
</div>


</body>

</html>