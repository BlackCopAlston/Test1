<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.2.min.js"></script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/front/userLogin.action" method="post">
			<div>
				<table>
					<tbody align="left">
						<tr>
							<td align="right">账号：</td>
							<td align="left" style="width: 500px; height: 30px;"><input
								type="text" id="userAccount" name="userAccount"></td>
						</tr>
						<tr>
							<td align="right">密码：</td>
							<td align="left"><input type="password" id="userPwd"
								name="userPwd"></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div align="left" style="margin-left: 60px;">
				<input class="loginbtn" type="submit" value="登录">
			</div>
	</form>
</body>
</html>