drop table if exists sys_doc;
create table sys_doc (
  doc_id           int(11)         auto_increment    comment '编号',
  doc_name         varchar(30)     default ''        comment '名称',
  create_time      datetime        default ''        comment '创建时间',
  create_by        varchar(64)     default ''        comment '创建人',
  doc_status       char(1)         default '0'       comment '状态',
  doc_path         varchar(255)    default ''        comment '文件路径',
  primary key (doc_id)
) engine=innodb auto_increment=1 comment = '文件信息表';

