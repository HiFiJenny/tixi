package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysYjjy;

/**
 * 应急救援预案信息Service接口
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
public interface ISysYjjyService 
{
    /**
     * 查询应急救援预案信息
     * 
     * @param yjjyId 应急救援预案信息主键
     * @return 应急救援预案信息
     */
    public SysYjjy selectSysYjjyByYjjyId(Long yjjyId);

    /**
     * 查询应急救援预案信息列表
     * 
     * @param sysYjjy 应急救援预案信息
     * @return 应急救援预案信息集合
     */
    public List<SysYjjy> selectSysYjjyList(SysYjjy sysYjjy);

    /**
     * 新增应急救援预案信息
     * 
     * @param sysYjjy 应急救援预案信息
     * @return 结果
     */
    public int insertSysYjjy(SysYjjy sysYjjy);

    /**
     * 修改应急救援预案信息
     * 
     * @param sysYjjy 应急救援预案信息
     * @return 结果
     */
    public int updateSysYjjy(SysYjjy sysYjjy);

    /**
     * 批量删除应急救援预案信息
     * 
     * @param yjjyIds 需要删除的应急救援预案信息主键集合
     * @return 结果
     */
    public int deleteSysYjjyByYjjyIds(Long[] yjjyIds);

    /**
     * 删除应急救援预案信息信息
     * 
     * @param yjjyId 应急救援预案信息主键
     * @return 结果
     */
    public int deleteSysYjjyByYjjyId(Long yjjyId);
}
