<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/6
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失物招领系统网站</title>
    <link href="../assets/images/common/lostfound.ico" rel="SHORTCUT ICON" />
    <link href="../assets/css/common/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/common/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/common/base.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/common/nav.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/common/Home.css" rel="stylesheet" type="text/css"/>
</head>
<body>
 <div class="home-page">
     <jsp:include   page="include/nav.jsp" flush="true"/>
     <div class="promo section section-on-bg">
         <div class="container text-center">
             <h2 class="title number-style">寻找遗失的美好</h2>
             <div class="search">
                 <form class="form-inline" role="form">
                     <div class="input-group">
                         <input class="home-input" type="text" placeholder="钱包、证件..." name="goods"/>
                         <button type="button" class="btn btn-danger btn-lg search-btn">搜索</button>
                     </div>
                 </form>
             </div>
             <div class="lost-info">
                 <div class="column">
                     <div class="number-style" id="losts">1234</div>
                     <div class="text">丢失物品</div>
                 </div>
                 <div class="column">
                     <div class="number-style" id="founds">2345</div>
                     <div class="text">拾到物品</div>
                 </div>
                 <div class="column">
                     <div class="number-style" id="success">2345</div>
                     <div class="text">成功找到</div>
                 </div>
             </div>
         </div>
     </div>
 </div>

 <!--js-->
 <script src="../assets/js/jquery-2.1.1.min.js"></script>
 <script src="../assets/js/bootstrap.min.js"></script>

 <script>
     var winHeight =  window.screen.availHeight;
     $(".bg-slider-wrapper").css( "height" , winHeight + "px");
     $(".slide").css( "height" , winHeight + "px");
 </script>

</body>
</html>
