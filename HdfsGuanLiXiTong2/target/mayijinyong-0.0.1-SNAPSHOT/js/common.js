/*
 * 给jquery增加了获取地址栏信息的方法
 */
(function($) {
	$.getUrlParam = function(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if (r != null)
			return unescape(r[2]);
		return null;
	}
})(jQuery);

var namePattern = /^[\u4e00-\u9fa5]{2,10}$/;// 用户姓名
var phonePattern = /^\d{11}$/;// 手机号
var birthPattern = /^\d{4}-\d{2}-\d{2}$/;// 出生日期
var idnoPattern = /^\d{17}[\dxX]$/;// 身份证
var pingan = {
	clearTextInput : function(text) {
		text.val("");
	},
	clearRadioInput : function(radio) {
		radio.removeAttr("checked");
	},
	clearSelect : function(select, html) {
		select.html(html);
	},
	clearProvince:function(province){
		pingan.clearSelect(province, '<option value="">请选择省份</option>')
	}
	,
	clearCity:function(city){
		pingan.clearSelect(city, '<option value="">请选择城市</option>')
	}
	,
	clearTown:function(town){
		pingan.clearSelect(town, '<option value="">请选择区县</option>')
	},
	initArea : function(basePath, province, city, town) {
		$.get(basePath + "0", function(data) {
			var html = '<option value="">请选择省份</option>';
			$.each(data, function(index, value) {
				html += '<option value="' + value.areaId + '">'
						+ value.areaName + '</option>';
			});
			province.html(html);
		});
		pingan.clearCity(city);
		pingan.clearTown(town);
		province.change(function() {
			var provinceId = $(this).val();
			pingan.clearCity(city);
			pingan.clearTown(town);
			if (provinceId != "") {
				$.get(basePath + provinceId, function(data) {
					var html = '<option value="">请选择城市</option>';
					$.each(data, function(index, value) {
						html += '<option value="' + value.areaId + '">'
								+ value.areaName + '</option>';
					});
					city.html(html);
				});
			}
		});
		city.change(function() {
			var cityId = $(this).val();
			pingan.clearTown(town);
			if (cityId != "") {
				$.get(basePath + cityId, function(data) {
					var html = '<option value="">请选择区县</option>';
					$.each(data, function(index, value) {
						html += '<option value="' + value.areaId + '">'
								+ value.areaName + '</option>';
					});
					town.html(html);
				});
			}
		});
	}
}
var validateUtils = {
	isName : function(name) {
		return namePattern.test(name)
	},
	isBirth : function(birth) {
		return birthPattern.test(birth)
	},
	isPhone : function(phone) {
		return phonePattern.test(phone)
	},
	isIdno : function(idno) {
		return idnoPattern.test(idno)
	}
}