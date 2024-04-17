package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * MSDS对象 doc
 * 
 * @author ruoyi
 * @date 2024-04-17
 */
public class Doc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 文件名字 */
    @Excel(name = "文件名字")
    private String docName;

    /** 是否上架 */
    @Excel(name = "是否上架")
    private Integer putWayFlag;

    /** 文件路径 */
    @Excel(name = "文件路径")
    private String docPath;

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
    public void setDocPath(String docPath) 
    {
        this.docPath = docPath;
    }

    public String getDocPath() 
    {
        return docPath;
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
            .append("docPath", getDocPath())
            .toString();
    }
}
