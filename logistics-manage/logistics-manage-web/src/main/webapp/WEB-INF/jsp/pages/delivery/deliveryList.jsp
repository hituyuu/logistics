<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>商品列表-后台管理系统-Admin 1.0</title>
    <meta name="Description" content="基于layUI数据表格操作"/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/weadmin.css">
    <%--<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/itemlist.js" charset="utf-8"></script>

    <!--<script type="text/javascript" src="../../static/js/admin.js"></script>-->
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        .layui-form-switch {
            width: 55px;
        }
        .layui-form-switch em {
            width: 40px;
        }
        .layui-form-onswitch i {
            left: 45px;
        }
        body{overflow-y: scroll;}
    </style>
</head>

<body>
<div class="weadmin-nav">
			<span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">收件管理</a>
        <a>
          <cite>收件列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-sm" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">&#x1002;</i></a>
</div>
<div class="weadmin-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 we-search" onsubmit="return false;">
            快件搜索：
            <div class="layui-inline">
                <input type="text" id="title" name="title" placeholder="请输入快件名称关键字" autocomplete="off" class="layui-input">
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="search" data-type="reload"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <div class="weadmin-block demoTable">
        <button id="batReceive" class="layui-btn " data-type="getCheckData"><i class="layui-icon">&#xe650;</i>批量接收</button>
    </div>
    <table id="demo"  class="layui-hide" lay-filter="test" >

    </table>



    <script type="text/html" id="operateTpl">
        <a title="编辑" onclick="WeAdminEdit('编辑','./edit', 2, 600, 400)" href="javascript:;">
            <i class="layui-icon">&#xe642;</i>
        </a>
        <a title="删除" href="javascript:;">
            <i class="layui-icon">&#xe640;</i>
        </a>
    </script>



</div>
</body>

<script type="text/html" id="titleTpl">
    <form class="layui-form">
        <input type="checkbox" value="{{d.status}}" id="itemStatus" lay-filter="status_switch"  lay-skin="switch" lay-text="正常|下架" {{1==d.status?'checked':''}}/>
    </form>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">确认收件</a>
</script>

<script type="text/javascript">
    //加载模块
layui.use(['form','jquery','table'],function(){
    var form=layui.form,
     table=layui.table,
            $=layui.$;


    //render表格数据
    var tableIns= table.render({
        elem:'#demo'
        ,id:'itemListTable'//此id为table的id,不是商品id
        ,url: '${pageContext.request.contextPath}/delivery/receiveList' //数据接口
        ,page: true //开启分页
        ,limit:5
        ,limits:[3,5,10]
        ,defaultToolbar:['filter','exports','print']
        ,cols: [[ //表头
            {checkbox: true}//该列表示checkbox选择框
            ,{field: 'orderId', title: '快递单号', width:120,sort:true,align:"center"}
            ,{field: 'beginAddr', title: '始发点', width:120,align:"center"}
            ,{field: 'beginTime', title: '始发点送出时间', width: 220,align:"center"}
            ,{field: 'endAddr', title: '终点', width:120,align:"center"}
            ,{field: 'prevNet', title: '上一站点', width:120,align:"center"}
            ,{field: 'prevSendTime', title: '上站点送出时间', width: 220,align:"center"}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:120,align:"center"}

        ]]
    })

    var  active = {
        reload: function(){
            var demoReload = $('#demoReload');

            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    key: {
                        id: demoReload.val()
                    }
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });


    function receive(orderIds,status) {
        layer.confirm("确认收件吗?",
            function(index){
                //console.log(id);
                layer.close(index);
                var indexopen = layer.msg('正在更新数据,请稍后', {icon: 16,time: 0,shade: [0.5 , '#000' , true]});
                $.ajax({
                    url:'${pageContext.request.contextPath}/delivery/update',
                    data:'orderIds='+orderIds+"&status="+status,
                    method:'get',
                    success:function (res) {
                        if(res.success){
                            layer.msg(res.message);
                            layer.close(indexopen);
                            location.href="${pageContext.request.contextPath}/delivery/deliveryList";

                        }else {
                            layer.msg(res.message);
                            layer.close(indexopen);
                        }
                    }
                })

        });
    }
    //监听接收事件
    table.on('tool(test)', function(obj){
        var data = obj.data;
        console.log(obj);
        var orderId= data.orderId;
        var orderIds=[orderId];
        var status=data.status;
        console.log(orderId);
        receive(orderIds,status);


    });

    //监听批量接收
    $("#batReceive").on("click",function(){
        var checkStatus = table.checkStatus('itemListTable')
            ,data = checkStatus.data
            ,orderIds=[]
            ,status=data[0].status;

        console.log(data);

        for (var i=0;i<data.length;i++){
             var orderId=data[i].orderId;
             orderIds.push(orderId);
        }
        console.log(orderIds);
        console.log(status);
        receive(orderIds,status);
    })




});
</script>
</html>