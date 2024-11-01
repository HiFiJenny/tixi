drop table if exists sys_bzwxy;
create table sys_bzwxy (
  bzwxy_id           int(11)         auto_increment    comment '编号',
  bzwxy_name         varchar(30)     default ''        comment '名称',
  create_by        varchar(64)     default ''        comment '创建人',
  bzwxy_status       char(1)         default '0'       comment '状态',
  bzwxy_path         varchar(255)    default ''        comment '路径',
  primary key (bzwxy_id)
) engine=innodb auto_increment=1 comment = '班组危险源信息表';