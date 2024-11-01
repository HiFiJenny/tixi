drop table if exists sys_bzaq;
create table sys_bzaq (
  bzaq_id           int(11)         auto_increment    comment '编号',
  bzaq_name         varchar(30)     default ''        comment '名称',
  create_by        varchar(64)     default ''        comment '创建人',
  bzaq_status       char(1)         default '0'       comment '状态',
  bzaq_path         varchar(255)    default ''        comment '路径',
  primary key (bzaq_id)
) engine=innodb auto_increment=1 comment = 'bzaq信息表';