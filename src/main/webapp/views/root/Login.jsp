<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>失物招领管理系统</title>

    <link href="../images/title.ico" rel="SHORTCUT ICON" />
    <link href="../css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../css/font-awesome.min.css" rel="stylesheet"/>
    <link href="../css/main.css" rel="stylesheet" />
    <link href="../css/Login.css" rel="stylesheet" />
</head>
<body>
<div class="login">
    <div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1 class="fontStyle-cartoon">Lost&Found</h1><h1><strong>失物招领管理系统</strong></h1>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                    <h3>登录中心</h3>
                                    <div class="login-alert" style="color: #de615e; font-size: 12px;"></div>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-key"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <div id="myTabContent" class="tab-content">
                                <div class="tab-pane fade in active" id="login">
                                     <form role="form" action="Home.jsp" method="post" class="login-form">
                                          <div class="form-group">
                                              <label class="sr-only" for="form1-username">用户名</label>
                                              <input type="text" name="" placeholder="用户名" class="form-username form-control" id="form1-username" />
                                          </div>
                                          <div class="form-group">
                                              <label class="sr-only" for="form1-password">密码</label>
                                              <input type="password" name="" placeholder="密码" class="form-password form-control" id="form1-password" />
                                          </div>
                                          <button type="submit" class="btn">登 录</button>
                                     </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="../../js/bootstrap.min.js" type="text/javascript"></script>
<script src="../../js/Login.js"></script>
</body>
</html>