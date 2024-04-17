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
import com.ruoyi.system.domain.Doc;
import com.ruoyi.system.service.IDocService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * MSDSController
 * 
 * @author ruoyi
 * @date 2024-04-17
 */
@RestController
@RequestMapping("/doc")
public class DocController extends BaseController
{
    @Autowired
    private IDocService docService;

    /**
     * 查询MSDS列表
     */
    @RequiresPermissions("system:doc:list")
    @GetMapping("/list")
    public TableDataInfo list(Doc doc)
    {
        startPage();
        List<Doc> list = docService.selectDocList(doc);
        return getDataTable(list);
    }

    /**
     * 导出MSDS列表
     */
    @RequiresPermissions("system:doc:export")
    @Log(title = "MSDS", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Doc doc)
    {
        List<Doc> list = docService.selectDocList(doc);
        ExcelUtil<Doc> util = new ExcelUtil<Doc>(Doc.class);
        util.exportExcel(response, list, "MSDS数据");
    }

    /**
     * 获取MSDS详细信息
     */
    @RequiresPermissions("system:doc:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(docService.selectDocById(id));
    }

    /**
     * 新增MSDS
     */
    @RequiresPermissions("system:doc:add")
    @Log(title = "MSDS", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Doc doc)
    {
        return toAjax(docService.insertDoc(doc));
    }

    /**
     * 修改MSDS
     */
    @RequiresPermissions("system:doc:edit")
    @Log(title = "MSDS", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Doc doc)
    {
        return toAjax(docService.updateDoc(doc));
    }

    /**
     * 删除MSDS
     */
    @RequiresPermissions("system:doc:remove")
    @Log(title = "MSDS", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(docService.deleteDocByIds(ids));
    }
}
