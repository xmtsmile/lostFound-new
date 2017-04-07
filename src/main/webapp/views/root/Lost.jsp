<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>失物招领管理系统</title>
    <link href="../../images/root/title.ico" rel="SHORTCUT ICON" />
    <link href="../../css/common/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../css/common/font-awesome.min.css" rel="stylesheet"/>
    <link href="../../css/root/main.css" rel="stylesheet" />
    <link href="../../css/root/banner.css" rel="stylesheet" />
    
</head>

<body>
<div id="wrapper">
    <nav class="navbar navbar-default top-navbar" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><h1 class="fontStyle-cartoon1">Lost&Found</h1></a>
        </div>

        <ul class="nav navbar-top-links navbar-right">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-user fa-fw"></i><span style="color: #000;">admin </span> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#" data-toggle="modal" data-target="#editPassword"><i class="fa fa-gear fa-fw"></i>修改密码</a></li>
                    <li class="divider"></li>
                    <li><a href="Login.jsp"><i class="fa fa-sign-out fa-fw"></i>退出</a></li>
                </ul>
            </li>
        </ul>
    </nav>

    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a href="Home.jsp"><i class="fa fa-home"></i>首页</a>
                </li>
                <li>
                    <a href="Root.jsp"><i class="fa fa-user-circle"></i>用户管理</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-cubes"></i>物品管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="active-menu" href="Lost.jsp"><i class="fa fa-tag"></i>丢失物品</a>
                        </li>
                        <li>
                            <a href="pickUp.jsp"><i class="fa fa-tag"></i>拾回物品</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="Dynamic.html"><i class="fa fa-pencil-square-o"></i>留言管理</a>
                </li>
            </ul>
        </div>
    </nav>
    <div id="page-wrapper">
        <div class="header">
            <h1 class="page-header fontStyle-cartoon2"></h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-cubes"></i> 物品管理</a></li>
                <li class="active">丢失物品</li>
            </ol>

        </div>
        <div id="page-inner">

        </div>
    </div>
</div>

<!--修改密码模态框-->
<div class="modal fade in" id="editPassword" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="false" style="display: none; padding-right: 17px;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="modalTitle1">修改密码</h4>
            </div>
            <div class="modal-body">
                <form class="detailTab form-inline" style="padding-left: 70px;">
                    <div class="form-group">
                        <label>旧密码</label>
                        <input type="password" class="form-control w150" id="oldPwd"/>
                        <span class="warn-info warn1"></span>
                    </div><br/>
                    <div class="form-group">
                        <label>新密码</label>
                        <input type="password" class="form-control w150" id="newPwd"/>
                        <span class="warn-info warn2"></span>
                    </div><br/>
                    <div class="form-group">
                        <label>确认新密码</label>
                        <input type="password" class="form-control w150" id="confirmPwd"/>
                        <span class="warn-info warn3"></span>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-reply"></i> 取消</button>
                <a href="#" class="btn btn-success" id="savePwd"><i class="fa fa-check"></i> 确定</a>
            </div>
        </div>
    </div>
</div>

<script src="../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="../../js/bootstrap.min.js" type="text/javascript"></script>
<script src="../../js/root/jquery.metisMenu.js"></script>
<script src="../../js/root/custom-scripts.js"></script>

</body>
</html>