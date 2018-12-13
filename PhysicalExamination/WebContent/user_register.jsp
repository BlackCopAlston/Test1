<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>注册</title>
<style>
	form span{
		width:120px;
		display:inline-block;
		text-align:right}
</style>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.2.js"></script>
<body>
	<div>
	<form id="registerForm" action="${pageContext.request.contextPath}/front/userRegiest.action" method="post">
		<table>
			<tbody>
				<tr>
					<td>手机号：</td>
					<td><input type="text" name="userTel" id="userTel" required="required"><span id="nameMse" style="color:red" ></span></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="text" name="userPassword" id="userPassword" required="required"></td>
				</tr>
				<tr>
					<td>再次输入密码：</td>
					<td><input type="text" name="userPassword2" id="userPassword2" required="required"></td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="userName" id="userName" required="required"></td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td><input type="text" name="userAge" id="userAge" required="required"></td>
				</tr>
				<tr>
					<td>地址：</td>
					<td><input type="text" name="userAddress" id="userAddress" required="required"></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td>
					<input type="radio" name="userSex" value="男" checked="checked">男
					<input type="radio" name="userSex" value="女">女
					</td>
				</tr>
				<tr>
					<td>血型：</td>
					<td>
						<select id="userBlood" name="userBlood">
							<option value="A型">A型</option>
							<option value="B型">B型</option>
							<option value="O型">O型</option>
							<option value="AB型">AB型</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>出生日期：</td>
					<td><input type="date" id="userBirth" name="userBirth" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册" style="margin-left:120px;margin-top:10px"></td>
					<td><input type="reset" value="重填" style="margin-top:10px"></td>
				</tr>
			</tbody>
		</table>
    </form>
    </div>
</body>
	<script>
	var path = "${pageContext.request.contextPath}";
	$("#img").click(function(){
		$("#img").attr("src","${pageContext.request.contextPath}/code/image?"+new Date());
	});

	</script>
</html>
