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
        <button id="batReceive" class="layui-btn " data-type="getCheckData"><i class="layui-icon">&#xe650;</i>批量取消</button>
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

<script type="text/html" id="unbarDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">送往下站</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit2">快递员派件</a>
</script>

<script type="text/javascript">
//加载模块
layui.use(['form','jquery','table'],function(){
    var form=layui.form,
     table=layui.table,
            $=layui.$;


    //render表格数据
    var tableIns= table.render(
        {
            elem:'#demo'
            ,id:'itemListTable'//此id为table的id,不是商品id
            ,url: '${pageContext.request.contextPath}/delivery/receiveList?status=1' //数据接口
            ,loading:true
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
                ,{fixed: 'right', title:'操作', toolbar: '#unbarDemo', width:220,align:"center"}
            ]]
            ,done:function() {
                layer.close(index0)
            }
        }
    )


    //定义表格重载对象,注意此处只是定义,不被调用的话并不是执行
    var  active = {             //对象名是active
        reload: function(){     //有reload属性,属性是一个方法
            var demoReload = $('#demoReload');
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: tableIns.config.curr     // 获取当前页,重新从当前页开始
                }
                ,where: {
                    id: demoReload.val()    //此处的键值对会自动添加到tabkle.render()里的url参数后面
                }
            });
        }
    };

    //真正调用表格重载的方法在此
    $('.demoTable .layui-btn').on('click', function(){  //两个类选项器构成的后代选择器
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });


    //定义一个send()方法,只是定义,不是使用
    function send(orderId,status,obj) {
        if(obj.event === 'edit'){
            layer.open({
                type:2,
                title:"选择下一站点",
                area:['50%','80%'],
                shade: [0.8, '#393D49'],
                content:'${pageContext.request.contextPath}/delivery/selectByOrderId?orderId='+orderId+"&status="+status,
                btn:['确认','取消'],
                yes: function(index, layero){       //点击确定按钮的回调方法
                    var data2 = layer.getChildFrame("form",index);
                    var data3 = $(data2).serialize();
                    var param = decodeURIComponent(data3,true);    //重新编译,中文正常显示
                    console.log(data3);
                    console.log(param);
                    layer.close(index); //如果设定了yes回调,需进行手工关闭弹出层

                    // 利用layui的弹出层遮罩页面,防止客户再次点击
                    var index2 = layer.msg("数据提交中",{icon: 16,time: 0,shade: [0.5 , '#000' , true]});
                    // 提交数据到后台
                    $.post(
                        //url
                        '${pageContext.request.contextPath}/delivery/send',
                        //data
                        param,
                        //success
                        function (res) {
                            layer.msg(res.message);
                            layer.close(index2);    // 关闭遮罩层弹窗
                            window.location.reload(true);
                        }
                    )

                },
                btnAlign:'c',
            });
        } else{
            layer.confirm('确认快递小哥送件吗', function(index){


                //送件
                layer.close(index);
                layer.msg("已通知小哥送件");
            });
        }

    }
    //监听接收事件
    table.on('tool(test)', function(obj){
        var data = obj.data;
        console.log(obj);
        var orderId= data.orderId;
        var orderIds=[orderId];
        var status=data.status;
        console.log(orderId);
        send(orderId,status,obj);


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
        send(orderIds,status);
    })




});
</script>
</html>