package com.newer.dept.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.newer.dept.bean.Emp;
import com.newer.dept.bean.TbUser;
import com.newer.dept.mapper.EmpDAO;
import com.newer.dept.mapper.TbUserDAO;
import com.newer.dept.service.EmpService;
import com.newer.dept.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author newer
 * @since 2023-05-22
 */
@Controller
//@RequestMapping("/tbuser")
public class TbUserController {
    @Resource
    TbUserService tbUserService;
    @Resource
//    EmpService empService;
    EmpDAO empDAO;
    @RequestMapping("/")

    public  String mapeer(){
        return "login";
    }

    @RequestMapping("logins")
    public String login(HttpServletRequest request, Model model){
        String name=request.getParameter("account");
        String pwd=request.getParameter("password");
        QueryWrapper<TbUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.apply("USER_NAME='"+name+"' AND PASSWORD="+pwd);
//              List<TbUser> user =tbUserService.l
              TbUser tbUser=tbUserService.getOne(queryWrapper);
        System.out.printf("用户"+tbUser);
        model.addAttribute("user",tbUser);
        String str="";
        if(tbUser!=null){
            str="hello";
        }else{
            str="error";
        }
        return str;
    }

    @RequestMapping("Allpage")
    public  String selectemp(int pageno, Model model){
        System.out.println("sss"+pageno);
//        if(pageno<=0) {
//            Page<Emp> page = new Page<>(1, 3);
//        }else {
            Page<Emp> page = new Page<>(1,3);
//            page.setCurrent(pageno);
//            page.setSize(3);
            IPage<Emp> iPage =empDAO.selectPage(page,null);
            iPage.getRecords().forEach(System.out::println);
            model.addAttribute("pageno",pageno);
            model.addAttribute("emps",iPage.getRecords());
//        }
        return "allemp";
    }
}

