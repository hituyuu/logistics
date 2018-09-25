//引入admin.js(webapp/static/js/admin.js)
//itemlist.js(webapp/static/js/itemlist.js)
layui.extend({
    admin: '{/}../../static/js/admin'
});
//按需加载admin.js
layui.use(['admin', 'jquery', 'table','layer'], function () {
    //初始化变量
    var
        admin=layui.admin,
        $ = layui.jquery,
        table = layui.table,
        layer = layui.layer;
    //对表格进行渲染
    table.render({
        //什么是表格属性：page,elem,url,cols
        //什么是列属性：type,field,title
        //开启分页
        page: true,
        //渲染的容器是谁
        elem: '#articleList',
        //异步提交请求给后台返回JSON
        url: '../../staff',
        //要显示的表头是什么
        cols: [[
            {type: 'checkbox'},
            {field: 'id', title: '员工编号'},
            {field: 'sname', title: '员工姓名'},
            {field: 'idcard', title: '身份证'},
            {field: 'phone', title: '电话'},
            {field: 'jobnumber', title: '工号'},
            {field: 'did', title: '负责网点'},
            {field: 'department', title: '部门'},
            {field: 'duties', title: '职务状态',toolbar:'#dutiesTpl'},
            {field: 'education', title: '学历'},
            {field: 'nativeplace', title: '籍贯'},
            {field:'',title:'操作',toolbar:'#operateTpl'}
        ]]

    });


    //
    var active = {
        getCheckData: function () {
            //你点击了"批量删除"
            //为了获取到被选中的行
            var data = table.checkStatus("articleList").data;
            if (data.length > 0) {
                //确认框
                //至少选中一行
                //为了获得所有选中行的id
                var ids = [];
                for (var i = 0; i < data.length; i++) {
                    ids.push(data[i].id);
                }
                //异步提交到后台 ids
                $.post(
                    '../../staff/batch',
                    {'ids[]': ids},
                    function (data) {
                        //至少删除一条记录
                        if (data > 0) {
                            //停留在原来页面刷新
                            $('.layui-laypage-btn').click();//主动触发点击事件
                            layer.msg("恭喜，删除成功！", {icon: 1});
                        }

                    }
                );
            } else {
                //没有选中
                layer.msg("请选择至少一行后再批量删除！", {icon: 2});
            }
        },
        reload:function(){
            //模糊查询，提交一个异步请求到后台 {title}
            //val() 文本框 单选按钮 复选按钮
            //text()  html()
            var sname= $("#sname").val();

            //不为空
            if($.trim(sname) > 0 ){
                //文本框中有内容，表格重载
                table.reload('articleList',{
                    page:{curr:1},
                    where:{sname:sname}

                });
            }

        }
    };

    //点击"批量删除"按钮触发的事件
    $(".anlydelete .layui-btn-danger").on('click', function () {
        //为了获取data-type属性
        var type = $(this).data("type");//getCheckData
        //判断是否具有getCheckData，若有，那么直接调用，否则什么都不做
        active[type] ? active[type].call(this) : '';
    });


    table.on('tool(test)', function(obj){

        var data = obj.data;//获得当前行数据

        var id = data.id;

        var layEvent = obj.event;//获得 lay-event 对应的值

        //alert(id);

        if(layEvent == 'delete'){
            //遍历父级tr，取第一个，然后查找第二个td，取值

            layer.confirm('确定删除状态吗？',{
                    btn: ['确认', '取消']
                }, function(){
                    $.post(
                        '../../staff/delete',
                        {'id': id},
                        function (data) {
                            console.log(data);
                            if (data > 0) {
                                //停留在原来页面刷新
                                $('.layui-laypage-btn').click();
                                layer.msg("恭喜，修改成功！", {icon: 1});
                            }else {
                                //停留在原来页面刷新
                                $('.layui-laypage-btn').click();
                                layer.msg("修改不成功！", {icon: 2});
                            }
                        }
                    );
                },function(){

                    $('.layui-laypage-btn').click();

                }
            );
        }else if(layEvent == 'edit'){
            layer.open({
                type: 2,
                area: ['400px', '500px'],
                fix: false, //不固定
                maxmin: true,
                shadeClose: true,
                shade: 0.4,
                title: "编辑",
                content: '../../staff/update'+"?id="+id

            });
        }

    });





    //点击"模糊查询"按钮触发的事件
    $(".layui-row .layui-btn").on('click', function () {
        //为了获取按钮的data-type属性
        var type = $(this).data("type");//reload
        //判断active变量中是否具有reload属性
        active [type]? active[type].call(this) : '';
    });


});


