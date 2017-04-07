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
                    <a class="active-menu" href="Root.jsp"><i class="fa fa-user-circle"></i>用户管理</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-cubes"></i>物品管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="Lost.jsp"><i class="fa fa-tag"></i>丢失物品</a>
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
                <li class="active"><i class="fa fa-user-circle"></i> 用户管理</li>
            </ol>

        </div>
        <div id="page-inner">
            <div class="row">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="panel-title clearfix">
                                    <div class="title pull-left">用户管理</div>
                                    <div class="pull-right">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"
                                           class="collapsed"><i class="fa fa-search"></i> 检索</a>
                                    </div>
                                </div>
                            </div>
                            <div id="collapseOne" class="panel-collapse collapse" style="height: 0px;">
                                <div class="panel-body" style="padding: 15px 0 0 0;">
                                    <div class="filter col-md-12">
                                        <form class="form-inline" id="formData">
                                            <div class="form-group">
                                                <label>用户名</label>
                                                <input type="text" class="form-control w150" name="loginName"/>
                                            </div>
                                            <div class="form-group">
                                                <label>角色名</label>
                                                <input type="text" class="form-control w150" name=""/>
                                            </div>
                                            <div class="form-group">
                                                <button type="button" class="btn btn-success" id="searchBtn"><i
                                                        class="fa fa-search"></i> 查询
                                                </button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <div class="margin-b-sm" id="operationBtn">
                                    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#addInfo"><i class="fa fa-plus"></i> 新增</button>
                                </div>
                                <div class="table-responsive" style="overflow-x: hidden;">
                                    <table class="table table-striped table-bordered table-hover" id="dataTable">
                                        <thead>
                                        <tr>
                                            <th class="col-md-1"><input type=checkbox name=""/>  全选</th>
                                            <th class="col-md-2">用户名</th>
                                            <th class="col-md-2">用户姓名</th>
                                            <th class="col-md-2">角色</th>
                                            <th class="col-md-2">联系方式</th>
                                            <th class="col-md-2"></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td><input type=checkbox name=""/></td>
                                            <td>smile</td>
                                            <td>xmt</td>
                                            <td>管理员</td>
                                            <td>13588272391</td>
                                            <td>
                                                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#editInfo"><i class="fa fa-edit"></i> 修改</button>
                                                <button type="button" class="btn btn-success"><i class="fa fa-trash"></i>删除</button>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><input type=checkbox name=""/></td>
                                            <td>girl</td>
                                            <td>ttt</td>
                                            <td>管理员</td>
                                            <td>13588272392</td>
                                            <td>
                                                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#editInfo"><i class="fa fa-edit"></i> 修改</button>
                                                <button type="button" class="btn btn-success"><i class="fa fa-trash"></i>删除</button>
                                            </td>
                                        </tr>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!--新增用户模态框-->
<div class="modal fade in" id="addInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="false" style="display: none; padding-right: 17px;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="modalTitle1">新增管理员</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="filledData1">
                    <div class="form-group" style="margin-bottom: 5px;">
                        <label class="col-md-3"></label>
                        <div class="col-md-7 warn-info"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 用户名</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="loginName"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 用户姓名</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="name"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 密码</label>
                        <div class="col-md-7">
                            <input type="password" class="form-control" placeholder="6-20位" name="loginPsw"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 角色</label>
                        <div class="col-md-7">
                            <select class="form-control" name="roleTid">
                                <option value="">管理员</option>
                                <option value="">普通用户</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 联系方式</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="phone"/>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-reply"></i> 取消</button>
                <button type="button" class="btn btn-success" id="saveData1"><i class="fa fa-check"></i> 保存</button>
            </div>
        </div>
    </div>
</div>
<!--修改用户模态框-->
<div class="modal fade in" id="editInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="false" style="display: none; padding-right: 17px;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="modalTitle2">修改管理员信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="filledData2">
                    <div class="form-group" style="margin-bottom: 5px;">
                        <label class="col-md-3"></label>
                        <div class="col-md-7 warn-info"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 用户名</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="loginName"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 用户姓名</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="name"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 密码</label>
                        <div class="col-md-7">
                            <input type="password" class="form-control" placeholder="6-20位" name="loginPsw"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 角色</label>
                        <div class="col-md-7">
                            <select class="form-control" name="roleTid">
                                <option value="">管理员</option>
                                <option value="">普通用户</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"><span class="red-star">*</span> 联系方式</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="phone"/>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-reply"></i> 取消</button>
                <button type="button" class="btn btn-success" id="saveData2"><i class="fa fa-check"></i> 保存</button>
            </div>
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
                <h4 class="modal-title" id="modalTitle3">修改密码</h4>
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
<script src="../../js/root/Root.js"></script>

</body>
</html>