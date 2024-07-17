package com.jx.controller;

import com.jx.anatation.SystemLog;
import com.jx.domain.bean.ResponseResult;
import com.jx.service.ActivityAssignmentTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "班次类型相关接口")
@RequestMapping("/system/activityAssignmentType")
@RestController
public class ActivityAssignmentTypeController {
    @Autowired
    ActivityAssignmentTypeService activityAssignmentTypeService;

    /**
     * 分页查询
     * @param pageSize
     * @param pageNum
     * @param name
     * @return
     */
    @SystemLog(businessName = "分页查询班次类型",type="2")
    @GetMapping("/list")
    public ResponseResult listActivityAssignmentType(Long pageSize,Long pageNum,String name){
        return activityAssignmentTypeService.listActivityAssignmentType(pageSize,pageNum,name);
    }
}
