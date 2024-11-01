package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysBzwxy;

/**
 * 班组危险源信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
public interface SysBzwxyMapper 
{
    /**
     * 查询班组危险源信息
     * 
     * @param bzwxyId 班组危险源信息主键
     * @return 班组危险源信息
     */
    public SysBzwxy selectSysBzwxyByBzwxyId(Long bzwxyId);

    /**
     * 查询班组危险源信息列表
     * 
     * @param sysBzwxy 班组危险源信息
     * @return 班组危险源信息集合
     */
    public List<SysBzwxy> selectSysBzwxyList(SysBzwxy sysBzwxy);

    /**
     * 新增班组危险源信息
     * 
     * @param sysBzwxy 班组危险源信息
     * @return 结果
     */
    public int insertSysBzwxy(SysBzwxy sysBzwxy);

    /**
     * 修改班组危险源信息
     * 
     * @param sysBzwxy 班组危险源信息
     * @return 结果
     */
    public int updateSysBzwxy(SysBzwxy sysBzwxy);

    /**
     * 删除班组危险源信息
     * 
     * @param bzwxyId 班组危险源信息主键
     * @return 结果
     */
    public int deleteSysBzwxyByBzwxyId(Long bzwxyId);

    /**
     * 批量删除班组危险源信息
     * 
     * @param bzwxyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysBzwxyByBzwxyIds(Long[] bzwxyIds);
}
