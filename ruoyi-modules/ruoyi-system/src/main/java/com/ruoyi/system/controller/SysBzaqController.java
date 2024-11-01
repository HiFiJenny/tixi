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
import com.ruoyi.system.domain.SysBzaq;
import com.ruoyi.system.service.ISysBzaqService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 班组安全生产责任书Controller
 * 
 * @author ruoyi
 * @date 2024-10-31
 */
@RestController
@RequestMapping("/bzaq")
public class SysBzaqController extends BaseController
{
    @Autowired
    private ISysBzaqService sysBzaqService;

    /**
     * 查询班组安全生产责任书列表
     */
    @RequiresPermissions("system:bzaq:list")
    @GetMapping("/list")
    public TableDataInfo list(SysBzaq sysBzaq)
    {
        startPage();
        List<SysBzaq> list = sysBzaqService.selectSysBzaqList(sysBzaq);
        return getDataTable(list);
    }

    /**
     * 导出班组安全生产责任书列表
     */
    @RequiresPermissions("system:bzaq:export")
    @Log(title = "班组安全生产责任书", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysBzaq sysBzaq)
    {
        List<SysBzaq> list = sysBzaqService.selectSysBzaqList(sysBzaq);
        ExcelUtil<SysBzaq> util = new ExcelUtil<SysBzaq>(SysBzaq.class);
        util.exportExcel(response, list, "班组安全生产责任书数据");
    }

    /**
     * 获取班组安全生产责任书详细信息
     */
    @RequiresPermissions("system:bzaq:query")
    @GetMapping(value = "/{bzaqId}")
    public AjaxResult getInfo(@PathVariable("bzaqId") Long bzaqId)
    {
        return success(sysBzaqService.selectSysBzaqByBzaqId(bzaqId));
    }

    /**
     * 新增班组安全生产责任书
     */
    @RequiresPermissions("system:bzaq:add")
    @Log(title = "班组安全生产责任书", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysBzaq sysBzaq)
    {
        return toAjax(sysBzaqService.insertSysBzaq(sysBzaq));
    }

    /**
     * 修改班组安全生产责任书
     */
    @RequiresPermissions("system:bzaq:edit")
    @Log(title = "班组安全生产责任书", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysBzaq sysBzaq)
    {
        return toAjax(sysBzaqService.updateSysBzaq(sysBzaq));
    }

    /**
     * 删除班组安全生产责任书
     */
    @RequiresPermissions("system:bzaq:remove")
    @Log(title = "班组安全生产责任书", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bzaqIds}")
    public AjaxResult remove(@PathVariable Long[] bzaqIds)
    {
        return toAjax(sysBzaqService.deleteSysBzaqByBzaqIds(bzaqIds));
    }
}
