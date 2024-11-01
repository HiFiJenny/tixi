package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 劳防用品申领记录对象 sys_lfyp
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
public class SysLfyp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long lfypId;

    /** 名称 */
    @Excel(name = "名称")
    private String lfypName;

    /** 状态 */
    @Excel(name = "状态")
    private String lfypStatus;

    /** 路径 */
    @Excel(name = "路径")
    private String lfypPath;

    public void setLfypId(Long lfypId) 
    {
        this.lfypId = lfypId;
    }

    public Long getLfypId() 
    {
        return lfypId;
    }
    public void setLfypName(String lfypName) 
    {
        this.lfypName = lfypName;
    }

    public String getLfypName() 
    {
        return lfypName;
    }
    public void setLfypStatus(String lfypStatus) 
    {
        this.lfypStatus = lfypStatus;
    }

    public String getLfypStatus() 
    {
        return lfypStatus;
    }
    public void setLfypPath(String lfypPath) 
    {
        this.lfypPath = lfypPath;
    }

    public String getLfypPath() 
    {
        return lfypPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("lfypId", getLfypId())
            .append("lfypName", getLfypName())
            .append("createBy", getCreateBy())
            .append("lfypStatus", getLfypStatus())
            .append("lfypPath", getLfypPath())
            .toString();
    }
}
