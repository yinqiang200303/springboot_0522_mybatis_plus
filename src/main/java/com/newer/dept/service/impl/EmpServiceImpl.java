package com.newer.dept.service.impl;

import com.newer.dept.bean.Emp;
import com.newer.dept.mapper.EmpDAO;
import com.newer.dept.service.EmpService;
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
public class EmpServiceImpl extends ServiceImpl<EmpDAO, Emp> implements EmpService {

}
