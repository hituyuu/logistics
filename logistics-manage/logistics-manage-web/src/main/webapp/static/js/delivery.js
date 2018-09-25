layui.extend({
    admin: '{/}../../static/js/admin'
});

layui.use(['form', 'table', 'jquery', 'admin'], function () {
    var form = layui.form,
        table = layui.table,
        $ = layui.jquery,
        admin = layui.admin;

    $("#btnImport").click(function(){
        location.href="./deliveryList?status=0"
    });

    $("#btnImport2").click(function(){
        location.href="./undeliveryList?status=1"
    });

    $("#btnImport3").click(function(){
        location.href="./sendList?status=1"
    });


});