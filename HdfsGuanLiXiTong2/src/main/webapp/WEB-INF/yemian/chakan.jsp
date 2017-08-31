<#assign base=request.contextPath />
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${base}/control/plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="${base}/control/css/begtable.css" />
</head>

<body>
	<div style="margin: 15px;">
		<blockquote class="layui-elem-quote">文件后台管理</blockquote>
		<fieldset class="layui-elem-field">
			<legend>文件管理</legend>
			<div class="layui-field-box">
			</div>
		</fieldset>
		<hr>
		<div style="  border: 1px solid #009688;">
				<div class="beg-table-body">
					<table 
						class="beg-table beg-table-bordered beg-table-striped beg-table-hovered">
						<thead>
							<tr align="center">
								<td>文件名</td>
								<td>用户</td>
								<td>文件大小</td>
								<td>最后修改时间</td>
								<td>文件路径</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<#list list as xianshi>
							<tr align="center">
								<td>${xianshi.name}</td>
								<td>${xianshi.yonghu}</td>
								<td>${xianshi.daxiao}b</td>
								<td>${xianshi.shijian}</td>
								<td>${xianshi.lujing}</td>
								<td><a href="xiazai.do?name=${xianshi.name}" style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;">下载</a></td>
							</tr>
							</#list>
							<tr>
								<td colspan="6" align="center"><a href="tiaozhuan.do" ><input type="button" value="上传" style="width:100px;height:30px;background: rgb(0, 142, 173);color: rgb(255, 255, 255);"></a></td>
							</tr
						</tbody>
					</table>
				</div>
				
		
		</div>
	</div>



</body>

</html>