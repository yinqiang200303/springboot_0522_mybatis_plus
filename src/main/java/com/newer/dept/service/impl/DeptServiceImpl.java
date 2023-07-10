package com.newer.dept.service.impl;

import com.newer.dept.bean.Dept;
import com.newer.dept.mapper.DeptDAO;
import com.newer.dept.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author newer
 * @since 2023-05-22
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDAO, Dept> implements DeptService {

}
