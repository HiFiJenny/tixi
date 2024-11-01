package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.system.domain.SysYjjy;
import com.ruoyi.system.service.ISysYjjyService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 应急救援预案信息Controller
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
@RestController
@RequestMapping("/yjjy")
public class SysYjjyController extends BaseController
{
    @Autowired
    private ISysYjjyService sysYjjyService;

    /**
     * 查询应急救援预案信息列表
     */
    @RequiresPermissions("system:yjjy:list")
    @GetMapping("/list")
    public TableDataInfo list(SysYjjy sysYjjy)
    {
        startPage();
        List<SysYjjy> list = sysYjjyService.selectSysYjjyList(sysYjjy);
        return getDataTable(list);
    }

    /**
     * 导出应急救援预案信息列表
     */
    @RequiresPermissions("system:yjjy:export")
    @Log(title = "应急救援预案信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysYjjy sysYjjy)
    {
        List<SysYjjy> list = sysYjjyService.selectSysYjjyList(sysYjjy);
        ExcelUtil<SysYjjy> util = new ExcelUtil<SysYjjy>(SysYjjy.class);
        util.exportExcel(response, list, "应急救援预案信息数据");
    }

    /**
     * 获取应急救援预案信息详细信息
     */
    @RequiresPermissions("system:yjjy:query")
    @GetMapping(value = "/{yjjyId}")
    public AjaxResult getInfo(@PathVariable("yjjyId") Long yjjyId)
    {
        return success(sysYjjyService.selectSysYjjyByYjjyId(yjjyId));
    }

    /**
     * 新增应急救援预案信息
     */
    @RequiresPermissions("system:yjjy:add")
    @Log(title = "应急救援预案信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysYjjy sysYjjy)
    {
        return toAjax(sysYjjyService.insertSysYjjy(sysYjjy));
    }

    /**
     * 修改应急救援预案信息
     */
    @RequiresPermissions("system:yjjy:edit")
    @Log(title = "应急救援预案信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysYjjy sysYjjy)
    {
        return toAjax(sysYjjyService.updateSysYjjy(sysYjjy));
    }

    /**
     * 删除应急救援预案信息
     */
    @RequiresPermissions("system:yjjy:remove")
    @Log(title = "应急救援预案信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{yjjyIds}")
    public AjaxResult remove(@PathVariable Long[] yjjyIds)
    {
        return toAjax(sysYjjyService.deleteSysYjjyByYjjyIds(yjjyIds));
    }
}
