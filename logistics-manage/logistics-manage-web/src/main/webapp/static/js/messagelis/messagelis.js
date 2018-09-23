layui.use(['table', 'jquery', 'laytpl','layer'], function () {
    var table = layui.table, $ = layui.jquery, laytpl = layui.laytpl,layer=layui.layer;
    table.render({
        elem: '#message-lis',
        url: '../../goodsmess',
        page: true,
        cols: [[
            {type: 'checkbox'},
            {field: 'id', title: '货物单号', width: 120},
            {field: 'goodsName', title: '货物名字', width: 120},
            {field: 'goodsType', title: '货物类型', width: 120},
            {field: 'sname', title: '寄件人姓名', width: 120},
            {field: 'phone', title: '寄件人手机', width: 120},
            {field: 'bigenAddr', title: '起始地址', width: 120},
            {
                field: 'jdate', title: '寄件日期', width: 145, templet: function (row) {
                return createTime(row.jdate)
            }
            },
            {field: 'weight', title: '货物重量', width: 80},
            {field: 'sname', title: '收件人姓名', width: 120},
            {field: 'phone1', title: '收件人手机', width: 120},
            {field: 'endAddr', title: '目标地址', width: 120},
            {field: 'goodsPrice', title: '运输费用', width: 120},
            {field: 'status', title: '物流状态', width: 120,templet:'<div>{{1==d.status?"已到达":"运输中"}}</div>'}

        ]]
    });
    function createTime(v){

        var date = new Date(v);

        var y = date.getFullYear();

        var m = date.getMonth()+1;

        m = m<10?'0'+m:m;

        var d = date.getDate();

        d = d<10?("0"+d):d;

        var h = date.getHours();

        h = h<10?("0"+h):h;

        var M = date.getMinutes();

        M = M<10?("0"+M):M;

        var str = y+"-"+m+"-"+d+" "+h+":"+M;

        return str;

    }
    var activ={
       reload:function(){
            var id= $.trim($("#id").val());
           if (id.length>0) {
               table.reload({
                   where: {id: id},
                   page: {curr: 1}
               });
           }
        },
        checkstatus:function(){
            var data=table.checkStatus('message-lis').data;
            if(data.length>0){
                var ids=[];
                for(var i=0;i<data.length;i++){
                    ids.push(data[i].id);
                }
                $.ajax({
                    url:'../../updatestatus',
                    data:{'ids[]':ids},
                    type:'post',
                    success:function(data){
                        if (data>0) {

                            $('.layui-laypage-btn').click();
                            layer.msg('删除成功', {icon: 1});
                          //  $('layui-laypage-btn').click();
                        }
                    }
                });
            }else{
                layer.msg('至少选择一行进行删除',{icon:2});
            }

        }
    }
    $(".weadmin-block .layui-btn-danger").on("click",function(){
        var type= $(this).data('type');
        activ[type]?activ[type].call(this):'';
    });
});