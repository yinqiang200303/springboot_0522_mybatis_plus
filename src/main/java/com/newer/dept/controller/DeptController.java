package com.newer.dept.controller;


import com.newer.dept.bean.Dept;
import com.newer.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author newer
 * @since 2023-05-22
 */
//@RestController
//public class DeptController {
//     @Resource
//    DeptService deptService;
//     @RequestMapping("/get/{id}")
//    public  Dept selectbyid(@PathVariable("id") String id){
//        Dept dept=deptService.getById(id);
//        return dept;
//    }
//
//    @RequestMapping("/All")
//    public List selectAll(){
//        List<Dept> list=deptService.list();
//        return  list;
//    }
//}

