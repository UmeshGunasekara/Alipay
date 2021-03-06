package com.alipay.thirdpartymerchantqr.rsa.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.3
 *日期：2012-08-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
	
 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”

 *安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 *解决方法：
 *1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 *2、更换浏览器或电脑，重新登录查询。
 */

public class AlipayConfig {
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	// 合作身份者ID，以2088开头由16位纯数字组成的字符串
	public static String partner = "";
	// 商户的私钥
	public static String private_key = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAPsV+ZV13nvRwVfcbvoVq26CZiUY0W3D1vaQWIE+8kMzTJ5fnZJaoC2NUGLNp/rM3OJvVr3F63Lt2cDEQuJ1AmZSPfPiXBvePk9Gf6XHkV4DIAlZEFKbn4ncDOE6gelK2ABO8RdP8BSd2uB2fkB1+LjmShQHwjMnMZmaT7kNpusjAgMBAAECgYAF3ZaOCknfRKAqqEijaPwvQbaXKURDNy7/ZZHbuxe3wCwLCxrIP3u8dK+rDzjcYArM82LoXgZJEgtjOHKDjc43f93eb9LWJOBIVdyFPICwCPLf3wir+59KP0M6P64jzxdnslW3uMTKKE+V1KHsWS4wppoWQl2w3PbYt8Pc1kgFUQJBAP4j/On467GZbkMZw0MQhcXRuXeaYIC/TjVkEE7kkJiuC+mSh8LpJGU6L4/cE9dg8dmPJTcmndeBokNC8cISRdsCQQD87EPwUMzmLUmpzAjOFr43Il2becns2OXHhUgoP0rHXSgbj2B7uAbx8MLsXB24a6l8+P3JwqwcEVYL4AhQ9IZZAkBKrNZvBZZz7AqLKvHGLf+wvcxKiZEbo5rec1WbaOvYASQ88LJ1oj3whKVfFyK5YaIO9FHSH8W3gj7klrIk/WuLAkAd7qgrrKRTKVDqc2cnXLGuPLbvS36GNTUcY72iZbsn1PKGMHWurpzDzUaESnKJ/NPWInGGiy9rMvIH/b9+NTIhAkEAkPOjmfa1WGxAR7lo2UXlkdO1F7JMyc9HgeB8GoZbJ1wNX9bHuugUtfR1hPvUIwPe+8e11rSp82lB7yczjeUl9w==";
	
	// 支付宝的公钥，无需修改该值
	public static String ali_public_key  = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	

	// 调试用，创建TXT日志文件夹路径
	public static String log_path = "D:\\";
	public static String notify_url ="http://商户网站/atinterface/notify_url.jsp";

	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";
	
	// 签名方式 不需修改
	public static String sign_type = "RSA";
	



}
