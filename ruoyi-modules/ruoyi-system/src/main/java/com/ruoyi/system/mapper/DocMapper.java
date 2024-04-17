package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Doc;

/**
 * MSDSMapper接口
 * 
 * @author ruoyi
 * @date 2024-04-17
 */
public interface DocMapper 
{
    /**
     * 查询MSDS
     * 
     * @param id MSDS主键
     * @return MSDS
     */
    public Doc selectDocById(Long id);

    /**
     * 查询MSDS列表
     * 
     * @param doc MSDS
     * @return MSDS集合
     */
    public List<Doc> selectDocList(Doc doc);

    /**
     * 新增MSDS
     * 
     * @param doc MSDS
     * @return 结果
     */
    public int insertDoc(Doc doc);

    /**
     * 修改MSDS
     * 
     * @param doc MSDS
     * @return 结果
     */
    public int updateDoc(Doc doc);

    /**
     * 删除MSDS
     * 
     * @param id MSDS主键
     * @return 结果
     */
    public int deleteDocById(Long id);

    /**
     * 批量删除MSDS
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDocByIds(Long[] ids);
}
