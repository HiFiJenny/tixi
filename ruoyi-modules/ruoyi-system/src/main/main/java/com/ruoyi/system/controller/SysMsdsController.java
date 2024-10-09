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
import com.ruoyi.system.domain.SysMsds;
import com.ruoyi.system.service.ISysMsdsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * MSDS信息Controller
 * 
 * @author ruoyi
 * @date 2024-10-06
 */
@RestController
@RequestMapping("/msds")
public class SysMsdsController extends BaseController
{
    @Autowired
    private ISysMsdsService sysMsdsService;

    /**
     * 查询MSDS信息列表
     */
    @RequiresPermissions("system:msds:list")
    @GetMapping("/list")
    public TableDataInfo list(SysMsds sysMsds)
    {
        startPage();
        List<SysMsds> list = sysMsdsService.selectSysMsdsList(sysMsds);
        return getDataTable(list);
    }

    /**
     * 导出MSDS信息列表
     */
    @RequiresPermissions("system:msds:export")
    @Log(title = "MSDS信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysMsds sysMsds)
    {
        List<SysMsds> list = sysMsdsService.selectSysMsdsList(sysMsds);
        ExcelUtil<SysMsds> util = new ExcelUtil<SysMsds>(SysMsds.class);
        util.exportExcel(response, list, "MSDS信息数据");
    }

    /**
     * 获取MSDS信息详细信息
     */
    @RequiresPermissions("system:msds:query")
    @GetMapping(value = "/{msdsId}")
    public AjaxResult getInfo(@PathVariable("msdsId") Long msdsId)
    {
        return success(sysMsdsService.selectSysMsdsByMsdsId(msdsId));
    }

    /**
     * 新增MSDS信息
     */
    @RequiresPermissions("system:msds:add")
    @Log(title = "MSDS信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysMsds sysMsds)
    {
        return toAjax(sysMsdsService.insertSysMsds(sysMsds));
    }

    /**
     * 修改MSDS信息
     */
    @RequiresPermissions("system:msds:edit")
    @Log(title = "MSDS信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysMsds sysMsds)
    {
        return toAjax(sysMsdsService.updateSysMsds(sysMsds));
    }

    /**
     * 删除MSDS信息
     */
    @RequiresPermissions("system:msds:remove")
    @Log(title = "MSDS信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{msdsIds}")
    public AjaxResult remove(@PathVariable Long[] msdsIds)
    {
        return toAjax(sysMsdsService.deleteSysMsdsByMsdsIds(msdsIds));
    }
}
