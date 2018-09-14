jQuery(document).ready(function($) {

    $(".nav-on").mousemove(function(event) {
    	$(this).children(".cat-display").show();
    });
    $(".nav-on").mouseout(function(event) {
    	$(this).children(".cat-display").hide();
    });
    $(".bid-list li p").click(function(event) {
    	$(this).siblings(".shadow").show();
    	$(this).siblings(".pop").slideDown();
    });
    $(".bid-list .close").click(function(event) {
    	$(this).parents(".pop").slideUp();
    	$(this).parent().siblings(".shadow").hide();
    });
    
    $(".pitem").mouseover(function(event) {
        $(this).find(".label").hide();
       $(this).find(".sbox").show();
       $(this).find(".ctop").stop().animate({height:"133px"});
    });
    $(".pitem").mouseout(function(event) {
        $(this).find(".label").show();
       $(this).find(".sbox").hide();
       $(this).find(".ctop").stop().animate({height:"0"});
    });

    $(".solution .item1 p").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $(".solution .item2 p").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $(".solution .item3 p").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $(".solution .item4 p").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $(".solution .item5 p").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $(".solution .close").click(function(event) {
        $(this).parents(".pop").slideUp();
        $(this).parent().siblings(".shadow").hide();
    });
    $(".cpr-btn .info").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $(".cpr-btn .close").click(function(event) {
        $(this).parents(".pop").slideUp();
        $(this).parent().siblings(".shadow").hide();
    });

    $("#map .mitem area").click(function(event) {
        $(this).siblings(".shadow").show();
        $(this).siblings(".pop").slideDown();
    });
    $("#map .close").click(function(event) {
        $(this).parents(".pop").slideUp();
        $(this).parent().siblings(".shadow").hide();
    });

    $(window).scroll(function() {
        if ($(this).scrollTop() > 400) {
            $('.sidebar').slideDown(100);
        } else {
            $('.sidebar').slideUp(100);
        }
    });
    $(".backtop").click(function(event) {
        event.preventDefault();
        $("html, body").animate({scrollTop: 0}, 500);
    });

    jQuery("#navslide").slide({ 
        type:"menu", //效果类型
        titCell:".mcat", // 鼠标触发对象
        targetCell:".scat", // 效果对象，必须被titCell包含
        delayTime:0, // 效果时间
        triggerTime:0, //鼠标延迟触发时间
        defaultPlay:false,//默认执行
        returnDefault:false//返回默认
    });

    jQuery("#banner").slide({ titCell:".hd li", mainCell:".bd ul", effect:"fold",  autoPlay:true,interTime:6000, delayTime:1000 });
    jQuery("#adlink").slide({ titCell:".hd li", mainCell:".bd ul", effect:"fold",  autoPlay:true, delayTime:700 });
    jQuery(".sleft").slide({mainCell:".bd ul",autoPlay:true,effect:"left"});
    jQuery(".cp-slide").slide({mainCell:".bd ul",autoPlay:true,effect:"left"});

    jQuery(".tabslide").slide({delayTime:"0"});
    jQuery(".tabslide2").slide({delayTime:"0"});
    jQuery(".tabslide3").slide({delayTime:"0"});
    jQuery(".tablist").slide({delayTime:"0"});

    jQuery(".nav-main").slide({ 
        type:"menu",// 效果类型，针对菜单/导航而引入的参数（默认slide）
        titCell:".nli", //鼠标触发对象
        targetCell:".sub", //titCell里面包含的要显示/消失的对象
        effect:"slideDown", //targetCell下拉效果
        delayTime:300 , //效果时间
        // defaultPlay:false,//默认执行
        triggerTime:0, //鼠标延迟触发时间（默认150）
        returnDefault:true //鼠标移走后返回默认状态，例如默认频道是“预告片”，鼠标移走后会返回“预告片”（默认false）
    });

    jQuery(".sideMenu-job").slide({titCell:"h3", targetCell:"ul",defaultIndex:1,effect:"slideDown",delayTime:300,trigger:"click",returnDefault:false});

    var a1 = document.URL;
    var a2 = $(".nav-main .nli a");
    for (var i = 0; i < a2.length; i++) {
        if (a1.indexOf($(a2[i]).attr("href")) != -1) {
            $(a2[i]).parent().addClass("on");
            $(a2[0]).parent().removeClass("on");
            return;
        }
    }

});