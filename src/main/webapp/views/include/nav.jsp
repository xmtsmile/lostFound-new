<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失物招领系统网站</title>
    <link href="../../assets/images/common/lostfound.ico" rel="SHORTCUT ICON" />
    <link href="../../assets/css/common/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="../../assets/css/common/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="../../assets/css/common/base.css" rel="stylesheet" type="text/css"/>
    <link href="../../assets/css/common/nav.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="header" class="header navbar-fixed-top sm-bottom">
    <div class="container">
        <h1 class="logo"><a href="../Home.jsp"><span class="logo-text">失物招领1</span></a></h1>
        <nav class="main-nav navbar-right" role="navigation">
            <div class="navbar-header">
                <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div id="navbar-collapse" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="nav-item text"><a href="../Home.jsp">主页</a></li>
                    <li class="nav-item text"><a href="../users/Lost.jsp">丢失物品</a></li>
                    <li class="nav-item text"><a href="../users/Found.jsp">拾到物品</a></li>
                    <li class="active nav-item text"><a href="../users/Look.jsp">分类浏览</a></li>
                    <li class="active nav-item text"><a href="../users/personalCenter.jsp">个人中心</a></li>
                    <li class="nav-item nav-item-cta text"><button class="btn btn-cta-secondary" data-toggle="modal" data-target="#login-modal">登录</button></li>
                    <li class="nav-item nav-item-cta text"><button class="btn btn-cta-secondary" data-toggle="modal" data-target="#register-modal">注册</button></li>
                </ul>
            </div>
        </nav>
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
                        <form id="loginData" enctype="multipart/form-data">
                            <input type="text" name="name" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}">
                            <input type="password" name="pass" value="密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios"  value="0" checked> 管理员
                                </label>
                                <label>
                                    <input type="radio" name="optionsRadios"  value="1" checked> 用户
                                </label>
                            </div>
                        </form>
                        <div class="forgot">
                            <a href="#">忘记密码？</a>
                            <input id="loginBtn" type="submit" value="登录"/>
                        </div>
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
                        <form role="form" action="/user/register" method="post" >
                            <input type="text" name="name" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}"/>
                            <input type="text" name="realName" value="真实姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '真实姓名';}"/>
                            <input type="text" name="phone" value="手机号码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '手机号码';}"/>
                            <input type="text" name="id" value="QQ" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'QQ';}"/>
                            <input type="text" name="secretId" value="找回密码-问题" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '找回密码-问题';}"/>
                            <input type="text" name="secretAns" value="找回密码-答案" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '找回密码-答案';}"/>
                            <input type="password" name="pass" value="密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}"/>
                        </form>
                        <div class="registerBtn">
                            <input type="submit" value="注册"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer"></div>
        </div>
    </div>
</div>

<!--js-->
<script src="../../assets/js/jquery-2.1.1.min.js"></script>
<script src="../../assets/js/bootstrap.min.js"></script>
<script src="../../assets/js/common/commonFunction.js"></script>
<script src="../../assets/js/common/login.js"></script>

</body>
</html>