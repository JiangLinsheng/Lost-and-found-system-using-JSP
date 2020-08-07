<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>服务条款和隐私政策</title>
		<link type="text/css" rel="stylesheet" href="//mat1.gtimg.com/www/css/article/global_v1.0.3.css" />
		<style type="text/css">
		body,ol,ul,h1,h2,h3,h4,h5,h6,p,th,td,dl,dd,form,fieldset,legend,input,textarea,select{margin:0;padding:0}
		body{font:12px "微软雅黑","Arial Narrow",HELVETICA;background:#fff;-webkit-text-size-adjust:100%}
		.layout{width:1000px;margin:0 auto;border-bottom:1px solid #d1d1d1;padding-bottom:20px;}
		.layout h1{font-size:20px;line-height:80px;text-indent:62px;font-family:"微软雅黑";color:#0c0c0c;}
		.layout h2{font-size:18px;font-family:"微软雅黑";height:38px;line-height:38px;margin:38px 0 10px;border-left:3px solid #187ac7;background:#eaf1fa;text-indent:16px;color:#187ac7;}
		.layout h3{font-size:14px;line-height:18px;margin:20px 0 10px;color:#355a77;font-weight:bold;}
		.layout p{font-size:14px;line-height:32px;margin:20px 0 10px}
		.layout ul{margin:10px 10px 10px 30px}
		.layout li{padding-left:17px;font-size:14px;line-height:32px;background:url(//mat1.gtimg.com/www/images/qq2012/privacyIcon.png) no-repeat left 12px;}
		.layout .inner{margin:10px 10px 10px 0;}
		.layout .inner li{background:url(//mat1.gtimg.com/www/images/qq2012/privacyIcon.png) no-repeat left -482px;}
		.layout strong{color:#355a77;}
		.clear{clear:both;}
		.mininavRight{float:right;}
		.main { position:relative; z-index:20 }
		.scrollBtn { z-index:50 }
		.about-video-foot .bg-mb { display:block}
		.bg-mb { display:none }
		.VRelaLinkStyle{ background:url(//mat1.gtimg.com/news/images/article/icon_video.png) no-repeat 2px 0; padding-left:25px;  }
		#C-Main-Article-QQ .hd { z-index:30 }
		.m-mod-1 {}
		.m-mod-1 h2 { font-weight: bold; font-size: 14px; margin-bottom: 8px }
		
		#videoListWithFollow{ width:640px; overflow:hidden}
		#videoListWithFollow ul{width:666px; position:relative; left:-26px}
		#videoListWithFollow li{width:140px; float:left; margin:0 0 0 26px; display:inline; overflow:hidden}
		#videoListWithFollow .pic{width:140px; height:80px; overflow:hidden; display:block; position:relative;text-decoration:none}
		#videoListWithFollow img{width:140px; background:#000; border:0; vertical-align:middle}
		.newVideoNumWF{display:none; font:10px/16px "Arial"; -webkit-text-size-adjust:100%; color:#fff; position:absolute; z-index:2;left:6px; bottom:4px; padding-left:21px; background:url(//mat1.gtimg.com/news/dc/images/sprite_collect.32.png) no-repeat 0 -79px;_background:url(//mat1.gtimg.com/news/dc/images/sprite_collect.ie6.png) no-repeat 0 -79px}
		.newVideoFBtn{ width:18px; height:17px; position:relative; display:block; z-index:3; background:url(//mat1.gtimg.com/news/dc/images/sprite_collect.32.png) no-repeat 0 0;_background:url(//mat1.gtimg.com/news/dc/images/sprite_collect.ie6.png) no-repeat 0 0; margin:-21px 0 0 117px; text-decoration:none; cursor:pointer}
		.newVideoFBtn:hover{ background-position:0 -25px}
		.newVideoFBtnEd,.newVideoFBtnEd:hover{background-position:0 -50px}
		#videoListWithFollow p{font:12px/17px "simsun"; padding:7px 3px 0}
		#videoListWithFollow p a{color:#000; text-decoration:none}
		#videoListWithFollow p a:hover{text-decoration:underline}
		.mask_video_bg { position: absolute; z-index:1; left: 0; top:50px; width:100%; height:30px; background: url("//mat1.gtimg.com/news/images/article/mask_video_1.png") no-repeat left bottom; _background: none; _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="//mat1.gtimg.com/news/images/article/mask_video_1.png") }
		#C-Main-Article-QQ #videoListWithFollow .hd{border-bottom:0}
		
		/* sogou划词 */
		#sogouTips { position: absolute; left: 9999999999em; z-index:10;width:56px; height:24px}
		#sogouTips a { background: url(//mat1.gtimg.com/www/sogou/sogou_tips_v1.png) no-repeat 0 0; display: block; width: 33px; height: 24px; line-height: 24px; padding-left: 23px; color: #000; font-size: 12px; text-decoration: none; _position:relative; margin: -32px 0 0; }
		#sogouTips a:hover { color:#45a1ea; background-position: 0 -34px }
		
		.ad-cnt-1 #F_Z_Width1 { margin:-18px 0 44px }
		.infoNum{color:#fff;}
		.layout .ysNav{width:1000px;height:266px;background:#f8f8f8;}
		.layout .ysNav ul{width:500px;float:left;margin:13px 0 0;padding:0;}
		.layout .ysNav li{width:500px;font-size:14px;line-height:30px;float:left;margin:0;padding:0;color:#187ac7;text-indent:66px;background:none;}
		.layout .ysNav li a{color:#187ac7;}
		.layout .ysNav li a:hover{color:#105a94;}
		#tcopyright{color:#333!important;padding-top:15px;}
		#tcopyright a{color:#333!important;}
		#toTop{width:54px;height:54px;display:block;position:fixed;_position:absolute;right:25px;bottom:45px;background:url(//mat1.gtimg.com/www/images/qq2012/qqbg_1.6.1.png) -700px -110px;opacity:0.3;filter:alpha(opacity=30);}
		#toTop:hover{opacity:1;filter:alpha(opacity=100);}
		
		.footer{display:none;padding:10px 45px 12px 0;overflow:hidden;position:relative;background: #404a54;}
		.footer .foot_user{display: none;}
		.footer .links{height:25px;line-height:25px;color:#565e61;font-size:13px;text-align:left}
		.footer .links a{color:#95a0ac;margin:0 0 0 8px;display:inline;float:left}
		.footer .links a:before{content:'';background:#565e61;width:1px;height:12px;display:inline-block;vertical-align:-1px;font-size:1em;color:#565e61;margin-right:8px}
		.footer .links a:first-child:before{display:none}
		.footer .copyright{font-size:13px;color:#707982;text-align:left;text-indent:8px;white-space:nowrap}
		
		@media screen and (max-width: 750px){
			body{width: 100%; position: relative;font-family: Helvetica,STHeiti,Droid Sans Fallback!important; }
			.nav{display: none;}
			.layout{position: relative;overflow: hidden;}
			.layout h1{text-indent: 18px;}
			.layout .ysNav{height: auto; width: 100%;}
			.layout .ysNav ul, .layout .ysNav li{float: none;}
			.layout .ysNav ul{margin: 0;}
			.layout .ysNav li{width: auto; text-indent: 18px;}
			.tcopyright{display: none;}
			.layout h2, .layout h3, .layout h4, .layout p{padding: 0 10px;}
			.footer{display: block;}
		}
		</style>
	</head>

	<body>
	
<div class="layout">
	<h1  style="text-align:left">隐私政策</h1>
	<div class="ysNav">
		<ul>
			<li><a href="#q1">引言</a></li>
			<li><a href="#q2">我们可能收集的信息</a></li>
			<li><a href="#q3">我们可能如何使用信息</a></li>
			<li><a href="#q4">您如何访问和控制自己的个人信息</a></li>
			<li><a href="#q5">我们可能分享的信息</a></li>
			<li><a href="#q6">信息安全</a></li>
			<li><a href="#q7">您分享的信息</a></li>
			<li><a href="#q8">您分享的敏感个人信息</a></li>
		</ul>
		<ul>
			<li><a href="#q9">我们可能如何收集信息</a></li>
			<li><a href="#q10">广告服务</a></li>
			<li><a href="#q11">我们可能向您发送的邮件和信息</a></li>
			<li><a href="#q12">隐私政策的适用例外</a></li>
			<li><a href="#q13">未成年人使用我们的服务</a></li>
			<li><a href="#q14">隐私政策的适用范围</a></li>
			<li><a href="#q15">变更</a></li>
		</ul>
	</div>
	<h2 id="q1" style="text-align:left">引言</h2>
	<p>腾讯重视用户的隐私。您在使用我们的服务时，我们可能会收集和使用您的相关信息。我们希望通过本《隐私政策》向您说明，在使用我们的服务时，我们如何收集、使用、储存和分享这些信息，以及我们为您提供的访问、更新、控制和保护这些信息的方式。本《隐私政策》与您所使用的腾讯服务息息相关，希望您仔细阅读，在需要时，按照本《隐私政策》的指引，作出您认为适当的选择。本《隐私政策》中涉及的相关技术词汇，我们尽量以简明扼要的表述，并提供进一步说明的链接，以便您的理解。</p>
	<h3>您使用或继续使用我们的服务，即意味着同意我们按照本《隐私政策》收集、使用、储存和分享您的相关信息。</h3>
	<p>如对本《隐私政策》或相关事宜有任何问题，请通过<a href="http://kf.qq.com/" target="_blank">http://kf.qq.com/</a>与我们联系。</p>
	
	<h2 id="q2" style="text-align:left">我们可能收集的信息</h2>
	<p>我们提供服务时，可能会收集、储存和使用下列与您有关的信息。如果您不提供相关信息，可能无法注册成为我们的用户或无法享受我们提供的某些服务，或者无法达到相关服务拟达到的效果。</p>
	<h3>您提供的信息</h3>
	<ul>
		<li>您在注册账户或使用我们的服务时，向我们提供的相关个人信息，例如电话号码、电子邮件或银行卡号等；</li>
		<li>您通过我们的服务向其他方提供的共享信息，以及您使用我们的服务时所储存的信息。</li>
	</ul>
	<h3>其他方分享的您的信息</h3>
	<ul>
		<li>其他方使用我们的服务时所提供有关您的共享信息。</li>
	</ul>
	<h3>我们获取的您的信息</h3>
	<p>您使用服务时我们可能收集如下信息：</p>
	<ul>
		<li><strong>日志信息，</strong>指您使用我们的服务时，系统可能通过cookies、web beacon或其他方式自动采集的技术信息，包括：</li>
		<ul class="inner">
			<li>设备或软件信息，例如您的移动设备、网页浏览器或用于接入我们服务的其他程序所提供的配置信息、您的IP地址和移动设备所用的版本和设备识别码；</li>
			<li>在使用我们服务时搜索或浏览的信息，例如您使用的网页搜索词语、访问的社交媒体页面url地址，以及您在使用我们服务时浏览或要求提供的其他信息和内容详情；</li>
			<li>有关您曾使用的移动应用（APP）和其他软件的信息，以及您曾经使用该等移动应用和软件的信息；</li>
			<li>您通过我们的服务进行通讯的信息，例如曾通讯的账号，以及通讯时间、数据和时长；</li>
			<li>您通过我们的服务分享的内容所包含的信息（元数据），例如拍摄或上传的共享照片或录像的日期、时间或地点等。</li>
		</ul>
		<li><strong>位置信息，</strong>指您开启设备定位功能并使用我们基于位置提供的相关服务时，收集的有关您位置的信息，包括：</li>
		<ul class="inner">
			<li>您通过具有定位功能的移动设备使用我们的服务时，通过GPS或WiFi等方式收集的您的地理位置信息；</li>
			<li>您或其他用户提供的包含您所处地理位置的实时信息，例如您提供的账户信息中包含的您所在地区信息，您或其他人上传的显示您当前或曾经所处地理位置的共享信息，您或其他人共享的照片包含的地理标记信息；</li>
			<li>您可以通过关闭定位功能，停止对您的地理位置信息的收集。</li>
		</ul>
	</ul>
	
	<h2 id="q3" style="text-align:left">我们可能如何使用信息</h2>
	<p>我们可能将在向您提供服务的过程之中所收集的信息用作下列用途：</p>
	<ul>
		<li>向您提供服务；</li>
		<li>在我们提供服务时，用于身份验证、客户服务、安全防范、诈骗监测、存档和备份用途，确保我们向您提供的产品和服务的安全性；</li>
		<li>帮助我们设计新服务，改善我们现有服务；</li>
		<li>使我们更加了解您如何接入和使用我们的服务，从而针对性地回应您的个性化需求，例如语言设定、位置设定、个性化的帮助服务和指示，或对您和其他用户作出其他方面的回应；</li>
		<li>向您提供与您更加相关的广告以替代普遍投放的广告；</li>
		<li>评估我们服务中的广告和其他促销及推广活动的效果，并加以改善；</li>
		<li>软件认证或管理软件升级；</li>
		<li>让您参与有关我们产品和服务的调查。</li>		
	</ul>
	<p>为了让您有更好的体验、改善我们的服务或您同意的其他用途，在符合相关法律法规的前提下，我们可能将通过某一项服务所收集的信息，以汇集信息或者个性化的方式，用于我们的其他服务。例如，在您使用我们的一项服务时所收集的信息，可能在另一服务中用于向您提供特定内容，或向您展示与您相关的、非普遍推送的信息。如果我们在相关服务中提供了相应选项，您也可以授权我们将该服务所提供和储存的信息用于我们的其他服务。 </p>
	
	<h2 id="q4" style="text-align:left">您如何访问和控制自己的个人信息</h2>
	<p>我们将尽一切可能采取适当的技术手段，保证您可以访问、更新和更正自己的注册信息或使用我们的服务时提供的其他个人信息。在访问、更新、更正和删除前述信息时，我们可能会要求您进行身份验证，以保障账户安全。</p>
	
	<h2 id="q5" style="text-align:left">我们可能分享的信息</h2>
	<p>除以下情形外，<strong>未经您同意</strong>，我们以及我们的关联公司不会与任何第三方分享您的个人信息：</p>
	<ul>
		<li>我们以及我们的关联公司，可能将您的个人信息与我们的关联公司、合作伙伴及第三方服务供应商、承包商及代理（例如代表我们发出电子邮件或推送通知的通讯服务提供商、为我们提供位置数据的地图服务供应商）分享（他们可能并非位于您所在的法域），用作下列用途：</li>
		<ul class="inner">
			<li>向您提供我们的服务；</li>
			<li>实现“我们可能如何使用信息”部分所述目的；</li>
			<li>履行我们在《腾讯服务协议》或本《隐私政策》中的义务和行使我们的权利；</li>
			<li>理解、维护和改善我们的服务。</li>
		</ul>
	</ul>
	<p>如我们或我们的关联公司与任何上述第三方分享您的个人信息，我们将努力确保该等第三方在使用您的个人信息时遵守本《隐私政策》及我们要求其遵守的其他适当的保密和安全措施。</p>
	<ul>
		<li>随着我们业务的持续发展，我们以及我们的关联公司有可能进行合并、收购、资产转让或类似的交易，您的个人信息有可能作为此类交易的一部分而被转移。我们将在转移前通知您。</li>
		<li>我们或我们的关联公司还可能为以下需要而保留、保存或披露您的个人信息：</li>
		<ul class="inner">
			<li>遵守适用的法律法规；</li>
			<li>遵守法院命令或其他法律程序的规定；</li>
			<li>遵守相关政府机关的要求；</li>
			<li>为遵守适用的法律法规、维护社会公共利益，或保护我们的客户、我们或我们的集团公司、其他用户或雇员的人身和财产安全或合法权益所合理必需的用途。</li>
		</ul>
	</ul>
	
	<h2 id="q6" style="text-align:left">信息安全</h2>
	<p>我们仅在本《隐私政策》所述目的所必需的期间和法律法规要求的时限内保留您的个人信息。</p>
	<p>我们使用各种安全技术和程序，以防信息的丢失、不当使用、未经授权阅览或披露。例如，在某些服务中，我们将利用加密技术（例如SSL）来保护您提供的个人信息。但请您理解，由于技术的限制以及可能存在的各种恶意手段，在互联网行业，即便竭尽所能加强安全措施，也不可能始终保证信息百分之百的安全。您需要了解，您接入我们的服务所用的系统和通讯网络，有可能因我们可控范围外的因素而出现问题。</p>
	
	<h2 id="q7" style="text-align:left">您分享的信息</h2>
	<p>我们的多项服务，可让您不仅与自己的社交网络，也与使用该服务的所有用户公开分享您的相关信息，例如，您在我们的服务中所上传或发布的信息（包括您公开的个人信息、您建立的名单）、您对其他人上传或发布的信息作出的回应，以及包括与这些信息有关的位置数据和日志信息。使用我们服务的其他用户也有可能分享与您有关的信息（包括位置数据和日志信息）。特别是，我们的社交媒体服务，是专为使您与世界各地的用户共享信息而设计，您可以使共享信息实时、广泛地传递。只要您不删除共享信息，有关信息会一直留存在公共领域；即使您删除共享信息，有关信息仍可能由其他用户或不受我们控制的非关联第三方独立地缓存、复制或储存，或由其他用户或该等第三方在公共领域保存。</p>
	<p><strong>因此，请您谨慎考虑通过我们的服务上传、发布和交流的信息内容。</strong>在一些情况下，您可通过我们某些服务的隐私设定来控制有权浏览您共享信息的用户范围。如要求从我们的服务中删除您的相关信息，请通过该等特别服务条款提供的方式操作。</p>
	
	<h2 id="q8" style="text-align:left">您分享的敏感个人信息</h2>
	<p>某些个人信息因其特殊性可能被认为是敏感个人信息，例如您的种族、宗教、个人健康和医疗信息等。相比其他个人信息，敏感个人信息受到更加严格的保护。</p>
	<p>请注意，您在使用我们的服务时所提供、上传或发布的内容和信息（例如有关您社交活动的照片等信息），可能会泄露您的敏感个人信息。您需要谨慎地考虑，是否在使用我们的服务时披露相关敏感个人信息。</p>
	<h3>您同意按本《隐私政策》所述的目的和方式来处理您的敏感个人信息。</h3>
	
	<h2 id="q9" style="text-align:left">我们可能如何收集信息</h2>
	<p>我们或我们的第三方合作伙伴，可能通过cookies和web beacon收集和使用您的信息，并将该等信息储存为日志信息。</p>
	<p>我们使用自己的cookies和web beacon，目的是为您提供更个性化的用户体验和服务，并用于以下用途：</p>
	<ul>
		<li>记住您的身份。例如：cookies和web beacon有助于我们辨认您作为我们的注册用户的身份，或保存您向我们提供的有关您的喜好或其他信息；</li>
		<li>分析您使用我们服务的情况。例如，我们可利用cookies和web beacon来了解您使用我们的服务进行什么活动，或哪些网页或服务最受您的欢迎；</li>
		<li>广告优化。Cookies和web beacon有助于我们根据您的信息，向您提供与您相关的广告而非进行普遍的广告投放。</li>
	</ul>
	<p>我们为上述目的使用cookies和web beacon的同时，可能将通过cookies和web beacon收集的非个人身份信息，经统计加工后提供给广告商或其他合作伙伴，用于分析用户如何使用我们的服务，并用于广告服务。</p>
	<p>我们的产品和服务上可能会有广告商或其他合作方放置的cookies和web beacon。这些cookies和web beacon可能会收集与您相关的非个人身份信息，以用于分析用户如何使用该等服务、向您发送您可能感兴趣的广告，或用于评估广告服务的效果。这些第三方cookies和web beacon收集和使用该等信息，不受本《隐私政策》约束，而是受相关使用者的隐私政策约束，我们不对第三方的cookies或web beacon承担责任。</p>
	<p>您可以通过浏览器设置拒绝或管理cookies或web beacon。但请注意，如果停用cookies或web beacon，您有可能无法享受最佳的服务体验，某些服务也可能无法正常使用。同时，您还会收到同样数量的广告，但这些广告与您的相关性会降低。</p>
	
	<h2 id="q10" style="text-align:left">广告服务</h2>
	<p>我们可能使用您的相关信息，向您提供与您更加相关的广告。</p>
	<p>我们也可能使用您的信息，通过我们的服务、电子邮件或其他方式向您发送营销信息，提供或推广我们或第三方的如下商品和服务：</p>
	<ul>
		<li>我们的商品或服务，我们的关联公司和合作伙伴的商品或服务，包括即时通讯服务、网上媒体服务、互动娱乐服务、社交网络服务、付款服务、互联网搜索服务、位置和地图服务、应用软件和服务、数据管理软件和服务、网上广告服务、互联网金融，以及其他社交媒体、娱乐、电子商务、资讯和通讯软件或服务（统称“<strong>互联网服务</strong>”）；</li>
		<li>第三方互联网服务供应商，以及与下列有关的第三方商品或服务：食物和餐饮、体育、音乐、电影、电视、现场表演及其他艺术和娱乐、书册、杂志和其他刊物、服装和配饰、珠宝、化妆品、个人健康和卫生、电子、收藏品、家用器皿、电器、家居装饰和摆设、宠物、汽车、酒店、交通和旅游、银行、保险及其他金融服务、会员积分和奖励计划，以及我们认为可能与您相关的其他商品或服务。</li>
		<p>如您不希望我们将您的个人信息用作前述广告用途，您可以通过我们在广告中提供的相关提示，或在特定服务中提供的指引，要求我们停止为上述用途使用您的个人信息。</p>
	</ul>
	
	<h2 id="q11" style="text-align:left">我们可能向您发送的邮件和信息</h2>
	<h4>邮件和信息推送</h4>
	<p>您在使用我们的服务时，我们可能使用您的信息向您的设备发送电子邮件、新闻或推送通知。如您不希望收到这些信息，可以按照我们的相关提示，在设备上选择取消订阅。</p>
	<h4>与服务有关的公告</h4>
	<p>我们可能在必要时（例如因系统维护而暂停某一项服务时）向您发出与服务有关的公告。您可能无法取消这些与服务有关、性质不属于推广的公告。</p>
	
	<h2 id="q12" style="text-align:left">隐私政策的适用例外</h2>
	<p>我们的服务可能包括或链接至第三方提供的社交媒体或其他服务（包括网站）。例如：</p>
	<ul>
		<li>您利用 “分享”键将某些内容分享到我们的服务，或您利用第三方连线服务登录我们的服务。这些功能可能会收集您的相关信息（包括您的日志信息），并可能在您的电脑装置cookies，从而正常运行上述功能；</li>
		<li>我们通过广告或我们服务的其他方式向您提供链接，使您可以接入第三方的服务或网站。</li>
	</ul>
	<p>该等第三方社交媒体或其他服务可能由相关的第三方或我们运营。您使用该等第三方的社交媒体服务或其他服务（包括您向该等第三方提供的任何个人信息），须受该第三方的服务条款及隐私政策（而非《通用服务条款》或本《隐私政策》）约束，您需要仔细阅读其条款。<strong>本《隐私政策》仅适用于我们所收集的信息，并不适用于任何第三方提供的服务或第三方的信息使用规则，我们对任何第三方使用由您提供的信息不承担任何责任。</strong></p>
	
	<h2 id="q13" style="text-align:left">未成年人使用我们的服务</h2>
	<p>我们鼓励父母或监护人指导未满十八岁的未成年人使用我们的服务。我们建议未成年人鼓励他们的父母或监护人阅读本《隐私政策》，并建议未成年人在提交的个人信息之前寻求父母或监护人的同意和指导。</p>
	
	<h2 id="q14" style="text-align:left">隐私政策的适用范围</h2>
	<p>除某些特定服务外，我们所有的服务均适用本《隐私政策》。这些特定服务将适用特定的隐私政策。<strong>针对某些特定服务的特定隐私政策，将更具体地说明我们在该等服务中如何使用您的信息。</strong>该特定服务的隐私政策构成本《隐私政策》的一部分。<strong>如相关特定服务的隐私政策与本《隐私政策》有不一致之处，适用该特定服务的隐私政策。</strong></p>
	<p>除本《隐私政策》另有规定外，本《隐私条款》所用词语将与《腾讯服务协议》所定义的词语具有相同的涵义。</p>
	<h3>请您注意，本《隐私政策》不适用于以下情况：</h3>
	<ul>
		<li>通过我们的服务而接入的第三方服务（包括任何第三方网站）收集的信息；</li>
		<li>通过在我们服务中进行广告服务的其他公司或机构所收集的信息。</li>
	</ul>
	
	<h2 id="q15" style="text-align:left">变更</h2>
	<p>我们可能适时修订本《隐私政策》的条款，该等修订构成本《隐私政策》的一部分。<strong>如该等修订造成您在本《隐私政策》下权利的实质减少，我们将在修订生效前通过在主页上显著位置提示或向您发送电子邮件或以其他方式通知您。在该种情况下，若您继续使用我们的服务，即表示同意受经修订的本《隐私政策》的约束。</strong></p>
	<div class="clear"></div>
</div>
	</body>
</html>

