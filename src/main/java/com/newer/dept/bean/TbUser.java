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
@TableName("TB_USER")
public class TbUser extends Model<TbUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Long userId;

    @TableField("USER_NAME")
    private String userName;

    @TableField("CH_NAME")
    private String chName;

    @TableField("PASSWORD")
    private String password;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
