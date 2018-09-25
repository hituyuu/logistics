﻿﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="火箭物流,供应链,快运,快递,软件" />
<meta name="description" content="火箭以互联网、信息技术和创新的力量为整个物流行业带来革命性变化，致力于打造一站式的物流和供应链服务平台，为客户提供高效的服务和体验，成为最值得信赖和尊重的物流领导者。" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/base.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" />
<title>火箭物流——创新型智慧供应链服务提供商</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/static/js/banners.js"></script>
<script language="javascript">
var type=navigator.appName;
if (type=="Netscape"){
	var lang = navigator.language;
}else{
	var lang = navigator.userLanguage;
}
//取得浏览器语言的前两个字母
var lang = lang.substr(0,2)
// 英语
if(lang == "en"){
	//window.location.href="http://www.800best.com/en/"
}
// 中文 - 不分繁体和简体
else if(lang == "zh"){
//  window.location.href="http://www.800best.cn/"
//  注释掉了上面跳转,不然会陷入无限循环
}
// 除上面所列的语言
else{
	window.location.href="http://www.800best.com"
}
</script>
<style>
.bd{
	height:670px;
	overflow:hidden;
}
.header-top a{
	border-left:1px solid #444;
}
.header-top a:hover{
	background:none;
	color:#fff;
}
.cat-list .mcat{ background:rgba(255, 255, 255,.9);border-color: #eee;}
.cat-list .mcat .scat{ background:rgba(255, 255, 255,.9);}
.cat-list .mcat:hover{ background: rgba(235, 235, 235,.9);}
.cat-list .mcat .scat li a:hover{ background: rgba(86, 150, 253,.9);color:#fff;}
.nav-main{ position:relative;}
.nav-main #adlink{ display:block;width:100%;height:420px;top:52px;left:0;position: absolute;}
.nav-main #adlink .bd ul{ width:100%;height:420px;}
.nav-main #adlink .bd ul li{ width:100%;height:420px;}
.nav-main #adlink .bd li a{ display: block; width:100%;height:420px;}
#banner .bd .bn1{ background:url(${pageContext.request.contextPath}/static/images/1.jpg) no-repeat center 0;}
#banner .bd .bn2{ background:url(${pageContext.request.contextPath}/static/images/sssss0423.jpg) no-repeat center 0;}
#banner .bd .bn3{ background:url(${pageContext.request.contextPath}/static/images/1111.jpg) no-repeat center 0;}
#banner .bd .bn4{ background:url(${pageContext.request.contextPath}/static/images/bg.jpg) no-repeat center 0;}
#banner .bd .bn5{ background:url(${pageContext.request.contextPath}/static/images/best20180103.jpg) no-repeat center 0;}
#banner .bd .bn6{ background:url(${pageContext.request.contextPath}/static/images/best20170310.jpg) no-repeat center 0;}
#banner .bd .bn7{ background:url(${pageContext.request.contextPath}/static/images/best360zn.jpg) no-repeat center 0;}
#banner .bd .bn88{ background:url(${pageContext.request.contextPath}/static/images/ucargo.jpg) no-repeat center 0;}
#banner .bd .bn9{ background:url(${pageContext.request.contextPath}/static/images/best0212.jpg) no-repeat center 0;}
#banner .bd .bn90{ background:url(${pageContext.request.contextPath}/static/images/0810.jpg) no-repeat center 0;}
</style>

    <!--公共头部-->
	<div class="header">
		<div class="header-top">
			<div class="w980 clearfix">
				<div class="left">
					<a href="http://www.best-inc.com" target="_blank">ENGLISH</a>
					<a href="http://www.800bestex.com" target="_blank" class="name">火箭快递</a>
					<a href="http://www.800best.com/hr" target="_blank">火箭人才</a>
				</div>
				<div class="right">
					<a href="${pageContext.request.contextPath}/static//best/tel.shtml">客服热线</a>
					<a href="${pageContext.request.contextPath}/static//best/contact.shtml" class="brno" style="display:none;">联系我们</a>
					<a href="${pageContext.request.contextPath}/static//help">用户反馈</a>
				</div>
			</div>
		</div>
		<div class="logo">
			<div class="w980 clearfix">
				<div class="left">
					<a href="/"><img src="${pageContext.request.contextPath}/static/picture/logo_index.png" alt="火箭" /></a>
				</div>
				<div class="right">
					<img src="${pageContext.request.contextPath}/static/picture/tel.png" alt="" />
				</div>
			</div>
		</div>
		<div id="nav">
			<div class="w980 clearfix">
				<div class="nav-cat">
					<a href="###" class="btn-nav">全部功能</a>
					<div class="cat-list index-cat">
						<ul id="navslide">
							<li class="mcat m5" id="mcat5">
								<p><span class="s5"></span>用户登录</p>
								<div class="scat">
									<ul>
										<li ><a  href="${pageContext.request.contextPath}/pages/customer/tologin">登录</a></li>

										<c:if  test  = "${findCustomer.cname!=null}">
											<li><a href="${pageContext.request.contextPath}/pages/customer/showcustomer">注销</a> </li>
											<li><a href="${pageContext.request.contextPath}/showcustomer?cname="+${findCustomer.cname}>${findCustomer.cname} </a> </li>

										</c:if>
									</ul>
								</div>
							</li>
							<li class="mcat m1">
								<p><span class="s1"></span>我要查件</p>
								<div class="scat scat_top">
									<ul>
										<li><a href="${pageContext.request.contextPath}/static//freight/track.asp">快运</a></li>
										<li><a href="http://www.800bestex.com/Bill/Track"  target="_blank">快递</a></li>
									</ul>
								</div>
							</li>
							<li class="mcat m2">
								<p><span class="s2"></span>我要寄件<i class="new"></i></p>
								<div class="scat">
									<ul>
										<li><a href="http://www.800bestex.com/Order/Create" target="_blank">快递</a></li>
										<li><a href="http://t.800best.com" target="_blank">快运</a></li>
									</ul>
								</div>
							</li>
							<li class="mcat m3">
								<p><span class="s3"></span><a href="${pageContext.request.contextPath}/net" >网点查询</a></p>
								<%--<div class="scat">
									<ul >
										&lt;%&ndash;<li><a href="${pageContext.request.contextPath}/static//supply-chain/network.shtml">供应链</a></li>
										<li><a href="${pageContext.request.contextPath}/static//freight/network.shtml">快运</a></li>&ndash;%&gt;
										<li><a href="${pageContext.request.contextPath}/net" target="_blank">快递</a></li>
									</ul>
								</div>--%>
							</li>
							<li class="mcat m4">
								<p><span class="s4"></span>时效&运费查询</p>
								<div class="scat">
									<ul>
                                        <li><a href="${pageContext.request.contextPath}/static//freight/">快运</a></li>
									</ul>
								</div>
							</li>

							<li class="mcat m6" id="mcat6">
								<div class="search">
									<form action="../../search/search" id="searchForm" name="query" method="GET">
										<input type="text" class="text" name="keyword" id="keyword" value="" style="color: rgb(153, 153, 153); " >
										<input type="submit" value="搜索" class="submit"/>
									</form><div class="search_hot"></div>
								</div>
							</li> 
						</ul>
					</div>
				</div>
				<div class="nav-main clearfix">
					<ul class="clearfix">
						<li class="nli"><a href="/">首页</a></li>
						<li class="nli">
							<a href="/supply-chain">供应链</a>
							<ul class="sub">
                                <li><a href="/supply-chain">·&nbsp;&nbsp;服务产品</a></li>
                                <li style="display:none;"><a href="/supply-chain/solution.shtml">·&nbsp;&nbsp;解决方案</a></li>
                                <li><a href="/supply-chain/network.shtml">·&nbsp;&nbsp;服务网络</a></li>
                                <li><a href="/supply-chain/customer.shtml">·&nbsp;&nbsp;品牌客户</a></li>
								<li><a href="/supply-chain/partner.shtml">·&nbsp;&nbsp;合作加盟</a></li>
                            </ul>
						</li>
						<li class="nli">
                            <a href="/express">快递</a>
                            <ul class="sub">
                                <li><a href="/express">·&nbsp;&nbsp;产品服务</a></li>
                                <li><a href="http://www.800bestex.com/Site/Query" target="_blank">·&nbsp;&nbsp;服务网络</a></li>
                                <li><a href="/express/cost.shtml">·&nbsp;&nbsp;计费方式</a></li>
                                <li><a href="http://www.800best.com/express/partner/" target="_blank">·&nbsp;&nbsp;在线加盟</a></li>
                            </ul>
                        </li>
						<li class="nli">
							<a href="/freight">快运</a>
							<ul class="sub">
                                <li><a href="http://t.800best.com/" target="_blank">·&nbsp;&nbsp;服务平台</a></li>
								<li><a href="/freight">·&nbsp;&nbsp;产品服务</a></li>
                                <li><a href="/freight/network.shtml">·&nbsp;&nbsp;服务网络</a></li>
                                <li><a href="/freight/faq.shtml">·&nbsp;&nbsp;常见问题</a></li>
                                <li><a href="/freight/ztb.shtml">·&nbsp;&nbsp;招投标</a></li>
								<li><a href="/freight/partner" target="_blank">·&nbsp;&nbsp;合作加盟</a></li>
                            </ul>
						</li>
						<li class="nli" id="nav_dianjia">
							<a href="/dianjia">店加</a>
						</li>
						<li class="nli" id="nav_global">
							<a href="/global">国际</a>
							<ul class="sub">
								<li><a href="/global/index.shtml">·&nbsp;&nbsp;服务产品</a></li>
								<li><a href="/global/platform.shtml">·&nbsp;&nbsp;服务平台</a></li>
								<li><a href="/global/network.shtml">·&nbsp;&nbsp;服务网络</a></li>
								<li><a href="/global/contact.shtml">·&nbsp;&nbsp;业务咨询</a></li>
								<li><a href="/global/joinfba.shtml">·&nbsp;&nbsp;合作加盟</a></li>
							</ul>
						</li>
						<li class="nli" id="nav_others">
							<a href="/bestcloud">其他</a>
							<ul class="sub">
								<li><a href="http://bzh.800best.com" target="_blank">·&nbsp;&nbsp;百智会</a></li>
								<li><a href="http://www.800youhuo.com" target="_blank">·&nbsp;&nbsp;优货</a></li>
								<li><a href="/bestcloud">·&nbsp;&nbsp;云</a></li>
							</ul>
						</li>
					<li class="nli" id="nav_ir"><a href="http://ir.best-inc.com/" target="_blank">投资者关系</a></li>
					<li class="nli" id="nav_best">
						<a href="/best">关于火箭</a>
						<ul class="sub">
							<li><a href="/best">·&nbsp;&nbsp;火箭概况</a></li>
							<li><a href="/news">·&nbsp;&nbsp;火箭快讯</a></li>
							<li><a href="/best/tel.shtml">·&nbsp;&nbsp;客服热线</a></li>
							<li><a href="/help">·&nbsp;&nbsp;用户反馈</a></li>
						</ul>
					</li>
					</ul>
				</div>
			</div>
			<div id="banner">
				<div class="hd clearfix">
					<div class="w980 clearfix">
						<ul class="clearfix">
							<li></li>
							<li></li>
                            <li></li>
							<li></li>
						</ul>
					</div>
				</div>
				<div class="bd">
					<ul class="clearfix">
						<!--首页焦点图位置-->
						<li class="bn90"><a href="http://bzh.800best.com/" target="_blank"></a></li>
						<li class="bn88"><a href="http://www.800best.com/ucargo/partner/" target="_blank"></a></li>
						<li class="bn5"><a href="http://www.800bestex.com/news/detail/E2A36DBF2AA5AB0B" target="_blank"></a></li>
						<!--<li class="bn4"><a href="http://www.800best.com/bestlab/" target="_blank"></a></li>-->
						<li class="bn1"><a href="http://www.800best.com/freight/partner" target="_blank"></a></li>
					</ul>
				</div>
			</div>
		</div>
		
	</div>
    <!--end公共头部-->

	<div class="main index-main">
    	<div class="w980 mbox">
    		<div class="item product">
    			<h2>ROCKET明星产品</h2>
    			<ul class="clearfix">
    				<li>
    					<a href="/supply-chain" class="p-a"></a>
    					<span class="icon1 icon"></span>
    					<h4>火箭云仓</h4>
    					<p>170多个重点城市，320多个云仓，服务覆盖全国</p>
    				</li>


    				<li class="mrno ">
    					<a href="/express" class="p-a"></a>
    					<span class="icon4 icon"></span>
    					<h4>火箭快递</h4>
    					<p>覆盖全国，24000多个网点，100% 省市覆盖率，98% 区县覆盖率</p>
    				</li>
    				<li>
    					<a href="/freight" class="p-a"></a>
    					<span class="icon3 icon"></span>
    					<h4>火箭快运</h4>
    					<p>拥有9,500多个服务网点，100% 省市覆盖率，98% 区县覆盖率</p>
    				</li>
    				<li>
    					<a href="/dianjia/" class="p-a"></a>
    					<span class="icon2 icon"></span>
    					<h4>火箭店加</h4>
    					<p>以供应链为依托，为便利店提供一站式采购和最后一公里增值服务的B2B平台</p>
    				</li>
    			</ul>
    		</div>
    		<div class="item clearfix" style="display:none;">
    			<div class="project">
    				<h3>ROCKET解决方案</h3>
    				<ul>
                        <li>
                            <a href="/supply-chain/solution.shtml" class="p-a"></a>
                            <span class="icon1 icon"></span>
                            <p>火箭是如何做解决方案的？</p>
                        </li>
                        <li>
                            <a href="/supply-chain/solution.shtml" class="p-a"></a>
                            <span class="icon2 icon"></span>
                            <p>如何应对频繁出现的仓储作业高峰？</p>
                        </li>
                        <li>
                            <a href="/supply-chain/solution.shtml" class="p-a"></a>
                            <span class="icon3 icon"></span>
                            <p>如何确保长期稳定的仓储运营质量？</p>
                        </li>
                        <li>
                            <a href="/supply-chain/solution.shtml" class="p-a"></a>
                            <span class="icon4 icon"></span>
                            <p>如何有效整合线上、线下仓库一体化运作？</p>
                        </li>
                        <li>
                            <a href="/supply-chain/solution.shtml" class="p-a"></a>
                            <span class="icon5 icon"></span>
                            <p>如何解决令人头痛的库存准确性问题？</p>
                        </li>

                    </ul>
    			</div>
    		</div>
    		<div class="item news clearfix">
    			<h3>最近发生的事<a href="/news" class="more">更多 +</a></h3>
    			<div class="sleft">
					<script language="javascript" src="${pageContext.request.contextPath}/static/js/2.js"></script>
    			</div>
    			<div class="news-list">
    				<ul>
						<li class='clearfix'><div class='pic'><a href='/news/493.shtml'><img src='${pageContext.request.contextPath}/static/picture/060107.png' onerror='this.src="${pageContext.request.contextPath}/static//img/news_no.jpg"' /></a></div><div class='txt'><h2><a href='/news/493.shtml' title='中国物流与采购网：“新玩家”的运筹帷幄！火箭国际以智慧供应链服务跨境电商'>中国物流与采购网：“新玩家”的运筹帷幄！</a></h2><p>火箭国际针对美国市场推出了海运FBA拼箱及整柜直送服务以及空运FBA专线，并提供...</p></div></li>
<li class='clearfix'><div class='pic'><a href='/news/492.shtml'><img src='${pageContext.request.contextPath}/static/picture/060103.jpg' onerror='this.src="${pageContext.request.contextPath}/static/img/news_no.jpg"' /></a></div><div class='txt'><h2><a href='/news/492.shtml' title='中国网：以供应链赋能新零售 火箭店加有新解'>中国网：以供应链赋能新零售 火箭店加有新</a></h2><p>中国报道讯 （杨金鑫报道）在最新发布的《2018中国便利店发展报告》（以下简称“...</p></div></li>

    				</ul>

			</div>
    		</div>
    	</div>
    </div>
<!--公共底部-->
<div class="footer">
	<ul class="info">
		<li class="info_1">600多个运作中心</li>
		<li class="info_2">470多万平方米运营面积</li>
		<li class="info_3">9900多全职员工</li>
		<li class="info_4">上万个认证加盟商及合作伙伴</li>
		<li class="info_5">覆盖全国的仓储配送网络</li>
	</ul>
	<div class="w980 clearfix mt14">
		<div class="faq">
			<ul class="clearfix">
				<li class="mlist first">
					<div class="tit">关于火箭</div>
					<ul class="slist">
						<li><a href="/best">火箭概况</a></li>
						<li><a href="/best/contact.shtml">联系我们</a></li>
						<li><a href="/news">火箭快讯</a></li>
					</ul>
				</li>
				<li class="mlist">
					<div class="tit">招贤纳士</div>
					<ul class="slist">
						<li><a href="http://www.800best.com/hr/jobs" target="_blank">招聘岗位</a></li>
						<li><a href="http://best-campus.zhaopin.com" target="_blank">校园招聘</a></li>
					</ul>
				</li>
				<li class="mlist">
					<div class="tit">关注我们</div>
					<ul class="slist">
						<li><a href="http://weibo.com/800best" target="_blank">火箭微博</a></li>
						<li><a href="http://weibo.com/bestexpress" target="_blank">快递微博</a></li>
                        <li><a href="http://weibo.com/u/5596286925?refer_flag=1001030101_&is_hot=1" target="_blank">快运微博</a></li>
					</ul>
				</li>
				<li class="mlist last">
					<div class="tit">帮助中心</div>
					<ul class="slist">
						<li><a href="/help">用户反馈</a></li>
						<li><a href="/help/sitemap.shtml">网站地图</a></li>
						<li><a href="/help/terms.shtml">网站使用条款</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<div class="contact clearfix">
			<div class="left" style="display:none;"><img src="${pageContext.request.contextPath}/static/picture/wx.jpg" alt="" /></div>
			<ul class="right" style="sdisplay:none;">
				<li><strong>客服热线</strong></li>
				<li>快递：95320</li>
				<li>快运：400-8856-561</li>
				<li style="display:none;">供应链：400-921-7766</li>
				<li style="display:none;">周一至周五 9:00-17:30</li>
			</ul>
		</div>
	</div>
	<div class="w980 clearfix mt44">
		<div class="auth">
			<a  style="display:none;" href="http://122.224.75.236/wzba/login.do?method=hdurl&doamin=http://www.800best.com&id=330108000004538&SHID=1223.0AFF_NAME=com.rouger.gs.main.UserInfoAff&AFF_ACTION=qyhzdetail&PAGE_URL=ShowDetail" target="_blank"><img src="${pageContext.request.contextPath}/static/picture/gh.jpg" alt="" /></a>&nbsp;&nbsp;
			<a href="http://www.moc.gov.cn/" target="_blank"><img src="${pageContext.request.contextPath}/static/picture/fc2.jpg" alt="" /></a>&nbsp;&nbsp;
			<a   style="display:none;" href="http://www.chinawuliu.com.cn/" target="_blank"><img src="${pageContext.request.contextPath}/static/picture/fc3.jpg" alt="" /></a>
			<div style="position:absolute;margin:-53px 0 0 200px;width:300px;padding:20px 0;"><a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=33010602000848" style="display:inline-block;text-decoration:none;height:20px;line-height:20px;"><img src="${pageContext.request.contextPath}/static/picture/ghs.png" style="float:left;"/><p style="float:left;height:20px;line-height:20px;margin: 0px 0px 0px 5px; color:#939393;">浙公网安备 33010602000848号</p></a></div>
		</div>
		<div class="copy">
			<p>©2017 杭州火箭网络技术有限公司 版权所有  <a href="http://www.miibeian.gov.cn/" target="_blank">ICP证:浙B2－20070189</a></p>
		</div>
	</div>
</div>
<div class="sidebar">
	<img src="${pageContext.request.contextPath}/static/picture/gotop.png" alt="回到顶部" class="backtop"/>
</div>
<div id="counter" style="display:none;"><script src="${pageContext.request.contextPath}/static/js/stat.js" language="JavaScript"></script></div>
<script src="${pageContext.request.contextPath}/static/js/superslide.js"></script>
<script src="${pageContext.request.contextPath}/static/js/com.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.tagthis.js"></script>
<script src="${pageContext.request.contextPath}/static/js/main.js"></script>
<script src="${pageContext.request.contextPath}/static/js/prism.js"></script>
<!--end公共底部-->
</body>
</html>