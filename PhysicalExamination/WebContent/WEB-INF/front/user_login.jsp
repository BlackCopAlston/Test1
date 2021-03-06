<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.2.min.js"></script>
</head>

<body>
		<c:choose>
				<c:when test="${msg==1}">
					<script>window.alert("登录失败，请检查账户密码！")</script>
				</c:when>
				<c:when test="${msg==2}">
					<script>window.alert("账户密码不能为空！")</script>
				</c:when>
		</c:choose>
	
	<div style="position:fixed;background-color:rgba(6,6,6,0.5);left:50%;top:50%;margin-left:-190px;margin-top:-145px">
		<form id="loginform" action="${pageContext.request.contextPath}/front/userLogin.action" method="post">
		<div id="login">
		<div id="title" style="margin-left:126px;">用户登录</div>
			<table id="loginTable">
				<tr style="height:20px">
					<td>账户：</td>
					<td><input type="text" id="userName" name="userName" required="required" style="height:25px"></td>
				</tr>
				
				<tr style="height:20px">
					<td>密码：</td>
					<td><input type="password" id="userPwd" name="userPassword" required="required" style="height:25px"></td>
				</tr>
				<%-- <tr style="height:20px">
					<td>验证码：</td>
					<td><input type="text" id="validate" name="validate" required="required" style="height:25px"></td>
					<td><img src="${pageContext.request.contextPath}/code/image"  id="img" ></td>
				</tr>
				<tr><td><input type="hidden" name="method"  value="userLogin"></td></tr> --%>
					   
			</table>
			<p style="text-align:center">
				<input type="submit" value="登录" name="userLogin" id="userLogin" style="width: 80px;margin-left: 40px;height:35px;">
			    <input type="button" name="userRegister" id="userRegister" value="注册" style="width: 80px;margin-left: 40px;height:35px;" onclick="register()">
			</p>
		</div>
	</form>
	</div>
</body>
	<script>
	var path = "${pageContext.request.contextPath}";
	$("#img").click(function(){
		$("#img").attr("src","${pageContext.request.contextPath}/code/image?"+new Date());
	})
	
	function register(){
		alert('注册页面')
	window.location.href=path+"/user_register.jsp";
	}
	</script>
</html>
