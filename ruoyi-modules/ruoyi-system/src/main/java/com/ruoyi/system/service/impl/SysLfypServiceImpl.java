package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysLfypMapper;
import com.ruoyi.system.domain.SysLfyp;
import com.ruoyi.system.service.ISysLfypService;

/**
 * 劳防用品申领记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
@Service
public class SysLfypServiceImpl implements ISysLfypService 
{
    @Autowired
    private SysLfypMapper sysLfypMapper;

    /**
     * 查询劳防用品申领记录
     * 
     * @param lfypId 劳防用品申领记录主键
     * @return 劳防用品申领记录
     */
    @Override
    public SysLfyp selectSysLfypByLfypId(Long lfypId)
    {
        return sysLfypMapper.selectSysLfypByLfypId(lfypId);
    }

    /**
     * 查询劳防用品申领记录列表
     * 
     * @param sysLfyp 劳防用品申领记录
     * @return 劳防用品申领记录
     */
    @Override
    public List<SysLfyp> selectSysLfypList(SysLfyp sysLfyp)
    {
        return sysLfypMapper.selectSysLfypList(sysLfyp);
    }

    /**
     * 新增劳防用品申领记录
     * 
     * @param sysLfyp 劳防用品申领记录
     * @return 结果
     */
    @Override
    public int insertSysLfyp(SysLfyp sysLfyp)
    {
        return sysLfypMapper.insertSysLfyp(sysLfyp);
    }

    /**
     * 修改劳防用品申领记录
     * 
     * @param sysLfyp 劳防用品申领记录
     * @return 结果
     */
    @Override
    public int updateSysLfyp(SysLfyp sysLfyp)
    {
        return sysLfypMapper.updateSysLfyp(sysLfyp);
    }

    /**
     * 批量删除劳防用品申领记录
     * 
     * @param lfypIds 需要删除的劳防用品申领记录主键
     * @return 结果
     */
    @Override
    public int deleteSysLfypByLfypIds(Long[] lfypIds)
    {
        return sysLfypMapper.deleteSysLfypByLfypIds(lfypIds);
    }

    /**
     * 删除劳防用品申领记录信息
     * 
     * @param lfypId 劳防用品申领记录主键
     * @return 结果
     */
    @Override
    public int deleteSysLfypByLfypId(Long lfypId)
    {
        return sysLfypMapper.deleteSysLfypByLfypId(lfypId);
    }
}
