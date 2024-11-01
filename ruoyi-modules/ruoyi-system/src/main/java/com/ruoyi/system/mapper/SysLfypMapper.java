package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysLfyp;

/**
 * 劳防用品申领记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
public interface SysLfypMapper 
{
    /**
     * 查询劳防用品申领记录
     * 
     * @param lfypId 劳防用品申领记录主键
     * @return 劳防用品申领记录
     */
    public SysLfyp selectSysLfypByLfypId(Long lfypId);

    /**
     * 查询劳防用品申领记录列表
     * 
     * @param sysLfyp 劳防用品申领记录
     * @return 劳防用品申领记录集合
     */
    public List<SysLfyp> selectSysLfypList(SysLfyp sysLfyp);

    /**
     * 新增劳防用品申领记录
     * 
     * @param sysLfyp 劳防用品申领记录
     * @return 结果
     */
    public int insertSysLfyp(SysLfyp sysLfyp);

    /**
     * 修改劳防用品申领记录
     * 
     * @param sysLfyp 劳防用品申领记录
     * @return 结果
     */
    public int updateSysLfyp(SysLfyp sysLfyp);

    /**
     * 删除劳防用品申领记录
     * 
     * @param lfypId 劳防用品申领记录主键
     * @return 结果
     */
    public int deleteSysLfypByLfypId(Long lfypId);

    /**
     * 批量删除劳防用品申领记录
     * 
     * @param lfypIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysLfypByLfypIds(Long[] lfypIds);
}
