package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 应急救援预案信息对象 sys_yjjy
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
public class SysYjjy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long yjjyId;

    /** 名称 */
    @Excel(name = "名称")
    private String yjjyName;

    /** 状态 */
    @Excel(name = "状态")
    private String yjjyStatus;

    /** 路径 */
    @Excel(name = "路径")
    private String yjjyPath;

    public void setYjjyId(Long yjjyId) 
    {
        this.yjjyId = yjjyId;
    }

    public Long getYjjyId() 
    {
        return yjjyId;
    }
    public void setYjjyName(String yjjyName) 
    {
        this.yjjyName = yjjyName;
    }

    public String getYjjyName() 
    {
        return yjjyName;
    }
    public void setYjjyStatus(String yjjyStatus) 
    {
        this.yjjyStatus = yjjyStatus;
    }

    public String getYjjyStatus() 
    {
        return yjjyStatus;
    }
    public void setYjjyPath(String yjjyPath) 
    {
        this.yjjyPath = yjjyPath;
    }

    public String getYjjyPath() 
    {
        return yjjyPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("yjjyId", getYjjyId())
            .append("yjjyName", getYjjyName())
            .append("createBy", getCreateBy())
            .append("yjjyStatus", getYjjyStatus())
            .append("yjjyPath", getYjjyPath())
            .toString();
    }
}
