package com.newer.dept.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("DEPT")
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "DEPTNO", type = IdType.AUTO)
    private Integer deptno;

    @TableField("DNAME")
    private String dname;

    @TableField("LOC")
    private String loc;


    @Override
    protected Serializable pkVal() {
        return this.deptno;
    }

}
