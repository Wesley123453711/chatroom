<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html>
<html>
<head>
<script src=massange.js></script>
<base href="<%=basePath %>">
<meta charset="UTF-8">
<title>My chat_room</title>

</head>
<body>

	<form action="InputInformation" method="post">
	<textarea rows="25" cols="105" name="show_textarea"><%=request.getAttribute("input_textarea") %></textarea>
	<br>
	<textarea rows="5" cols="105" name="input_textarea"></textarea><br>
	<input type="submit" value="發送" name="button_one" style="width:100px ;height:40px ;font-size:25px;"/>
	<br>
	</form>
</body>
</html>