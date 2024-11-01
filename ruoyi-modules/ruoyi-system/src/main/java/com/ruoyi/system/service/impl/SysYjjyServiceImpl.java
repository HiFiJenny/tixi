package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysYjjyMapper;
import com.ruoyi.system.domain.SysYjjy;
import com.ruoyi.system.service.ISysYjjyService;

/**
 * 应急救援预案信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
@Service
public class SysYjjyServiceImpl implements ISysYjjyService 
{
    @Autowired
    private SysYjjyMapper sysYjjyMapper;

    /**
     * 查询应急救援预案信息
     * 
     * @param yjjyId 应急救援预案信息主键
     * @return 应急救援预案信息
     */
    @Override
    public SysYjjy selectSysYjjyByYjjyId(Long yjjyId)
    {
        return sysYjjyMapper.selectSysYjjyByYjjyId(yjjyId);
    }

    /**
     * 查询应急救援预案信息列表
     * 
     * @param sysYjjy 应急救援预案信息
     * @return 应急救援预案信息
     */
    @Override
    public List<SysYjjy> selectSysYjjyList(SysYjjy sysYjjy)
    {
        return sysYjjyMapper.selectSysYjjyList(sysYjjy);
    }

    /**
     * 新增应急救援预案信息
     * 
     * @param sysYjjy 应急救援预案信息
     * @return 结果
     */
    @Override
    public int insertSysYjjy(SysYjjy sysYjjy)
    {
        return sysYjjyMapper.insertSysYjjy(sysYjjy);
    }

    /**
     * 修改应急救援预案信息
     * 
     * @param sysYjjy 应急救援预案信息
     * @return 结果
     */
    @Override
    public int updateSysYjjy(SysYjjy sysYjjy)
    {
        return sysYjjyMapper.updateSysYjjy(sysYjjy);
    }

    /**
     * 批量删除应急救援预案信息
     * 
     * @param yjjyIds 需要删除的应急救援预案信息主键
     * @return 结果
     */
    @Override
    public int deleteSysYjjyByYjjyIds(Long[] yjjyIds)
    {
        return sysYjjyMapper.deleteSysYjjyByYjjyIds(yjjyIds);
    }

    /**
     * 删除应急救援预案信息信息
     * 
     * @param yjjyId 应急救援预案信息主键
     * @return 结果
     */
    @Override
    public int deleteSysYjjyByYjjyId(Long yjjyId)
    {
        return sysYjjyMapper.deleteSysYjjyByYjjyId(yjjyId);
    }
}
