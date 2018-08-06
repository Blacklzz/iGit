<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
   String path = request.getContextPath();
   System.out.println("path="+path);
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   System.out.println("basepath="+basePath);
%>
<!DOCTYPE html >
<html>
<head>
<base href ="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>电子商务-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="layui/css/layui.css" />
<link rel="stylesheet" type="text/css" href="css/style1.css">
<link rel="stylesheet" href="css/swiper-4.3.3.min.css" />
<script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="js/swiper-4.3.3.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js"></script>
<script type="text/javascript" src="layer/layer.js"></script>
<script type="text/javascript" src="js/index.js"></script>


<style>
  .c3_b2{
  
}
.c3_b2 ul{
   height: 350px;
     width: 100%;
     text-align: center;
     overflow: auto;
}
.c3_b2 ul li{
	width:280px;
}
.c3_b2 ul li div{
   	width:275px;
}




</style>
</head>
<body>
     <c:if test="${ !empty requestScope.msg}">
     <script type="text/javascript">
       msg= "${requestScope.msg}"
       alert  (msg);
     </script>
     </c:if>
<script type="text/javascript">  
  /* window.open ('time.html')  */ 
 
/*   layer.alert('欢迎回来 ( *≧ ▽ ≦  )', { title :'提示',icon: 1}); */
/*   layer.open({
	  type: 2,
	  content: 'time.html',
	  success: function(layero, index){
	    var body = layer.getChildFrame('body', index);
	    var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
	    console.log(body.html()) //得到iframe页的body内容
	    
	    body.find('input').val('Hi，我是从父页来的')
	  }
	});  */ 
	layer.open({
		  type: 1
		  ,title: false 
		  ,closeBtn: false
		  ,area: '300px;'
		  ,shade: 0.8
		  ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		  ,resize: false
		  ,btn: ['火速围观', '残忍拒绝']
		  ,btnAlign: 'c'
		  ,moveType: 1 //拖拽模式，0或者1
		  ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎光临杰普电子商城，亲<br>感谢您对我们的支持，我们将会提供优质的服务来回馈广大客户<br>我们此后的征途是星辰大海 ^_^<br>登录后获得更优质的体验，您要登录么？</div>'
		  ,success: function(layero){
		    var btn = layero.find('.layui-layer-btn');
		    btn.find('.layui-layer-btn0').attr({
		      href: 'http://localhost:8080/test/login.jsp'
		      ,target: '_blank'
		    });
		  }
		});
/* layer.msg('有表情地提示', {icon: 6}); */
/* layer.msg('关闭后想做些什么', function(){ */
  //do something

/*  layer.load(3); //风格1的加载 */
</script> 
	<!--顶部-->
