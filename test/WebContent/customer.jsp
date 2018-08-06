<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
   String path = request.getContextPath();
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href ="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>个人信息</title>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">个人信息</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">基本资料</a></li>
<!--       <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li> -->
      <li class="layui-nav-item">
        <a href="javascript:;">消息管理</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
<!--           <dd><a href="">消息管理</a></dd> -->
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="images/196H.jpg" class="layui-nav-img">
          李泽众
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      <li class="layui-nav-item"><a href="">账号管理</a></li>
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">安全设置 </a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">修改登录密码</a></dd>
            <dd><a href="javascript:;">手机绑定</a></dd>
            <dd><a href="javascript:;">密保问题设置</a></dd>
            <dd><a href="">其他</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">个人资料</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">收货地址</a></dd>
            <dd><a href="javascript:;">修改头像、昵称</a></dd>
            <dd><a href="">消息提醒设置</a></dd>
          </dl>
        </li>
                <li class="layui-nav-item">
          <a href="javascript:;">账号绑定</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">支付宝绑定</a></dd>
            <dd><a href="javascript:;">微信绑定</a></dd>
            <dd><a href="javascript:;">微博绑定</a></dd>
            <dd><a href="javascript:;">分享绑定</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;"></div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    <!-- <iframe width="500" scrolling="no" height="15" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=11&bdc=%23&icon=1&site=12"></iframe> -->
    <marquee> <iframe width="500" scrolling="no" height="15" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=11&bdc=%23&icon=1&site=12"></iframe></marquee>
    <marquee>欢迎来到杰普电子商城</marquee>
  </div>
</div>
<script src="layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>
</body>
</html>