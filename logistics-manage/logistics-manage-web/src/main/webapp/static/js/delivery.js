layui.extend({
    admin: '{/}../../static/js/admin'
});

layui.use(['form', 'table', 'jquery', 'admin'], function () {
    var form = layui.form,
        table = layui.table,
        $ = layui.jquery,
        admin = layui.admin;

    $("#btnImport").click(function(){
        location.href="/manager/delivery/deliveryList?status=0"
    });

    $("#btnImport2").click(function(){
        location.href="/manager/delivery/undeliveryList?status=1"
    });


});