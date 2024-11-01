drop table if exists sys_msds;
create table sys_msds (
  msds_id           int(11)         auto_increment    comment '编号',
  msds_name         varchar(30)     default ''        comment '名称',
  create_by        varchar(64)     default ''        comment '创建人',
  msds_status       char(1)         default '0'       comment '状态',
  msds_path         varchar(255)    default ''        comment '路径',
  primary key (msds_id)
) engine=innodb auto_increment=1 comment = 'MSDS信息表';