drop table if exists sys_yjjy;
create table sys_yjjy (
  yjjy_id           int(11)         auto_increment    comment '编号',
  yjjy_name         varchar(30)     default ''        comment '名称',
  create_by        varchar(64)     default ''        comment '创建人',
  yjjy_status       char(1)         default '0'       comment '状态',
  yjjy_path         varchar(255)    default ''        comment '路径',
  primary key (yjjy_id)
) engine=innodb auto_increment=1 comment = '应急救援预案信息表';