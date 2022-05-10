-- 乱写的
CREATE TABLE user_basic_info (
    user_id        BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    user_nick_name VARCHAR(200) NOT NULL UNIQUE COMMENT '用户昵称',
    user_real_name VARCHAR(200) NOT NULL COMMENT '用户姓名',
    user_gender    INT          NOT NULL DEFAULT 0 COMMENT '用户性别 0:保密 1:男 2:女',
    user_age       INT          NULL COMMENT '用户年龄',
    user_phone     VARCHAR(50)  NULL COMMENT '联系方式-手机号',
    user_email     VARCHAR(100) NULL COMMENT '联系方式-电子邮箱',
    user_avatar    VARCHAR(500) NULL COMMENT '用户头像',
    gmt_created    DATETIME     NOT NULL COMMENT '记录创建时间',
    gmt_updated    DATETIME     NOT NULL COMMENT '记录更新时间'
) COMMENT '用户信息表';

CREATE TABLE user_vip_info (
    user_vip_id         BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    user_id             BIGINT   NOT NULL COMMENT '关联用户ID',
    vip_type            INT      NOT NULL DEFAULT 1 COMMENT 'VIP类型 1:青铜 2:白银 3:黄金',
    vip_expire_time     DATETIME NOT NULL COMMENT 'VIP到期时间',
    vip_first_open_time DATETIME NOT NULL COMMENT 'VIP首次开通时间',
    vip_status          INT      NOT NULL DEFAULT 0 COMMENT 'VIP状态 0:已过期 1:开通中',
    gmt_created         DATETIME NOT NULL COMMENT '记录创建时间',
    gmt_updated         DATETIME NOT NULL COMMENT '记录更新时间'
) COMMENT '会员信息表';

CREATE TABLE order_basic_info (
    order_id       BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    order_no       VARCHAR(50) NOT NULL UNIQUE COMMENT '订单编号',
    user_id        BIGINT      NOT NULL COMMENT '下单用户',
    order_type     INT         NOT NULL DEFAULT 1 COMMENT '订单类型 1:购买会员订单 2:商品订单',
    order_ext_info LONGTEXT    NULL COMMENT '订单额外信息',
    address_id     BIGINT      NULL COMMENT '关联地址ID',
    order_time     DATETIME    NOT NULL COMMENT '下单时间',
    order_status   INT         NOT NULL DEFAULT 0 COMMENT '订单状态 0:待处理 1:已支付 2:已取消 3:已退款',
    gmt_created    DATETIME    NOT NULL COMMENT '记录创建时间',
    gmt_updated    DATETIME    NOT NULL COMMENT '记录更新时间'
) COMMENT '订单记录表';

CREATE TABLE order_detail_info (
    order_detail_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    order_id        BIGINT       NOT NULL COMMENT '关联订单ID',
    order_no        VARCHAR(50)  NOT NULL COMMENT '关联订单编号',
    shop_id         BIGINT       NOT NULL COMMENT '关联商品ID',
    buy_num         INT          NOT NULL DEFAULT 1 COMMENT '商品数量',
    shop_name       VARCHAR(200) NOT NULL COMMENT '商品名称',
    shop_price      DOUBLE       NOT NULL COMMENT '商品价格',
    shop_img_url    VARCHAR(500) NULL COMMENT '商品图片链接',
    gmt_created     DATETIME     NOT NULL COMMENT '记录创建时间',
    gmt_updated     DATETIME     NOT NULL COMMENT '记录更新时间'
) COMMENT '订单明细表';