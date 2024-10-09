package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysMsdsMapper;
import com.ruoyi.system.domain.SysMsds;
import com.ruoyi.system.service.ISysMsdsService;

/**
 * MSDS信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-09
 */
@Service
public class SysMsdsServiceImpl implements ISysMsdsService 
{
    @Autowired
    private SysMsdsMapper sysMsdsMapper;

    /**
     * 查询MSDS信息
     * 
     * @param msdsId MSDS信息主键
     * @return MSDS信息
     */
    @Override
    public SysMsds selectSysMsdsByMsdsId(Long msdsId)
    {
        return sysMsdsMapper.selectSysMsdsByMsdsId(msdsId);
    }

    /**
     * 查询MSDS信息列表
     * 
     * @param sysMsds MSDS信息
     * @return MSDS信息
     */
    @Override
    public List<SysMsds> selectSysMsdsList(SysMsds sysMsds)
    {
        return sysMsdsMapper.selectSysMsdsList(sysMsds);
    }

    /**
     * 新增MSDS信息
     * 
     * @param sysMsds MSDS信息
     * @return 结果
     */
    @Override
    public int insertSysMsds(SysMsds sysMsds)
    {
        return sysMsdsMapper.insertSysMsds(sysMsds);
    }

    /**
     * 修改MSDS信息
     * 
     * @param sysMsds MSDS信息
     * @return 结果
     */
    @Override
    public int updateSysMsds(SysMsds sysMsds)
    {
        return sysMsdsMapper.updateSysMsds(sysMsds);
    }

    /**
     * 批量删除MSDS信息
     * 
     * @param msdsIds 需要删除的MSDS信息主键
     * @return 结果
     */
    @Override
    public int deleteSysMsdsByMsdsIds(Long[] msdsIds)
    {
        return sysMsdsMapper.deleteSysMsdsByMsdsIds(msdsIds);
    }

    /**
     * 删除MSDS信息信息
     * 
     * @param msdsId MSDS信息主键
     * @return 结果
     */
    @Override
    public int deleteSysMsdsByMsdsId(Long msdsId)
    {
        return sysMsdsMapper.deleteSysMsdsByMsdsId(msdsId);
    }
}
