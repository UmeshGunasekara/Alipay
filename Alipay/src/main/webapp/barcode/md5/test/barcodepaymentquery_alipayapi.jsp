<%
/* *
 *功能：alipay.acquire.overseas.spot.pay接口接入页
 *版本：3.3
 *日期：2012-08-14
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。

 *************************注意*****************
 *如果您在接口集成过程中遇到问题，可以按照下面的途径来解决
 *1、商户服务中心（https://b.alipay.com/support/helperApply.htm?action=consultationApply），提交申请集成协助，我们会有专业的技术工程师主动联系您协助解决
 *2、商户帮助中心（http://help.alipay.com/support/232511-16307/0-16307.htm?sh=Y&info_type=9）
 *3、支付宝论坛（http://club.alipay.com/read-htm-tid-8681712.html）
 *如果不想使用扩展功能请把扩展功能参数赋空值。
 **********************************************
 */
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.alipay.barcode.md5.config.*"%>
<%@ page import="com.alipay.barcode.md5.util.*"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>alipay.acquire.overseas.spot.pay接口</title>
	</head>
	<%
		////////////////////////////////////请求参数//////////////////////////////////////

		//alipay_seller_id

		String partner_trans_id = new String(request.getParameter("WIDpartner_trans_id").getBytes("ISO-8859-1"),"UTF-8");
		//Same value with partner ID
		//partner_trans_id
		String alipay_trans_id = new String(request.getParameter("WIDalipay_trans_id").getBytes("ISO-8859-1"),"UTF-8");
		//The transaction Id on the partner system which could be a sale order id and payment order id.
		
		//////////////////////////////////////////////////////////////////////////////////
		
		//把请求参数打包成数组
		Map<String, String> sParaTemp = new HashMap<String, String>();
		sParaTemp.put("service", "alipay.acquire.overseas.query");
        sParaTemp.put("partner", AlipayConfig.partner);
        sParaTemp.put("_input_charset", AlipayConfig.input_charset);
		if(!partner_trans_id.trim().isEmpty()){
			sParaTemp.put("partner_trans_id", partner_trans_id);
		}
		if(!alipay_trans_id.trim().isEmpty()){
			sParaTemp.put("alipay_trans_id", alipay_trans_id);
		}

		
		//建立请求
		String sHtmlText = AlipaySubmit.buildRequest("", "", sParaTemp);
		String fHtmlText =AlipayCore.html(sHtmlText);
		System.out.println(fHtmlText);
		out.println(fHtmlText);
	%>
	<body>
	</body>
</html>
