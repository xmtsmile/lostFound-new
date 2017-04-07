USE lostfound;

DROP TABLE IF EXISTS contacts;
CREATE TABLE contacts (
    id varchar(32) NOT NULL COMMENT 'id',
    psn_name varchar(50) DEFAULT NULL COMMENT '姓名',
    phone varchar(20) DEFAULT NULL COMMENT '手机号码',
    email varchar(50) DEFAULT NULL COMMENT '邮箱',
    qq varchar(20) DEFAULT NULL COMMENT 'QQ号',
    address varchar(1000) DEFAULT NULL COMMENT '地址',
    PRIMARY KEY (id)
)
ENGINE = INNODB
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '联系方式'
ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS kinds;
CREATE TABLE kinds (
    id varchar(32) NOT NULL COMMENT 'id',
    name varchar(50) NOT NULL COMMENT '分类名称',
    system tinyint(4) DEFAULT 0 COMMENT '是否系统内置',
    level tinyint(4) DEFAULT 0 COMMENT '分类级别',
    PRIMARY KEY (id)
)
ENGINE = INNODB
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '分类列表'
ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS objects;
CREATE TABLE objects (
    id varchar(32) NOT NULL COMMENT 'id',
    fkind_id varchar(32) NOT NULL COMMENT '一级分类id，区域',
    skind_id varchar(32) NOT NULL COMMENT '二级分类id，类别',
    status tinyint(4) NOT NULL COMMENT '状态 0 未归还 1 已归还 2 已丢失 3 已找回',
    record_time timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '录入时间',
    pic_path varchar(1000) DEFAULT NULL COMMENT '物品照片',
    PRIMARY KEY (id)
)
ENGINE = INNODB
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '捡拾/丢失物品'
ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS posts;
CREATE TABLE posts (
    id varchar(32) NOT NULL COMMENT 'id',
    title varchar(1000) NOT NULL COMMENT '标题',
    user_id varchar(32) NOT NULL COMMENT '用户id',
    object_id varchar(32) NOT NULL COMMENT '物品id',
    contact_id varchar(32) NOT NULL COMMENT '联系人id',
    obj_detail text DEFAULT NULL COMMENT '物品描述',
    loc_detail text DEFAULT NULL COMMENT '地点描述',
    PRIMARY KEY (id)
)
ENGINE = INNODB
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '发布的信息(丢失/捡拾)'
ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS secrets;
CREATE TABLE secrets (
    id varchar(32) NOT NULL COMMENT 'id',
    question varchar(1000) NOT NULL COMMENT '密保问题',
    PRIMARY KEY (id)
)
ENGINE = INNODB
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '密保问题列表'
ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id varchar(32) NOT NULL COMMENT 'id',
    name varchar(255) NOT NULL COMMENT '用户名',
    pass varchar(32) NOT NULL COMMENT '用户密码',
    real_name varchar(255) NOT NULL COMMENT '真实姓名',
    phone varchar(20) NOT NULL COMMENT '手机号码',
    secret_id varchar(32) DEFAULT NULL COMMENT '密保id',
    secret_ans varchar(255) DEFAULT NULL COMMENT '密保答案',
    is_admin tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否为管理员',
    PRIMARY KEY (id)
)
ENGINE = INNODB
CHARACTER SET utf8
COLLATE utf8_general_ci
COMMENT = '用户列表'
ROW_FORMAT = DYNAMIC;