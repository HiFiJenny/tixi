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
import com.ruoyi.system.domain.SysLfyp;
import com.ruoyi.system.service.ISysLfypService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 劳防用品申领记录Controller
 * 
 * @author ruoyi
 * @date 2024-11-01
 */
@RestController
@RequestMapping("/lfyp")
public class SysLfypController extends BaseController
{
    @Autowired
    private ISysLfypService sysLfypService;

    /**
     * 查询劳防用品申领记录列表
     */
    @RequiresPermissions("system:lfyp:list")
    @GetMapping("/list")
    public TableDataInfo list(SysLfyp sysLfyp)
    {
        startPage();
        List<SysLfyp> list = sysLfypService.selectSysLfypList(sysLfyp);
        return getDataTable(list);
    }

    /**
     * 导出劳防用品申领记录列表
     */
    @RequiresPermissions("system:lfyp:export")
    @Log(title = "劳防用品申领记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysLfyp sysLfyp)
    {
        List<SysLfyp> list = sysLfypService.selectSysLfypList(sysLfyp);
        ExcelUtil<SysLfyp> util = new ExcelUtil<SysLfyp>(SysLfyp.class);
        util.exportExcel(response, list, "劳防用品申领记录数据");
    }

    /**
     * 获取劳防用品申领记录详细信息
     */
    @RequiresPermissions("system:lfyp:query")
    @GetMapping(value = "/{lfypId}")
    public AjaxResult getInfo(@PathVariable("lfypId") Long lfypId)
    {
        return success(sysLfypService.selectSysLfypByLfypId(lfypId));
    }

    /**
     * 新增劳防用品申领记录
     */
    @RequiresPermissions("system:lfyp:add")
    @Log(title = "劳防用品申领记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysLfyp sysLfyp)
    {
        return toAjax(sysLfypService.insertSysLfyp(sysLfyp));
    }

    /**
     * 修改劳防用品申领记录
     */
    @RequiresPermissions("system:lfyp:edit")
    @Log(title = "劳防用品申领记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysLfyp sysLfyp)
    {
        return toAjax(sysLfypService.updateSysLfyp(sysLfyp));
    }

    /**
     * 删除劳防用品申领记录
     */
    @RequiresPermissions("system:lfyp:remove")
    @Log(title = "劳防用品申领记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{lfypIds}")
    public AjaxResult remove(@PathVariable Long[] lfypIds)
    {
        return toAjax(sysLfypService.deleteSysLfypByLfypIds(lfypIds));
    }
}
