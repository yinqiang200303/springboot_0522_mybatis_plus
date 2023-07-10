package com.newer;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.newer.dept.bean.Dept;
import com.newer.dept.bean.Emp;
import com.newer.dept.service.EmpService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot0522MybatisPlusApplicationTests {
    @Autowired
    EmpService empService;

    @Test
    void  testdept(){
      Dept dept=new Dept();
      dept.selectAll().forEach(System.out::println);
    }
    //1）、删除编号为7369的员工。
    @Test
    void contextLoads() {
       boolean flag=empService.removeById(7369);
        System.out.println("是否删除成功"+flag);
    }

    //2）、查询员工薪水在1000-3000之间的所有员工。
    @Test
    void selecempbysa(){
        QueryWrapper<Emp> queryWrapper=new QueryWrapper<>();
        queryWrapper.between("SAL","1000","3000");
        List<Emp> list =empService.list(queryWrapper);
        list.forEach(System.out::println);
    }
}
