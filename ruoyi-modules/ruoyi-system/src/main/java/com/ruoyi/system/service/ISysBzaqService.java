package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysBzaq;

/**
 * 班组安全生产责任书Service接口
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
public interface ISysBzaqService 
{
    /**
     * 查询班组安全生产责任书
     * 
     * @param bzaqId 班组安全生产责任书主键
     * @return 班组安全生产责任书
     */
    public SysBzaq selectSysBzaqByBzaqId(Long bzaqId);

    /**
     * 查询班组安全生产责任书列表
     * 
     * @param sysBzaq 班组安全生产责任书
     * @return 班组安全生产责任书集合
     */
    public List<SysBzaq> selectSysBzaqList(SysBzaq sysBzaq);

    /**
     * 新增班组安全生产责任书
     * 
     * @param sysBzaq 班组安全生产责任书
     * @return 结果
     */
    public int insertSysBzaq(SysBzaq sysBzaq);

    /**
     * 修改班组安全生产责任书
     * 
     * @param sysBzaq 班组安全生产责任书
     * @return 结果
     */
    public int updateSysBzaq(SysBzaq sysBzaq);

    /**
     * 批量删除班组安全生产责任书
     * 
     * @param bzaqIds 需要删除的班组安全生产责任书主键集合
     * @return 结果
     */
    public int deleteSysBzaqByBzaqIds(Long[] bzaqIds);

    /**
     * 删除班组安全生产责任书信息
     * 
     * @param bzaqId 班组安全生产责任书主键
     * @return 结果
     */
    public int deleteSysBzaqByBzaqId(Long bzaqId);
}
