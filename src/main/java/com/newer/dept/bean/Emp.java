package com.newer.dept.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author newer
 * @since 2023-05-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("EMP")
public class Emp extends Model<Emp> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "EMPNO", type = IdType.AUTO)
    private Integer empno;

    @TableField("ENAME")
    private String ename;

    @TableField("JOB")
    private String job;

    @TableField("MGR")
    private Integer mgr;

    @TableField("HIREDATE")
    private Date hiredate;

    @TableField("SAL")
    private BigDecimal sal;

    @TableField("COMM")
    private BigDecimal comm;

    @TableField("DEPTNO")
    private Integer deptno;


    @Override
    protected Serializable pkVal() {
        return this.empno;
    }

}
