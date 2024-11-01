package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysBzwxyMapper;
import com.ruoyi.system.domain.SysBzwxy;
import com.ruoyi.system.service.ISysBzwxyService;

/**
 * 班组危险源信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
@Service
public class SysBzwxyServiceImpl implements ISysBzwxyService 
{
    @Autowired
    private SysBzwxyMapper sysBzwxyMapper;

    /**
     * 查询班组危险源信息
     * 
     * @param bzwxyId 班组危险源信息主键
     * @return 班组危险源信息
     */
    @Override
    public SysBzwxy selectSysBzwxyByBzwxyId(Long bzwxyId)
    {
        return sysBzwxyMapper.selectSysBzwxyByBzwxyId(bzwxyId);
    }

    /**
     * 查询班组危险源信息列表
     * 
     * @param sysBzwxy 班组危险源信息
     * @return 班组危险源信息
     */
    @Override
    public List<SysBzwxy> selectSysBzwxyList(SysBzwxy sysBzwxy)
    {
        return sysBzwxyMapper.selectSysBzwxyList(sysBzwxy);
    }

    /**
     * 新增班组危险源信息
     * 
     * @param sysBzwxy 班组危险源信息
     * @return 结果
     */
    @Override
    public int insertSysBzwxy(SysBzwxy sysBzwxy)
    {
        return sysBzwxyMapper.insertSysBzwxy(sysBzwxy);
    }

    /**
     * 修改班组危险源信息
     * 
     * @param sysBzwxy 班组危险源信息
     * @return 结果
     */
    @Override
    public int updateSysBzwxy(SysBzwxy sysBzwxy)
    {
        return sysBzwxyMapper.updateSysBzwxy(sysBzwxy);
    }

    /**
     * 批量删除班组危险源信息
     * 
     * @param bzwxyIds 需要删除的班组危险源信息主键
     * @return 结果
     */
    @Override
    public int deleteSysBzwxyByBzwxyIds(Long[] bzwxyIds)
    {
        return sysBzwxyMapper.deleteSysBzwxyByBzwxyIds(bzwxyIds);
    }

    /**
     * 删除班组危险源信息信息
     * 
     * @param bzwxyId 班组危险源信息主键
     * @return 结果
     */
    @Override
    public int deleteSysBzwxyByBzwxyId(Long bzwxyId)
    {
        return sysBzwxyMapper.deleteSysBzwxyByBzwxyId(bzwxyId);
    }
}
