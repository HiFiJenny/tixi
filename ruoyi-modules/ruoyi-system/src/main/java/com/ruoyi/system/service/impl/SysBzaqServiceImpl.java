package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysBzaqMapper;
import com.ruoyi.system.domain.SysBzaq;
import com.ruoyi.system.service.ISysBzaqService;

/**
 * 班组安全生产责任书Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
@Service
public class SysBzaqServiceImpl implements ISysBzaqService 
{
    @Autowired
    private SysBzaqMapper sysBzaqMapper;

    /**
     * 查询班组安全生产责任书
     * 
     * @param bzaqId 班组安全生产责任书主键
     * @return 班组安全生产责任书
     */
    @Override
    public SysBzaq selectSysBzaqByBzaqId(Long bzaqId)
    {
        return sysBzaqMapper.selectSysBzaqByBzaqId(bzaqId);
    }

    /**
     * 查询班组安全生产责任书列表
     * 
     * @param sysBzaq 班组安全生产责任书
     * @return 班组安全生产责任书
     */
    @Override
    public List<SysBzaq> selectSysBzaqList(SysBzaq sysBzaq)
    {
        return sysBzaqMapper.selectSysBzaqList(sysBzaq);
    }

    /**
     * 新增班组安全生产责任书
     * 
     * @param sysBzaq 班组安全生产责任书
     * @return 结果
     */
    @Override
    public int insertSysBzaq(SysBzaq sysBzaq)
    {
        return sysBzaqMapper.insertSysBzaq(sysBzaq);
    }

    /**
     * 修改班组安全生产责任书
     * 
     * @param sysBzaq 班组安全生产责任书
     * @return 结果
     */
    @Override
    public int updateSysBzaq(SysBzaq sysBzaq)
    {
        return sysBzaqMapper.updateSysBzaq(sysBzaq);
    }

    /**
     * 批量删除班组安全生产责任书
     * 
     * @param bzaqIds 需要删除的班组安全生产责任书主键
     * @return 结果
     */
    @Override
    public int deleteSysBzaqByBzaqIds(Long[] bzaqIds)
    {
        return sysBzaqMapper.deleteSysBzaqByBzaqIds(bzaqIds);
    }

    /**
     * 删除班组安全生产责任书信息
     * 
     * @param bzaqId 班组安全生产责任书主键
     * @return 结果
     */
    @Override
    public int deleteSysBzaqByBzaqId(Long bzaqId)
    {
        return sysBzaqMapper.deleteSysBzaqByBzaqId(bzaqId);
    }
}
