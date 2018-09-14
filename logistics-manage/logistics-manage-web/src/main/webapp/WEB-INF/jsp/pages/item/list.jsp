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
        <a href="">商品管理</a>
        <a>
          <cite>商品列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-sm" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">&#x1002;</i></a>
</div>
<div class="weadmin-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 we-search" onsubmit="return false;">
            商品搜索：
            <div class="layui-inline">
                <input type="text" id="title" name="title" placeholder="请输入商品名称关键字" autocomplete="off" class="layui-input">
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="search" data-type="reload"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <div class="weadmin-block demoTable">
        <button id="delete" class="layui-btn layui-btn-danger" data-type="getCheckData"><i class="layui-icon">&#xe640;</i>批量删除</button>
        <button class="layui-btn" onclick="WeAdminShow('添加商品','./add',600,500)"><i class="layui-icon">&#xe61f;</i>添加</button>
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
<%--
<script type="text/javascript" >
    layui.use('table',function(){
        var table=layui.table;

       var tableIns= table.render({
             elem:'#demo'
            ,id:'itemListTable'//此id为table的id,不是商品id
            ,url: '${pageContext.request.contextPath}/list' //数据接口
            ,page: true //开启分页
            ,defaultToolbar:['filter','exports','print']
            ,cols: [[ //表头
             {checkbox: true}//该列表示checkbox选择框
            ,{field: 'id', title: '商品编号', width:100,sort:true}
            ,{field: 'title', title: '商品名称', width:150}
            ,{field: 'catName', title: '商品分类', width: 150,align:"center"}
            ,{field: 'sellPoint', title: '卖点', width:200}
            ,{field: 'price', title: '价格', width:150,sort:true}
            ,{field: 'num', title: '库存', width: 100}
            ,{field: 'status', title: '商品状态', width: 150,templet:'#titleTpl'}

        ]]
        })
    })


</script>
--%>
<script type="text/html" id="titleTpl">
    <form class="layui-form">
        <input type="checkbox" value="{{d.status}}" id="itemStatus" lay-filter="status_switch"  lay-skin="switch" lay-text="正常|下架" {{1==d.status?'checked':''}}/>
    </form>
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
        ,url: '${pageContext.request.contextPath}/list' //数据接口
        ,page: true //开启分页
        ,defaultToolbar:['filter','exports','print']
        ,cols: [[ //表头
            {checkbox: true}//该列表示checkbox选择框
            ,{field: 'id', title: '商品编号', width:100,sort:true}
            ,{field: 'title', title: '商品名称', width:150}
            ,{field: 'catName', title: '商品分类', width: 150,align:"center"}
            ,{field: 'sellPoint', title: '卖点', width:200}
            ,{field: 'price', title: '价格', width:150,sort:true}
            ,{field: 'num', title: '库存', width: 100}
            ,{field: 'status', title: '商品状态', width: 150,templet:'#titleTpl'}

        ]]
    })

    //switch绑定事件
    form.on('switch(status_switch)',function(data){

        layer.confirm('确认下架吗？',
            {
                btn: ['下架','不下架'] //按钮
            },
            function(){
                layer.msg('产品下架了', {icon: 1});
                console.log("下架了")

                //获取当前行的产品信息,如id
                //var p1= $("#itemStatus").parent().parent().parent().prev().prev().prev().prev().prev().prev().children();
                var p1= $(".layui-unselect").parent().parent().parent().prev().prev().prev().prev().prev().prev().children();
                var id=p1.text();
                console.log(id);

                //获取当前分页页码:
                var page =tableIns.config.page.curr;
                console.log(page);
                //获取当前的状态值
                var status=$("#itemStatus").val();
                console.log(status);

                //window.location.href="${pageContext.request.contextPath}/update?id="+id+"&status="+status;
                $.ajax({
                 url:"${pageContext.request.contextPath}/update",
                 data:"id="+id+"&status="+status,
                 type:"post",
                 success:function(res){
                     if(res=1){
                         //如果成功,则重载表格
                         tableIns.reload({
                             where:{

                             },
                             page:{
                                 curr:page
                             }
                         });
                     }

                 }

                 });


               /* tableIns.reload({
                    where:{

                    },
                    page:{
                        curr:page
                    }
                });*/
            },
            function() {
                layer.msg('产品不会下架',
                        {
                            time: 2000, //2s后自动关闭
                            btn: '明白了'
                        }
                )
                console.log("产品不会下架");
               form.render();
            }
        );



        var status=$("#itemStatus").val();
        console.log(status);
        console.log(data);
    });

    $("#delete").on('click',function(){//jquery监听点击删除按钮事件
        var checkStatus=table.checkStatus('itemListTable');
        //上述是获取table中被选中的行的所有信息,包括商品数据和其他信息
        console.log(checkStatus);
        console.log("所选行的数据的id为:");
        console.log(checkStatus.data[0].id);
        console.log("所选行的数据的title为:");
        console.log(checkStatus.data[0].title);
        console.log("所选行的数据的status为:");
        console.log(checkStatus.data[0].status);
        console.log(checkStatus.isAll);

    })

    var $mylist = $("#demo").next('.layui-table-view').find('table.layui-table');
    $mylist.dblclick(function(event){
        console.log($(event.target).closest("tr")[0]);
    });


    table.on('rowDouble(test)', function(obj){
        console.log(obj.value); //得到修改后的值
        console.log(obj.field); //当前编辑的字段名
        console.log(obj.data); //所在行的所有相关数据
    });

})

</script>
</html>