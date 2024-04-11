package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 班组安全生产责任书对象 doc
 * 
 * @author ruoyi
 * @date 2024-04-11
 */
public class Doc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 文件名字 */
    @Excel(name = "文件名字")
    private String docName;

    /** 文件是否上架，0：下架，1：上架 */
    private Integer putWayFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDocName(String docName) 
    {
        this.docName = docName;
    }

    public String getDocName() 
    {
        return docName;
    }
    public void setPutWayFlag(Integer putWayFlag) 
    {
        this.putWayFlag = putWayFlag;
    }

    public Integer getPutWayFlag() 
    {
        return putWayFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("docName", getDocName())
            .append("putWayFlag", getPutWayFlag())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
