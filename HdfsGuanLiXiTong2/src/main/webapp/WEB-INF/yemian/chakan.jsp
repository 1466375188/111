
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
<table align="center" border="1">
<tr>
<td>文件名</td>
<td>用户</td>
<td>文件大小</td>
<td>最后修改时间</td>
<td>文件路径</td>
<td>操作</td>
</tr>
<#list list as xianshi>
	<tr>
	<td>${xianshi.name}</td>
	<td>${xianshi.yonghu}</td>
	<td>${xianshi.daxiao} b</td>
	<td>${xianshi.shijian}</td>
	<td>${xianshi.lujing}</td>
	<td><a href="xiazai.do?name=${xianshi.name}">下载</a></td>
	</tr>
</#list>
<tr>
<td colspan="6" align="center"><a href="tiaozhuan.do">上传</a></td>
</tr>
</table>
</form>
</body>
</html>