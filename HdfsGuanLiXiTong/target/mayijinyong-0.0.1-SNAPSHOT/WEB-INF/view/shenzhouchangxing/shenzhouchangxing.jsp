<#assign base=request.contextPath />
<html lang="zh">
<head>
<meta charset="UTF-8">
<title>平安保险|神州畅行</title>
<meta
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no"
	name="viewport" id="viewport" />
<meta name="keywords" content="平安保险 神州畅行">
<meta name="description" content="平安保险 神州畅行">
<link href="${base}/css/shenzhouchangxing.css" rel="stylesheet"
	type="text/css">
<link href="${base}/css/laydate.css" rel="stylesheet" type="text/css">
</head>
<body>
	<input type="hidden" id="base" value="${base}">
	<div class="warp">
		<!--神州畅行头部-->
		<div class="navi_top">
			<div class="navi_top_center">
				<img src="${base}/img/shenzhouchangxing/navi_top.png" alt="平安直通logo">
			</div>
		</div>
		<!--神州畅行内容-->
		<div class="navi_center">
			<div class="navi_left">
				<div class="left_title">
					<p>免费保障期限365天</p>
				</div>
				<div class="left_div1">
					<span>保险责任描述：</span>在保险期间内，承担被保险人在乘坐商业运营的飞机、火车、地铁、轻轨、轮船、汽车、出租车期间因遭受意外伤害事故所导致的身故、残疾责任
				</div>
				<div class="left_div2">
					<img src="${base}/img/shenzhouchangxing/left_tu.png" alt="保费">
				</div>
			</div>
			<form action="" method="post">
				<div class="navi_right">
					<div class="right_div">
						<!-- 提示框-->
						<div class="navi_hide"></div>
						<div class="right_div_top">神州畅行</div>
						<ul class="right_ul">
							<li class="right_li">
								<div class="right_li_left">姓 名</div>
								<div class="right_li_rigth">
									<input type="text" placeholder="请输入您的姓名" name="name"
										class="name" />
								</div>
							</li>
							<li class="right_li">
								<div class="right_li_left">性 别</div>
								<div class="right_li_rigth1">
									<label><input name="sex" class="sex" type="radio"
										value="1">&nbsp;男 </label><label><input name="sex"
										class="sex" type="radio" style="margin-left: 30px;" value="0">&nbsp;女</label>
								</div>
							</li>
							<li class="right_li">
								<div class="right_li_left">出生日期</div>
								<div class="right_li_rigth">
									<input type="text" placeholder="请输入您的出生日期" onclick="laydate()"
										name="birth" class="birth" />
								</div>
							</li>
							<li class="right_li">
								<div class="right_li_left">手机号码</div>
								<div class="right_li_rigth">
									<input type="text" placeholder="请输入您的手机号码" name="phone"
										class="phone" />
								</div>
							</li>
							<li class="right_li">
								<div class="right_li_left">身份证号码</div>
								<div class="right_li_rigth">
									<input type="text" placeholder="请输入您的身份证号码" name="idno"
										class="idno" />
								</div>
							</li>
							<li class="right_li">
								<div class="right_li_left">省份城市</div>
								<div class="right_li_rigth2">
									<select name="province" class="province">

									</select> <select name="city" class="city">

									</select> <select name="town" class="town">

									</select>


								</div>
							</li>
						</ul>
						<div class="right_but">
							<input type="button" onClick="submitForm()" value="免费领取" />
						</div>
					</div>
				</div>
			</form>
			<div class="navi_font">
				<p class="navi_p_one">免责条款</p>
				<p class="navi_p_two">1、每一客户受赠平安出行保险以 1 份为限。保险对象为出生 25 -50
					周岁，身体健康、能正常工作和劳动。</p>
				<p class="navi_p_two">2、本保险仅提供电子保单，仅限赠送。保单生效后客户会自动收到短信通知，您也可以通过平安官网自助卡
					平台及寿险免费险平台查询功能查询您的保单信息。</p>
				<p class="navi_p_two">3、投保成功后，请将短信保存并将短信上的电子保单号记录在适当的位置，以方便查询及理赔。</p>
				<p class="navi_p_two">4、保险生效日期以被保险人收到短信通知上的保险起止日期为准。对保险起至日期之外所发生的保险事故本公司不负给付保险金责任。</p>
				<p class="navi_p_three">5、告知义务：依据我国《保险法》的规定，投保人、被保险人应如实告知，否则保险人有权依法解除保险合同，并对于保险合同解除前发生的保险事故不负任何责任。投保人、被保险人在投
					保时，应填写正确的个人信息，否则保险人有权依法解除保险合同。</p>
				<p class="navi_p_two">6、本保险不接受撤保、退保、加保及被保险人更换。</p>
				<p class="navi_p_two">7、免费险适用条款以及保单信息可以登陆 www.pingan.com 网站查询。</p>
			</div>
		</div>
		<!--神州畅行内容-->

		<!--遮罩层-->
		<div class="navi_hide1"></div>
		<div class="navi_show">
			<div class="show_div1">
				<img src="${base}/img/shenzhouchangxing/navi_diu.png" alt="领取成功">
			</div>
			<div class="show_div2">
				<p>我们稍后会把订单号，发送至您手机请注意查收！</p>
				<p>保单信息可以登录www.pingan.com网站查询</p>
			</div>
			<div class="show_div3">
				<input type="button" value="返回" />
			</div>
		</div>
	</div>
