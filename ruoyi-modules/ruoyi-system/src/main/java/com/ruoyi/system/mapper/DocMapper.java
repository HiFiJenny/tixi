package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Doc;

/**
 * 班组安全生产责任书Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-11
 */
public interface DocMapper 
{
    /**
     * 查询班组安全生产责任书
     * 
     * @param id 班组安全生产责任书主键
     * @return 班组安全生产责任书
     */
    public Doc selectDocById(Long id);

    /**
     * 查询班组安全生产责任书列表
     * 
     * @param doc 班组安全生产责任书
     * @return 班组安全生产责任书集合
     */
    public List<Doc> selectDocList(Doc doc);

    /**
     * 新增班组安全生产责任书
     * 
     * @param doc 班组安全生产责任书
     * @return 结果
     */
    public int insertDoc(Doc doc);

    /**
     * 修改班组安全生产责任书
     * 
     * @param doc 班组安全生产责任书
     * @return 结果
     */
    public int updateDoc(Doc doc);

    /**
     * 删除班组安全生产责任书
     * 
     * @param id 班组安全生产责任书主键
     * @return 结果
     */
    public int deleteDocById(Long id);

    /**
     * 批量删除班组安全生产责任书
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDocByIds(Long[] ids);
}
