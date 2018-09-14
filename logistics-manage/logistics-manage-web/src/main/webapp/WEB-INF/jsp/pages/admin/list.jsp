<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>管理员列表-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
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
<div class="weadmin-nav">
			<span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">管理员管理</a>
        <a>
          <cite>快件跟踪</cite></a>
      </span>
    <a class="layui-btn layui-btn-sm" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="weadmin-body">
    <div class="layui-row">
    </div>

        <%--查询单条记录--%>
            <div class="demoTable">
                <div class="layui-inline">
                    <input class="layui-input" name="gid" id="demoReload"  placeholder="请输入订单号" autocomplete="off">
                </div>
                <button class="layui-btn"  data-type="reload">查询</button>
            </div>


    <div class="weadmin-block">
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="javascript:location.href='${pageContext.request.contextPath }/pages/admin/add'"><i class="layui-icon"></i>添加</button>
        <span class="fr" style="line-height:40px"></span>
    </div>
    <table class="layui-table" id="demo" lay-filter="test">

    </table>

   <%-- <div class="page">
        <div>
            <a class="prev" href="">&lt;&lt;</a>
            <a class="num" href="">1</a>
            <span class="current">2</span>
            <a class="num" href="">3</a>
            <a class="num" href="">489</a>
            <a class="next" href="">&gt;&gt;</a>
        </div>
    </div>--%>
</div>
<script type="text/html" id="titleTpl">
    <form class="layui-form">
        <input type="checkbox" value="{{d.status}}"  id="itemStatus" lay-filter="status_switch"  lay-skin="switch" lay-text="未送|已送" {{0==d.status?'checked':''}}/>
    </form>
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">物流</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/javascript">
    //加载模块
    layui.use(['form','jquery','table','layer'],function(){
        var form=layui.form, table=layui.table, layer=layui.layer,$=layui.$;


        //render表格数据
        var tableIns= table.render({
            elem:'#demo'
            ,url: '${pageContext.request.contextPath}/items' //数据接口
            ,page: true //开启分页
            ,defaultToolbar:['filter','exports','print']
            ,limit:5
            ,limits:[5,10,15,20]
            ,cols: [[ //表头
                {checkbox: true}//该列表示checkbox选择框
                ,{field: 'gid', title: '订单编号', width: 120}
                ,{field: 'sname', title: '寄件人', width: 120}
                ,{field: 'saddress', title: '始发地', width: 120}
                ,{field: 'gname', title: '收件人', width: 120}
                ,{field: 'gaddress', title: '目的地', width: 120}
                ,{field: 'status', title: '状态',templet:'#titleTpl', width: 120}
                ,{title:'操作',toolbar:'#barDemo'}

            ]]
            /*,id: 'testReload'*/
        });

        var  active = {
            reload: function(){
                var demoReload = $('#demoReload');
               /* var     value=demoReload.val();*/

                //执行重载
                tableIns.reload(/*'testReload',*/ {
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    ,where: {
                        /*key: {
                            gid:demoReload.val()
                        }*/
                        gid:demoReload.val()
                    }
                });
            }
        };


        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');        //$(this)代表目前获得的jquery对象 .data('type') 获取属性data-type的值
            active[type] ? active[type].call(this) : '';    //半段active中是否有获得者资格字段,有则执行该函数,或者什么也不做
        });

        //监听工具条
        table.on('tool(test)', function(obj){
            var data = obj.data;//获取行数据
            /*obj.event 获得监听事件*/
            if(obj.event === 'detail'){
                layer.alert(data.saddress+"所属网点揽件"+"<br/>"+
                        "到达"+ data.node1+"时间:"+data.time1+"<br/>"+
                        "到达"+ data.city1+"时间:"+data.time2+"<br/>"+
                        "到达"+ data.center1+"时间:"+data.time3+"<br/>"+
                        "到达"+ data.center2+"时间:"+data.time4+"<br/>"+
                        "到达"+data.city2+"时间:"+data.time5+"<br/>"+
                        "到达"+ data.node2+"时间:"+data.time6+"<br/>"+
                        "目的地:"+data.gaddress

                );
            } else if(obj.event === 'del'){
             var result=confirm('真的删除行么'/*, function(){
                    obj.del();

                    layer.close(index);
                }*/)
                     if(result){
                         var gid=data.gid;
                         location.href="${pageContext.request.contextPath}/delete/update?gid="+gid;
                     }else{
                         layer.clone(layer.index);
                     }
                ;
            } else if(obj.event === 'edit'){
               /* layer.alert('编辑行：<br>'+ JSON.stringify(data))*/
              /*  layer.open({
                    type: 2,
                    offset: ['100px', '500px'],
                    area: 'auto',
                    maxWidth:'500px',
                    content: './add'//这里content是一个普通的String
                });*/
                var index = layer.open({
                    type: 2,
                    content: '${pageContext.request.contextPath}/update/toUpdate?gid='+data.gid,
                   area: ['80%', '80%'],
                    maxmin: true
                });
                layer.full(index);

            }
        });


        //switch绑定事件
       /* form.on('switch(status_switch)',function(data){

            layer.confirm('确认已送达？',
                    {
                        btn: ['送达','未送达'] //按钮
                    },
                    function(){
                        layer.msg('快件已经送达', {icon: 1});
                        console.log("已送达")

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


                        /!* tableIns.reload({
                         where:{

                         },
                         page:{
                         curr:page
                         }
                         });*!/
                    },
                    function() {
                        layer.msg('快件未送达',
                                {
                                    time: 2000, //2s后自动关闭
                                    btn: '收到信息'
                                }
                        )
                        console.log("快件未送达");
                        form.render();
                    }
            );



            var status=$("#itemStatus").val();
            console.log(status);
            console.log(data);
        });*/

   /*     $("#delete").on('click',function(){//jquery监听点击删除按钮事件
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

        });*/

       /* var $mylist = $("#demo").next('.layui-table-view').find('table.layui-table');
        $mylist.dblclick(function(event){
            console.log($(event.target).closest("tr")[0]);
        });*/


        /*table.on('rowDouble(test)', function(obj){
            console.log(obj.value); //得到修改后的值
            console.log(obj.field); //当前编辑的字段名
            console.log(obj.data); //所在行的所有相关数据
        });*/

    })

</script>
</body>

</html>