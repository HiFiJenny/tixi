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
import com.ruoyi.system.domain.SysBzwxy;
import com.ruoyi.system.service.ISysBzwxyService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 班组危险源信息Controller
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
@RestController
@RequestMapping("/bzwxy")
public class SysBzwxyController extends BaseController
{
    @Autowired
    private ISysBzwxyService sysBzwxyService;

    /**
     * 查询班组危险源信息列表
     */
    @RequiresPermissions("system:bzwxy:list")
    @GetMapping("/list")
    public TableDataInfo list(SysBzwxy sysBzwxy)
    {
        startPage();
        List<SysBzwxy> list = sysBzwxyService.selectSysBzwxyList(sysBzwxy);
        return getDataTable(list);
    }

    /**
     * 导出班组危险源信息列表
     */
    @RequiresPermissions("system:bzwxy:export")
    @Log(title = "班组危险源信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysBzwxy sysBzwxy)
    {
        List<SysBzwxy> list = sysBzwxyService.selectSysBzwxyList(sysBzwxy);
        ExcelUtil<SysBzwxy> util = new ExcelUtil<SysBzwxy>(SysBzwxy.class);
        util.exportExcel(response, list, "班组危险源信息数据");
    }

    /**
     * 获取班组危险源信息详细信息
     */
    @RequiresPermissions("system:bzwxy:query")
    @GetMapping(value = "/{bzwxyId}")
    public AjaxResult getInfo(@PathVariable("bzwxyId") Long bzwxyId)
    {
        return success(sysBzwxyService.selectSysBzwxyByBzwxyId(bzwxyId));
    }

    /**
     * 新增班组危险源信息
     */
    @RequiresPermissions("system:bzwxy:add")
    @Log(title = "班组危险源信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysBzwxy sysBzwxy)
    {
        return toAjax(sysBzwxyService.insertSysBzwxy(sysBzwxy));
    }

    /**
     * 修改班组危险源信息
     */
    @RequiresPermissions("system:bzwxy:edit")
    @Log(title = "班组危险源信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysBzwxy sysBzwxy)
    {
        return toAjax(sysBzwxyService.updateSysBzwxy(sysBzwxy));
    }

    /**
     * 删除班组危险源信息
     */
    @RequiresPermissions("system:bzwxy:remove")
    @Log(title = "班组危险源信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bzwxyIds}")
    public AjaxResult remove(@PathVariable Long[] bzwxyIds)
    {
        return toAjax(sysBzwxyService.deleteSysBzwxyByBzwxyIds(bzwxyIds));
    }
}
