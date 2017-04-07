<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详细分类查看</title>
    <link href="../../images/common/lostfound.ico" rel="SHORTCUT ICON" />
    <link href="../../css/common/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../css/common/font-awesome.min.css" rel="stylesheet"/>
    <link href="../../css/common/base.css" rel="stylesheet"/>
    <link href="../../css/common/nav.css" rel="stylesheet"/>
    <link href="../../css/users/detail-goods.css" rel="stylesheet"/>

</head>
<body>
<div class="home-page">
    <jsp:include   page="../include/nav.jsp" flush="true"/>

    <div class="breadcrumb-area">
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-home"></i></a></li>
                <li><a href="#">分类查看</a></li>
                <li class="active">钥匙</li>
            </ol>
        </div>
    </div>

    <!-- shop-area start -->
    <div class="look-area">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-4">
                    <div class="column">
                        <h2 class="title-block">查看类别</h2>
                        <div class="sidebar-widget">
                            <h3 class="sidebar-title">物品来源</h3>
                            <ul class="sidebar-menu">
                                <li><a href="#">拾到 <span>(13)</span></a></li>
                                <li><a href="#">丢失 <span>(13)</span></a></li>
                            </ul>
                        </div>
                        <div class="sidebar-widget">
                            <h3 class="sidebar-title">时间顺序</h3>
                        </div>
                        <div class="sidebar-widget">
                            <h3 class="sidebar-title">拾到区域</h3>
                            <ul class="sidebar-menu">
                                <li><a href="#"> 图书馆  <span>(13)</span></a></li>
                                <li><a href="#"> 食堂  <span>(13)</span></a></li>
                                <li><a href="#"> 教学楼  <span>(13)</span></a></li>
                                <li><a href="#"> 田径场  <span>(13)</span></a></li>
                                <li><a href="#"> 其他场所  <span>(13)</span></a></li>
                            </ul>
                        </div>
                        <div class="sidebar-widget">
                            <h3 class="sidebar-title">其他</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-9 col-sm-8">
                    <div class="shop-page-bar">
                        <div>
                            <!-- Tab panes -->
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="home">
                                    <div class="row listBorder">
                                        <div class="col-md-4 col-sm-4">
                                            <div class="product-wrapper">
                                                <div class="product-img">
                                                    <img class="goodsPic" src="../../images/users/5.jpg" alt="" />
                                                    <div class="product-action">
                                                        <a href="#"><i class="pe-7s-cart"></i></a>
                                                        <a href="#"><i class="pe-7s-like"></i></a>
                                                        <a href="#"><i class="pe-7s-folder"></i></a>
                                                        <a href="#" data-toggle="modal" data-target="#productModal"><i class="pe-7s-look"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-8 col-sm-8">
                                            <h3>XXX物品丢失</h3>
                                            <p>dhaskjdhalkhlksfjhalkdhalkfjfhaklhfakjlfh</p>
                                            <p>dhaskjdhalkhlksfjhalkdhalkfjfhaklhfakjlfh</p>
                                            <p>dhaskjdhalkhlksfjhalkdhalkfjfhaklhfakjlfh</p>
                                            <div class="text-right">2019-8-8</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 登录模态框（Modal） -->
<div class="modal fade login-modal" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">登录</h4>
            </div>
            <div class="modal-body">
                <div class="login">
                    <div class="login-top">
                        <form>
                            <input type="text" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}">
                            <input type="password" value="密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios"  value="option1" checked> 管理员
                                </label>
                                <label>
                                    <input type="radio" name="optionsRadios"  value="option1" checked> 用户
                                </label>
                            </div>
                            <div class="forgot">
                                <a href="#">忘记密码？</a>
                                <input type="submit" value="登录"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer"></div>
        </div>
    </div>
</div>

<!-- 注册模态框（Modal） -->
<div class="modal fade login-modal" id="register-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel1">注册</h4>
            </div>
            <div class="modal-body">
                <div class="register">
                    <div class="register-top">
                        <form>
                            <input type="text" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}"/>
                            <input type="text" value="真实姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '真实姓名';}"/>
                            <input type="text" value="手机号码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '手机号码';}"/>
                            <input type="text" value="QQ" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'QQ';}"/>
                            <input type="text" value="找回密码-问题" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '找回密码-问题';}"/>
                            <input type="text" value="找回密码-答案" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '找回密码-答案';}"/>
                            <input type="password" value="密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}"/>
                            <div class="registerBtn">
                                <input type="submit" value="注册"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer"></div>
        </div>
    </div>
</div>

<!--js-->
<script src="../../js/jquery-2.1.1.min.js"></script>
<script src="../../js/bootstrap.min.js"></script>

</body>
</html>