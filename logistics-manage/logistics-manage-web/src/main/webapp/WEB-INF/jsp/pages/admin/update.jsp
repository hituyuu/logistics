<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加管理员-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/favicon.ico" type="image/x-icon" />
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
<div class="weadmin-body">
    <form class="layui-form" action="${pageContext.request.contextPath}/update/update">
        <div class="layui-form-item">
            <label class="layui-form-label">订单号</label>
            <div class="layui-input-block">
                <input type="text" name="gid"   lay-verify="required" value="${info.gid}" readonly="readonly" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">寄件人</label>
            <div class="layui-input-inline">
                <input type="text" name="sname" required lay-verify="required" value="${info.sname}" disabled="disabled" autocomplete="off" class="layui-input">
            </div>
         </div>
        <div class="layui-form-item">
            <label class="layui-form-label">寄件地址</label>
            <div class="layui-input-inline">
                <input type="text" name="saddress" required lay-verify="required" value="${info.saddress}" disabled="disabled" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">收件人</label>
            <div class="layui-input-inline">
                <input type="text" name="gname" required lay-verify="required" value="${info.gname}" disabled="disabled" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">收件地址</label>
                <div class="layui-input-inline">
                    <input type="text" name="gaddress" required lay-verify="required" value="${info.gaddress}"disabled="disabled" autocomplete="off" class="layui-input">
                </div>

        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">到达网点</label>
            <div class="layui-input-inline">
                <input type="text" name="node1" lay-verify="required" value="${info.node1}" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">到达时间</label>
            <div class="layui-input-inline">
                <input type="datetime" name="time1"  lay-verify="required" value="${info.time1}" autocomplete="off" class="layui-input">
            </div>
        </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达分拨中心</label>
                <div class="layui-input-inline">
                    <input type="text" name="city1"  lay-verify="required" value="${info.city1}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达分拨时间</label>
                <div class="layui-input-inline">
                    <input type="datetime" name="time2" lay-verify="required" value="${info.time2}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达转运</label>
                <div class="layui-input-inline">
                    <input type="text" name="center1"  lay-verify="required" value="${info.center1}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达时间</label>
                <div class="layui-input-inline">
                    <input type="datetime" name="time3"  lay-verify="required" value="${info.time3}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">目的地转运中心</label>
                <div class="layui-input-inline">
                    <input type="text" name="center2"  lay-verify="required" value="${info.center2}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达时间</label>
                <div class="layui-input-inline">
                    <input type="datetime" name="time4"  lay-verify="required" value="${info.time4}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达目标城市</label>
                <div class="layui-input-inline">
                    <input type="text" name="city2"  lay-verify="required" value="${info.city2}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达时间</label>
                <div class="layui-input-inline">
                    <input type="datetime" name="time5"  lay-verify="required" value="${info.time5}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达目标网点</label>
                <div class="layui-input-inline">
                    <input type="text" name="node2"  lay-verify="required" value="${info.node2}" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达时间</label>
                <div class="layui-input-inline">
                    <input type="datetime" name="time6"  lay-verify="required" value="${info.time6}" autocomplete="off" class="layui-input">
                </div>
            </div>

        <div class="layui-form-item">
            <label class="layui-form-label">快件状态码</label>
            <div class="layui-input-inline">
                <input type="text" name="status" required lay-verify="required" value="${info.status}" autocomplete="off" class="layui-input">
            </div>
        </div>




        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type ="submit"  >修改并提交</button>

            </div>
        </div>
    </form>
</div>
<script type="text/javascript">
    layui.extend({
        admin: '{/}../../static/js/admin'
    });
    layui.use(['form','layer','admin','jquery'], function(){
        var form = layui.form,
            admin = layui.admin,
            layer = layui.layer;
             $=layui.$;
        $(function(){


        });
        //自定义验证规则
       /* form.verify({
            nikename: function(value){
                if(value.length < 5){
                    return '昵称至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
        });*/

        //监听提交
        /*form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
        });*/
    });
</script>
</body>

</html>