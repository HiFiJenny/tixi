package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysFileInfo;

/**
 * 班组安全生产责任书Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-19
 */
public interface SysFileInfoMapper 
{
    /**
     * 查询班组安全生产责任书
     * 
     * @param fileId 班组安全生产责任书主键
     * @return 班组安全生产责任书
     */
    public SysFileInfo selectSysFileInfoByFileId(Long fileId);

    /**
     * 查询班组安全生产责任书列表
     * 
     * @param sysFileInfo 班组安全生产责任书
     * @return 班组安全生产责任书集合
     */
    public List<SysFileInfo> selectSysFileInfoList(SysFileInfo sysFileInfo);

    /**
     * 新增班组安全生产责任书
     * 
     * @param sysFileInfo 班组安全生产责任书
     * @return 结果
     */
    public int insertSysFileInfo(SysFileInfo sysFileInfo);

    /**
     * 修改班组安全生产责任书
     * 
     * @param sysFileInfo 班组安全生产责任书
     * @return 结果
     */
    public int updateSysFileInfo(SysFileInfo sysFileInfo);

    /**
     * 删除班组安全生产责任书
     * 
     * @param fileId 班组安全生产责任书主键
     * @return 结果
     */
    public int deleteSysFileInfoByFileId(Long fileId);

    /**
     * 批量删除班组安全生产责任书
     * 
     * @param fileIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysFileInfoByFileIds(Long[] fileIds);
}
