package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 班组危险源信息对象 sys_bzwxy
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
public class SysBzwxy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long bzwxyId;

    /** 名称 */
    @Excel(name = "名称")
    private String bzwxyName;

    /** 状态 */
    @Excel(name = "状态")
    private String bzwxyStatus;

    /** 路径 */
    @Excel(name = "路径")
    private String bzwxyPath;

    public void setBzwxyId(Long bzwxyId) 
    {
        this.bzwxyId = bzwxyId;
    }

    public Long getBzwxyId() 
    {
        return bzwxyId;
    }
    public void setBzwxyName(String bzwxyName) 
    {
        this.bzwxyName = bzwxyName;
    }

    public String getBzwxyName() 
    {
        return bzwxyName;
    }
    public void setBzwxyStatus(String bzwxyStatus) 
    {
        this.bzwxyStatus = bzwxyStatus;
    }

    public String getBzwxyStatus() 
    {
        return bzwxyStatus;
    }
    public void setBzwxyPath(String bzwxyPath) 
    {
        this.bzwxyPath = bzwxyPath;
    }

    public String getBzwxyPath() 
    {
        return bzwxyPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bzwxyId", getBzwxyId())
            .append("bzwxyName", getBzwxyName())
            .append("createBy", getCreateBy())
            .append("bzwxyStatus", getBzwxyStatus())
            .append("bzwxyPath", getBzwxyPath())
            .toString();
    }
}
