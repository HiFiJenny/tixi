package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * MSDS信息对象 sys_msds
 * 
 * @author ruoyi
 * @date 2024-10-09
 */
public class SysMsds extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long msdsId;

    /** 名称 */
    @Excel(name = "名称")
    private String msdsName;

    /** 状态 */
    @Excel(name = "状态")
    private String msdsStatus;

    /** 路径 */
    @Excel(name = "路径")
    private String msdsPath;

    public void setMsdsId(Long msdsId) 
    {
        this.msdsId = msdsId;
    }

    public Long getMsdsId() 
    {
        return msdsId;
    }
    public void setMsdsName(String msdsName) 
    {
        this.msdsName = msdsName;
    }

    public String getMsdsName() 
    {
        return msdsName;
    }
    public void setMsdsStatus(String msdsStatus) 
    {
        this.msdsStatus = msdsStatus;
    }

    public String getMsdsStatus() 
    {
        return msdsStatus;
    }
    public void setMsdsPath(String msdsPath) 
    {
        this.msdsPath = msdsPath;
    }

    public String getMsdsPath() 
    {
        return msdsPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("msdsId", getMsdsId())
            .append("msdsName", getMsdsName())
            .append("createBy", getCreateBy())
            .append("msdsStatus", getMsdsStatus())
            .append("msdsPath", getMsdsPath())
            .toString();
    }
}
