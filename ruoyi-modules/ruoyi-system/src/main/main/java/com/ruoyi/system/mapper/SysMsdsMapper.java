package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysMsds;

/**
 * MSDS信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-06
 */
public interface SysMsdsMapper 
{
    /**
     * 查询MSDS信息
     * 
     * @param msdsId MSDS信息主键
     * @return MSDS信息
     */
    public SysMsds selectSysMsdsByMsdsId(Long msdsId);

    /**
     * 查询MSDS信息列表
     * 
     * @param sysMsds MSDS信息
     * @return MSDS信息集合
     */
    public List<SysMsds> selectSysMsdsList(SysMsds sysMsds);

    /**
     * 新增MSDS信息
     * 
     * @param sysMsds MSDS信息
     * @return 结果
     */
    public int insertSysMsds(SysMsds sysMsds);

    /**
     * 修改MSDS信息
     * 
     * @param sysMsds MSDS信息
     * @return 结果
     */
    public int updateSysMsds(SysMsds sysMsds);

    /**
     * 删除MSDS信息
     * 
     * @param msdsId MSDS信息主键
     * @return 结果
     */
    public int deleteSysMsdsByMsdsId(Long msdsId);

    /**
     * 批量删除MSDS信息
     * 
     * @param msdsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysMsdsByMsdsIds(Long[] msdsIds);
}
