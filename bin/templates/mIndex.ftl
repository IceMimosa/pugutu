<!DOCTYPE html>
<!-- saved from url=(0019)http://m.mmjpg.com/ -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="Cache-Control" content="no-siteapp">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="viewport"
          content="width=device-width,initial-scale=1, minimum-scale=1.0, maximum-scale=1, user-scalable=no">
    <meta name="apple-mobile-web-app-title" content="屁股图">
    <title>屁股图 - 每日分享高清美女图片</title>
    <meta name="keywords" content="屁股图,美女图片,性感美女,mm">
    <meta name="description" content="屁股图(www.pigutu.com)每日分享最好看的性感美女图片、高清美女写真，做最好的美女网站！">
    <link href="http://hellohappy.oss-cn-shanghai.aliyuncs.com/css/mstyle.css" rel="stylesheet" type="text/css">
</head>

<body>
<div id="header">
    <ul class="topbar">
        <li class="searchbtn"><span class="icon" onclick="viewsearch();"></span></li>
        <li class="logo"><a href="http://m.mmjpg.com/">屁股图</a></li>
        <li class="nav"><span class="icon" onclick="viewnav();"></span>
            <ul class="menu" id="menu">
                <li><i class="icon"></i><a href="http://m.pigutu.com/index/1">首页</a></li>
                <li><i class="icon"></i><a href="http://m.pigutu.com/hot/1">排行榜</a></li>
                <li><i class="icon"></i><a href="http://m.pigutu.com/recommend/1">推荐</a></li>
            <#list categorys as category>
                <li><i class="icon"></i><a href="${category.getParameter()}">${category.getTitle()}</a></li>
            </#list>
            </ul>
        </li>
    </ul>
    <div class="search" id="search">
        <form name="formsearch" id="formsearch" method="post" action="http://m.mmjpg.com/search.php"><p><span><input
                type="text" name="searchkey" id="searchkey"><i class="icon" onclick="searchpic();"></i></span></p>
        </form>
    </div>
</div>
<div>
    <ul class="article" id="article">
    <#list imageSetLists as imageSetList>
        <li><h2><a href="http://m.mmjpg.com/mm/1073">${imageSetList.getTitle()}</a></h2>
            <div class="pic"><a href="http://m.mmjpg.com/mm/1073"><img src="https://www.baidu.com/img/bd_logo1.png"
                                                                       data-img="https://www.baidu.com/img/bd_logo1.png"
                                                                       alt="${imageSetList.getTitle()}"></a></div>
            <div class="info"><span>${imageSetList.getCreateTime()}</span><span
                    class="like">喜欢(${imageSetList.getLikeCount()})</span></div>
        </li>
    </#list>
    </ul>
</div>
<div class="page">
    <ul>
        <li class="pre"><i>上一页</i></li>
        <li>第1页</li>
        <li class="next"><a href="http://m.mmjpg.com/index/${pageIndex}">下一页</a></li>
    </ul>
</div>
<div class="footer">
    <div class="tool"><span><a href="http://www.pigutu.com/">去电脑版</a></span><span class="gotop"><a
            href="http://m.pigutu.com/#">返回顶部</a></span></div>
    <div class="copyright">Copyright © 2016 屁股图 pigutu.com</div>
</div>
<div id="topbtn" onclick="goscrolltop();"></div>
<script type="text/javascript" src="http://hellohappy.oss-cn-shanghai.aliyuncs.com/js/mimage.js"></script>

</body>
</html>