package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DocMapper;
import com.ruoyi.system.domain.Doc;
import com.ruoyi.system.service.IDocService;

/**
 * MSDSService业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-17
 */
@Service
public class DocServiceImpl implements IDocService 
{
    @Autowired
    private DocMapper docMapper;

    /**
     * 查询MSDS
     * 
     * @param id MSDS主键
     * @return MSDS
     */
    @Override
    public Doc selectDocById(Long id)
    {
        return docMapper.selectDocById(id);
    }

    /**
     * 查询MSDS列表
     * 
     * @param doc MSDS
     * @return MSDS
     */
    @Override
    public List<Doc> selectDocList(Doc doc)
    {
        return docMapper.selectDocList(doc);
    }

    /**
     * 新增MSDS
     * 
     * @param doc MSDS
     * @return 结果
     */
    @Override
    public int insertDoc(Doc doc)
    {
        doc.setCreateTime(DateUtils.getNowDate());
        return docMapper.insertDoc(doc);
    }

    /**
     * 修改MSDS
     * 
     * @param doc MSDS
     * @return 结果
     */
    @Override
    public int updateDoc(Doc doc)
    {
        doc.setUpdateTime(DateUtils.getNowDate());
        return docMapper.updateDoc(doc);
    }

    /**
     * 批量删除MSDS
     * 
     * @param ids 需要删除的MSDS主键
     * @return 结果
     */
    @Override
    public int deleteDocByIds(Long[] ids)
    {
        return docMapper.deleteDocByIds(ids);
    }

    /**
     * 删除MSDS信息
     * 
     * @param id MSDS主键
     * @return 结果
     */
    @Override
    public int deleteDocById(Long id)
    {
        return docMapper.deleteDocById(id);
    }
}
