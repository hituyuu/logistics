//切换广告jquery版
function ad(sId,aList,iWidth,iHeight){
	this.oDiv = $("#"+sId);
	if(this.oDiv.length){
		this.oDiv.html("广告加载中...");
		this.list = aList;
		this.current = 0;
		this.width = iWidth;
		this.height = iHeight;
		var str_page = "";
		if(this.list.length>1){
			str_page = "<div id='page_"+sId+"' style='position:absolute;margin-top:"+(iHeight*0.85)+"px;margin-left:"+(iWidth-(this.list.length*36-10))/2+"px;'>\n";
			for(i=0;i<this.list.length;i++){
				str_page += "<a href='#' style='display:block;float:left;text-align:center;text-decoration:none;'>"+(i+1)+"</a>";
			}
			str_page += "</div>";
		}
		this.oDiv.html(str_page);
		this.oPage = $("#page_"+sId);
		var _self = this;
		var str_ul = "<div id='show_"+sId+"' style='width:"+iWidth+"px;height:"+iHeight+"px;overflow:hidden;'><ul id='ul_"+sId+"' style='width:"+iWidth*this.list.length+"px;'>\n";
		for(i=0;i<this.list.length;i++){
			str_ul += "<li style='float:left;'>";
			if(this.list[i][0].split(".")[this.list[i][0].split(".").length-1].toLowerCase()=="swf"){
				str_ul += "<object classid='clsid:D27CDB6E-AE6D-11cf-96B8-444553540000' codebase='http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0' width='"+iWidth+"' height='"+iHeight+"'>";
				str_ul += "<param name='movie' value='"+this.list[i][0]+"' />";
				str_ul += "<param name='quality' value='high' />";
				//str_ul += "<param name='wmode' value='Opaque'>";
				str_ul += "<param name='wmode' value='transparent'>";
				str_ul += "<embed src='"+this.list[i][0]+"' quality='high' wmode='Opaque' pluginspage='http://www.macromedia.com/go/getflashplayer' type='application/x-shockwave-flash' width='"+iWidth+"' height='"+iHeight+"'></embed>";
				str_ul += "</object>";
			}else{
				if(this.list[i][1].length>0){
					//alert(sTarget);
					str_ul += "<a href='"+this.list[i][1]+"' target='"+this.list[i][3]+"'><img src='"+this.list[i][0]+"' width='"+iWidth+"' height='"+iHeight+"' border='0'/></a>"
				}else{
					str_ul += "<img src='"+this.list[i][0]+"' width='"+iWidth+"' height='"+iHeight+"' border='0'/>"
				}
			}
			str_ul += "</li>\n";
		}
		str_ul += "</ul></div>";
		this.oDiv.append(str_ul);
		this.oPage = $("#page_"+sId);
		this.oShow = $("#show_"+sId);
		this.oUl = $("#ul_"+sId);
		this.play(0,0);
		if(this.list.length>1){
			this.oUl.mouseover(function(){
				clearTimeout(timer);
			});
			this.oUl.mouseout(function(){
				_self.play(_self.current,0);
			});
		}
		this.oPage.find("a").mouseover(function(){
			_self.move($(this).text()-1);
			clearTimeout(timer);
		});
	}else{
		alert("找不到插入广告的容器！");
	}
};
ad.prototype.play = function(k,s){
	if(this.list.length>1){
		var _self = this;
		this.current = (k >= (this.list.length)) ? 0 : k;
		//移动广告
		_self.move(this.current);
		//设置定时触发
		if(s){
			clearTimeout(timer);
		}else{
			timer = setTimeout(function(){_self.play(_self.current+1,0);},this.list[this.current][2]);
		}
	}
};
ad.prototype.move = function(i){
	this.current = (i >= (this.list.length)) ? 0 : i;
	//移动广告
	this.oShow.stop();
	this.oShow.animate({scrollLeft:(this.width*i)+'px'},{duration:"slow"});
	//this.oDiv.animate({scrollTop:(this.height*i)+'px'},{duration:"slow"});
	//设置分页菜单
	this.oPage.children("a").css({background:"#eee",margin:"0 10px 0 0",width:"26px","height":"4px","font-size":"0"});
	this.oPage.children("a:eq("+this.current+")").css({background:"#21ab38",margin:"0 10px 0 0",width:"26px","height":"4px","font-size":"0"});
};