<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失物招领系统网站</title>
    <link href="../../images/common/lostfound.ico" rel="SHORTCUT ICON" />
    <link href="../../css/common/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../css/common/font-awesome.min.css" rel="stylesheet"/>
    <link href="../../css/common/base.css" rel="stylesheet"/>
    <link href="../../css/common/nav.css" rel="stylesheet"/>
    <link href="../../css/users/Lost.css" rel="stylesheet"/>

</head>
<body>
<div class="home-page">
    <jsp:include   page="../include/nav.jsp" flush="true"/>

    <div class="found-container">
        <form class="form-horizontal" role="form">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">发布标题</h3>
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">标题  <span class="red-star">*</span></label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">标签1  <span class="red-star">*</span></label>
                        <div class="col-sm-3">
                            <select class="form-control">
                                <option>图书馆</option>
                                <option>食堂</option>
                                <option>教学楼</option>
                                <option>田径场</option>
                                <option>其他场所</option>
                            </select>
                        </div>
                        <label class="col-sm-2 control-label">标签2  <span class="red-star">*</span></label>
                        <div class="col-sm-3">
                            <select class="form-control">
                                <option>钥匙</option>
                                <option>书刊</option>
                                <option>钱包</option>
                                <option>数码设备</option>
                                <option>证件</option>
                                <option>其他</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">基本信息</h3>
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">物品种类  <span class="red-star">*</span></label>
                        <div class="col-sm-7 form-inline">
                            <input type="text" class="form-control"> <span class="col-sm-push-5 control-label">如：相机、钱包</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">详细描述  <span class="red-star">*</span></label>
                        <div class="col-sm-5">
                            <textarea class="form-control" rows="3"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">物品照片</label>
                        <div class="col-sm-5">
                            <label class="sr-only" for="inputimg">文件输入</label>
                            <input type="file" id="inputimg">
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">丢失地点</h3>
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">丢失地点 <span class="red-star">*</span></label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">联系方式</h3>
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">联系地址</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">联系人  <span class="red-star">*</span></label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control">
                        </div>
                        <label class="col-sm-2 control-label">手机  <span class="red-star">*</span></label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">邮箱  <span class="red-star">*</span></label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control">
                        </div>
                        <label class="col-sm-2 control-label">QQ  <span class="red-star">*</span></label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                </div>
            </div>
            <div class="text-center">
                <button class="btn btn-lg btn-danger">提交</button>
                <button class="btn btn-lg btn-danger">取消</button>
            </div>
        </form>
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