package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 班组安全生产责任书对象 sys_bzaq
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
public class SysBzaq extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long bzaqId;

    /** 名称 */
    @Excel(name = "名称")
    private String bzaqName;

    /** 状态 */
    @Excel(name = "状态")
    private String bzaqStatus;

    /** 路径 */
    @Excel(name = "路径")
    private String bzaqPath;

    public void setBzaqId(Long bzaqId) 
    {
        this.bzaqId = bzaqId;
    }

    public Long getBzaqId() 
    {
        return bzaqId;
    }
    public void setBzaqName(String bzaqName) 
    {
        this.bzaqName = bzaqName;
    }

    public String getBzaqName() 
    {
        return bzaqName;
    }
    public void setBzaqStatus(String bzaqStatus) 
    {
        this.bzaqStatus = bzaqStatus;
    }

    public String getBzaqStatus() 
    {
        return bzaqStatus;
    }
    public void setBzaqPath(String bzaqPath) 
    {
        this.bzaqPath = bzaqPath;
    }

    public String getBzaqPath() 
    {
        return bzaqPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bzaqId", getBzaqId())
            .append("bzaqName", getBzaqName())
            .append("createBy", getCreateBy())
            .append("bzaqStatus", getBzaqStatus())
            .append("bzaqPath", getBzaqPath())
            .toString();
    }
}