</body>
<script src="${base}/js/laydate.js"></script>
<script src="${base}/js/jquery-2.1.4.min.js"></script>
<script src="${base}/js/common.js"></script>
<script>
	var basePath = $("#base").val()
	$(function() {
		clearArea()
		
		$(".province").change(
				function() {
					$(".city").html('<option value="">请选择市</option>');
					$(".town").html('<option value="">请选择县</option>');
					var province = $(".province").val();
					$.get(basePath + "/areas/" + province, function(data) {
						var html = '<option value="">请选择市</option>';

						$.each(data, function(index, value) {
							html += '<option value="'+value.id+'">'
									+ value.name1 + '</option>'

						});
						$(".city").html(html)
					});

				});
		$(".city").change(
				
				function() {
					$(".town").html('<option value="">请选择县</option>');
					var province = $(".city").val();
					$.get(basePath + "/areas/" + province, function(data) {
						var html = '<option value="">请选择县</option>';
						$.each(data, function(index, value) {
							html += '<option value="'+value.id+'">'
									+ value.name1 + '</option>'

						});
						$(".town").html(html)
					});

				});
			
		
		
		
	
		

	
		/* $('.right_but input').click(function() {
			$('.navi_hide').show().html("显示错误信息").delay(600).fadeOut();
			$('.navi_hide1').show();
			$('.navi_show').show();
		});*/
		// 点击遮罩层里的“确定”按钮
		$('.show_div3 input').click(function() {
			$('.navi_hide1').hide();
			$('.navi_show').hide();
			clear()
		}); 

	});
	function clearArea(){
		//初始清空
		$(".province").html('<option value="">请选择省</option>');
		$(".city").html('<option value="">请选择市</option>');
		$(".town").html('<option value="">请选择县</option>');

		$.get(basePath + "/areas/0", function(data) {
			var html = '<option value="">请选择省</option>';
			$.each(data, function(index, value) {
				html += '<option value="'+value.id+'">' + value.name1
						+ '</option>'

			});
			$(".province").html(html);
		});
		}
	function clear(){
		$(".name").val("");
		$(".sex").removeAttr("checked");
		$(".birth").val("");
		$(".phone").val("");
		$(".idno").val("");
		clearArea();
	}
	function error(text){
		$('.navi_hide').show().html(text).delay(600).fadeOut();	
	}
	
	function submitForm(){
		
		var datas={};
		datas.cid=$.getUrlParam("cid");
		datas.mid=$.getUrlParam("mid");
		
		datas.pid="PA000000CXSF-CXWY-01";
		datas.name1=$(".name").val();
		datas.sex=$(".sex:checked").val();
		datas.birth=$(".birth").val();
		datas.phone=$(".phone").val();
		datas.idno=$(".idno").val();
		datas.province=$(".province").val();
		datas.city=$(".city").val();
		datas.town=$(".town").val();
		if(!/[\u4e00-\u9fa5]{2,10}/.test(datas.name1)){
			error("姓名错误")
			return;
		}
		if(datas.sex==null){
			error("请选择性别");
			return;
		}
		if(!/\d{4}-\d{2}-\d{2}/.test(datas.birth)){
			error("请选择日期");
			return;
		}
		if(!/\d{11}/.test(datas.phone)){
			error("手机号有误");
			return;
		}
		if(!/\d{17}[\dxX]/.test(datas.idno)){
			error("身份证号有误");
			return;
			
		}
		if(datas.province==""||datas.city==""||datas.town==""){
			error("请选择省市县");
			return;
		}
		if(datas.cid==null||datas.cid==""){
			error("渠道码有误");
			return;
		}
		if(datas. mid==null||datas.mid==""){
			error("媒体码有误");
			return;
		}
		$.post(basePath+"/users/add",datas,function(data){
			if(data.code==200){
				$('.navi_hide1').show();
				$('.navi_show').show();
			}
			error(data.result)
			
		});
	}
</script>

</html>