<span  name="gotop"></span>
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
          
             <li>  <a href="">退出</a>|</li>
            	<!-- <li><a href="#">退出</a>|</li> -->
            	
            	
              <li>  <a href="#">我的订单<span class="jt_down"></span></a>|
                 <!-- <dl class="layui-nav-child"> 二级菜单
					      <dd><a href="">移动模块</a></dd>
					      <dd><a href="">后台模版</a></dd>
					      <dd><a href="">电商平台</a></dd>
                 </dl>
                  -->
                
                
                </li>
                
              <li> <a href="#">关注杰普<span class="jt_down"></span></a>|</li>
              <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
	<a href="#"  class="logo"><img src="images/logo.png"></a> 
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            	<a href="#">文学类</a>|
            	<a href="#">教育类</a>|
                <a href="#">计算机</a>|
                <a href="#">儿童类</a>|
                <a href="#">漫画类</a>|
            </p>
        </div>
        <div class="h3_right">
        
        	<div class="myyy">
        	 <a href='customer.jsp'>
            	个人信息
                <span class="sj_down"></span></a>
             </div>
            <div class="tsc">
             <a href='loginAfter/shopCart.jsp'>
            	去购物车结算
                <span class="sj_right">
                </span>
                 </a>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
                <li><a href="#">文学类</a></li>
                <li><a href="#">教育类</a></li>
                <li><a href="#">计算机</a></li>
                <li><a href="#">儿童类</a></li>
                <li><a href="#">漫画类</a></li>
            </ul>
        </div>
    </div>
    
	<div class="container3">
    	<div class="c3_b1">
        	<div class="c3_b1_left">
            	<dl>
               		<dd>
                    	<h1>文艺</h1>
                    	<p>
                        	<a href="http://book.dangdang.com/01.05.htm?ref=book-01-A">文学</a>
                           	<a href="http://book.dangdang.com/01.38.htm?ref=book-01-A">传记</a>
                            <a href="http://book.dangdang.com/01.07.htm?ref=book-01-A">艺术</a>
                            <a href="http://category.dangdang.com/cp01.07.05.00.00.00.html?biaoti">摄影</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>教育</h1>
                    	<p>
                        	<a href="http://book.dangdang.com/textbook?biaoti">教材</a>
                           	<a href="http://book.dangdang.com/language?ref=book-01-A?biaoti">外语</a>
                            <a href="http://book.dangdang.com/exam?biaoti">考试</a>
                            <a href="http://book.dangdang.com/dictionary">工具</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>计算机</h1>
                    	<p>
                           	<a href="#">计算机</a>
                            <a href="#">计算机</a>
                            <a href="#">计算机</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>童书</h1>
                    	<p>
                        	<a href="#">科普</a>
                           	<a href="#">绘本</a>
                            <a href="#">文学</a>
                            <a href="#">英语</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>漫画类</h1>
                    	<p>
                        	<a href="#">漫画</a>
                           	<a href="#">漫画</a>
                            <a href="#">漫画</a>
                            <a href="#">漫画</a>
                      	</p>
                    </dd>
                    <dd>
                    	<h1>工具书</h1>
                    	<p>
                        	<a href="#">工具书</a>
                           	<a href="#">工具书</a>
                            <a href="#">工具书</a>
                      	</p>
                    </dd>
                    <dd class="last">
                    	<h1>期刊</h1>
                    	<p>
                        	<a href="#">期刊</a>
                           	<a href="#">期刊</a>
                            <a href="#">期刊</a>
                            <a href="#">期刊</a>
                      	</p>
                    </dd>
                </dl>
            </div>

            <div class="c3_b1_center">
             <div class="swiper-container">
				 <div class="swiper-wrapper">
				        <div class="swiper-slide"><a href="time.html"><img src="images/a1.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a2.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a3.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a4.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a5.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a6.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a7.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a8.jpg"></a></div>
				        <div class="swiper-slide"><a href="time.html"><img src="images/a9.jpg"></a></div>
				    </div>
				    
					    <!-- 如果需要分页器 -->
					    <div class="swiper-pagination"></div>
					    
                        <!-- 如果需要导航按钮
					    <div class="swiper-button-prev"></div>
					    <div class="swiper-button-next"></div> -->
					    
					    <!-- 如果需要滚动条 -->
					    <!-- <div class="swiper-scrollbar"></div> -->
					</div>

				    
						<script type="text/javascript">
						    var mySwiper = new Swiper ('.swiper-container', {
						    // 滚动方向 horizontal/vertical
						    direction: 'horizontal',
						    // 自动播放
						    autoplay:{
						    	delay:1000,
						    },
						    // 是否循环播放
						    loop: true,
						    // 如果需要分页器（小圆点）
						    // 是否需要分页器
						    pagination: {
						    	el:'.swiper-pagination',
						    	clickable:true,
						    	dynamicBullets:true,
						    	dynamicMainBullets:9,				    		    	
						    },
						    // 点击分页器是否切换到对应的图片 是 true 否 false
						    paginationClickable:true,
						
						    // 如果需要前进后退按钮
						    nextButton: '.swiper-button-next',
						    prevButton: '.swiper-button-prev',
						    
						    // 用户操作swiper之后，是否禁止autoplay。默认为true：停止。
						    // 如果设置为false，用户操作swiper之后自动切换不会停止，每次都会重新启动autoplay。
						    // 操作包括触碰，拖动，点击pagination等。
						   autoplayDisableOnInteraction:false,
						  });
							   $('.swiper-container .swiper-slide').on({ //鼠标移入则停移出则继续
								   mouseover: function(){
									   mySwiper.autoplay.stop();
								   },
								   mouseout : function(){
									   mySwiper.autoplay.start();
								   }
							   });
						    </script>
            	<!-- <div>
                	<a href="time.html"><img src="images/a1.jpg"></a>
                </div> -->
                <div class="c3_b1_c_bottom">
                    <ul>
                    <c:forEach begin="0" end="2" items="${applicationScope.books }" var="item">
                        <li>
                           <a href="showBookServlet?id=${item.book_id }"><img src="images/b3.jpg"/></a>
                           <a href="showBookServlet?id=${item.book_id }">${item.name }</a>  
                        </li>
                        </c:forEach>
                       <!-- <li>
                           <a href="#"><img src="images/p01.png"/></a> 
                           <a href="#">Java从入门到精通</a> 
                        </li>
                        <li>
                           <a href="#"><img src="images/p01.png"/></a> 
                           <a href="#">Java从入门到精通</a> 
                        </li> -->
                    </ul>
            	</div>
            </div>
            <div class="c3_b1_right">
            	<h1>天气预报<a href="#">更多</a></h1>
            	<ul>
            	<iframe name="weather_inc" src="http://i.tianqi.com/index.php?c=code&id=2&num=1" width="220" height="70" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
        <div class="fg-box" id="box">
	   <div class="fg-line"></div>
	   <dl>    	
        <dd>
        	<div class="fg-left"><span>5秒前</span></div>
            <div class="fg-right">
            <h4>李**购了168元</h4>
            <a href="#">杰普书城10001</a>
            </div>
        </dd>
        <dd>
        	<div class="fg-left"><span>10秒前</span></div>
            <div class="fg-right">
            <h4>张**购了20元</h4>
            <a href="#">杰普书城10002</a>
            </div>
        </dd>
        <dd>
        	<div class="fg-left"><span>10秒前</span></div>
            <div class="fg-right">
            <h4>王**购了75元</h4>
            <a href="#">杰普书城10003</a>
            </div>
        </dd>
        <dd>
        	<div class="fg-left"><span>1分钟前</span></div>
            <div class="fg-right">
            <h4>钱**购了60元</h4>
            <a href="#">杰普书城10004</a>
            </div>
        </dd>
        <dd>
        	<div class="fg-left"><span>2分钟前</span></div>
            <div class="fg-right">
            <h4>李**购了72元</h4>
            <a href="#">杰普书城10005</a>
            </div>
        </dd>
        <dd>
        	<div class="fg-left"><span>3小时前</span></div>
            <div class="fg-right">
            <h4>张**购了326元</h4>
            <a href="#">杰普书城10006</a>
            </div>
        </dd>
    </dl>
