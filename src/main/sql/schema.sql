CREATE DATABASE seckill;


USE seckill;

-- 创建秒杀库存表
CREATE TABLE seckill (
seckill_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
NAME VARCHAR(120) NOT NULL COMMENT '商品名称',
number INT NOT NULL COMMENT '库存数量',
start_time TIMESTAMP NOT NULL COMMENT '秒杀开始时间',
end_time TIMESTAMP NOT NULL COMMENT '秒杀结束时间',
create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表'

--秒杀成功明细表
create table success_killed (
seckill_id bigint not null comment '秒杀商品id',
user_phone bigint not null comment '用户手机',
state tinyint not null default -1 comment '状态标识：-1无效 0成功 1已付款',
create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
primary key(seckill_id,user_phone),
key idx_create_time(create_time)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表'