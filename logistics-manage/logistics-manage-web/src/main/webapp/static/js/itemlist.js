//引入admin.js(webapp/static/js/admin.js)
//itemlist.js(webapp/static/js/itemlist.js)
layui.extend({
    admin: '{/}../../static/js/admin'
});
//按需加载admin.js
layui.use(['admin', 'jquery', 'table','form',], function () {
    //初始化变量
    var admin = layui.admin,
        $ = layui.jquery,
        table = layui.table;
    //对表格进行渲染
    table.render({
        //什么是表格属性：page,elem,url,cols
        //什么是列属性：type,field,title
        //开启分页
        page: true,
        //渲染的容器是谁
        elem: '#articleList',
        //异步提交请求给后台返回JSON
        url: '../../item',
        //要显示的表头是什么



        cols: [[
            {type: 'checkbox'},
            {field: 'id', title: '商品编号'},
            {field: 'servicecompy', title: '服务公司'},
            {field: 'freight', title: '运费'},
            {field: 'days', title: '天数'},
            {fixed: 'right', title: '操作', align:'center', toolbar: '#operateTpl'}

        ]]
        // ,done:function(res,curr,count){
        //     // var $statusCol = $("[data-field='status']");//商品状态这一列
        //     // console.log($statusCol.children());
        //     // console.log($("[data-field='status']").children());
        //     $("[data-field='status']").children().each(function(){
        //         // this 当前DOM对象
        //         //$(this) 当前jQuery对象
        //         // val() text() html() 三个函数都是既可以设值也可以取值
        //         // val() 一般用于文本框 单选按钮 复选按钮这些的取值
        //         // text() 一般是用于获取指定控件中的文本 <div><strong>hello</strong></div> text() ====> hello
        //         // html() 一般是用于获取指定控件中的标签和文本 <div><strong>hello</strong></div> html() ====> <strong>hello</strong>
        //         // console.log($(this).text());
        //         if($(this).text() == '1'){
        //             //正常
        //             $(this).text('正常');
        //         }else if($(this).text() == '2'){
        //             //下架
        //             $(this).text('下架');
        //         }
        //     });
        // }
    });



    //点击"批量删除"按钮触发的事件
    //点击"批量删除"按钮触发的事件
    //点击"批量删除"按钮触发的事件
    $(".demoTable .layui-btn-danger").on('click', function () {
        var data = table.checkStatus("articleList").data;
        if(data.length > 0){
            var ids = [];
            for (var i = 0; i < data.length; i++) {
                ids.push(data[i].id);
            }
            $.post(
                //url:这次异步请求提交给谁处理,string
                '../../item/batch',
                //data:提交什么给后台处理,object
                {'ids[]': ids},
                //success:成功的回调函数,function
                function (data) {
                    if (data > 0) {
                        //停留在原来页面刷新
                        $('.layui-laypage-btn').click();
                        layer.msg("恭喜，删除成功！", {icon: 1});
                    }
                },
                //dataType:返回类型,string
                'json'
            );

        }else {
            layer.msg("请至少选中一行再批量删除！", {icon: 2});
        }
    });

    //点击"模糊查询"按钮触发的事件
    // $(".weadmin-body .layui-btn").on('click', function () {
    //     //为了获取按钮的data-type属性
    //     var type = $(this).data("type");//reload
    //     //判断active变量中是否具有reload属性
    //     active[type] ? active[type].call(this) : '';
    // });

    //点击"模糊查询"按钮触发的事件
    //$(".layui-row .layui-btn").on('click',function(){
    //    //获取相关属性
    //    var type = $(this).data('type');//reload
    //    //判断active对象有没有这个属性
    //    active[type] ? active[type].call(this) : '';
    //
    //});
//点击删除触发事件
    table.on('tool(test)',function(obj){

        var data = obj.data;//获得当前行数据

        var id = data.id;

        var layEvent = obj.event;//获得 lay-event 对应的值

        //alert(id);

        if(layEvent === 'delete'){
            //alert('查看操作');

            //遍历父级tr，取第一个，然后查找第二个td，取值

            layer.confirm('确定删除吗？',{
                    btn: ['确认', '取消']
                }, function(){
                    $.get(
                        '../../item/delete',
                        {'id': id},
                        function (data) {

                            if (data > 0) {
                                //停留在原来页面刷新
                                $('.layui-laypage-btn').click();
                                layer.msg("恭喜，修改成功！", {icon: 2});
                            }else {
                                //停留在原来页面刷新
                                $('.layui-laypage-btn').click();
                                layer.msg("删除成功！", {icon: 1});
                            }
                        }
                    );
                },function(){

                    $('.layui-laypage-btn').click();

                }
            );
        }else if(layEvent === 'edit'){


                layer.alert('编辑行：<br>'+ JSON.stringify(data))
            }


            //layer.msg('编辑操作');
            $.post(
                '../../item/update',
                {'id': id}
            );

    });




});



