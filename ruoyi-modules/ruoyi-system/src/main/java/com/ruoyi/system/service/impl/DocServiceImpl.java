package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DocMapper;
import com.ruoyi.system.domain.Doc;
import com.ruoyi.system.service.IDocService;

/**
 * 班组安全生产责任书Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-11
 */
@Service
public class DocServiceImpl implements IDocService 
{
    @Autowired
    private DocMapper docMapper;

    /**
     * 查询班组安全生产责任书
     * 
     * @param id 班组安全生产责任书主键
     * @return 班组安全生产责任书
     */
    @Override
    public Doc selectDocById(Long id)
    {
        return docMapper.selectDocById(id);
    }

    /**
     * 查询班组安全生产责任书列表
     * 
     * @param doc 班组安全生产责任书
     * @return 班组安全生产责任书
     */
    @Override
    public List<Doc> selectDocList(Doc doc)
    {
        return docMapper.selectDocList(doc);
    }

    /**
     * 新增班组安全生产责任书
     * 
     * @param doc 班组安全生产责任书
     * @return 结果
     */
    @Override
    public int insertDoc(Doc doc)
    {
        doc.setCreateTime(DateUtils.getNowDate());
        return docMapper.insertDoc(doc);
    }

    /**
     * 修改班组安全生产责任书
     * 
     * @param doc 班组安全生产责任书
     * @return 结果
     */
    @Override
    public int updateDoc(Doc doc)
    {
        doc.setUpdateTime(DateUtils.getNowDate());
        return docMapper.updateDoc(doc);
    }

    /**
     * 批量删除班组安全生产责任书
     * 
     * @param ids 需要删除的班组安全生产责任书主键
     * @return 结果
     */
    @Override
    public int deleteDocByIds(Long[] ids)
    {
        return docMapper.deleteDocByIds(ids);
    }

    /**
     * 删除班组安全生产责任书信息
     * 
     * @param id 班组安全生产责任书主键
     * @return 结果
     */
    @Override
    public int deleteDocById(Long id)
    {
        return docMapper.deleteDocById(id);
    }
}
