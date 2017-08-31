
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<script type="text/javascript">
	
</script>
<style>
#a {
	background: rgb(0, 142, 173)
}
</style>
</head>

<body id="a" background="3399ff">


	<center>
		<table>
			<tr>
				<td>
					<h1>
						下载成功<span id="jumpTo" style="color: red"></span>秒后返回首页
					</h1>
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
		</table>
	</center>
	<script type="text/javascript">
		function countDown(secs, surl) {
			//alert(surl);     
			var jumpTo = document.getElementById('jumpTo');
			jumpTo.innerHTML = secs;
			if (--secs > 0) {
				setTimeout("countDown(" + secs + ",'" + surl + "')", 1000);
			} else {
				location.href = surl;
			}
		}

		countDown(3, 'chakan.do');
	</script>
</body>

</html>