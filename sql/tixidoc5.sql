drop table if exists sys_lfyp;
create table sys_lfyp (
  lfyp_id           int(11)         auto_increment    comment '编号',
  lfyp_name         varchar(30)     default ''        comment '名称',
  create_by        varchar(64)     default ''        comment '创建人',
  lfyp_status       char(1)         default '0'       comment '状态',
  lfyp_path         varchar(255)    default ''        comment '路径',
  primary key (lfyp_id)
) engine=innodb auto_increment=1 comment = '劳防用品申领记录';