</div>
</div>
</ul>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
                	<!-- <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li> -->
                
            </div>
            <div style="clear:both"></div>
        </div>
        <div class="c3_b2">
        	<ul>
        	<c:forEach items="${applicationScope.books }" var="item">
            	<li>
                	<div class="c3_b2_txt">
                    	<h1>${item.name }</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="showBookServlet?id=${item.book_id }">更多精彩，点击进入</a></p>
                    </div>
                </li>
                </c:forEach>
               <!--  <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li class="no_mr">
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li>
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                <li class="no_mr">
                	<div class="c3_b2_txt">
                    	<h1>疯狂JAVA讲义</h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li> -->
            </ul>
        </div>
    <div class="c20"></div>
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
        <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>
   <a href="#gotop" >
       <img src="__PUBLIC__/img/backTop.png" id="gotop" alt="" style="position: fixed;bottom: 10px;display: none;">
   </a>
<script type="text/javascript">  
    $(function () {
        $(function(){
            $(window).scroll(function(){
                if($(window).scrollTop() > 100){
                    $("#gotop").fadeIn(1000);//一秒渐入动画
                }else{
                    $("#gotop").fadeOut(1000);//一秒渐隐动画
                }
            });

            $("#gotop").click(function(){
                $('body,html').animate({scrollTop:0},1000);
            });
        });
    });
</script>
</body>
</html>