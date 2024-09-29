package com.atguigu.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName news_type
 */

@Data
public class Type implements Serializable {
    @TableId
    private Integer tid;

    private String tname;

    @Version
    private Integer version;

    private static final long serialVersionUID = 1L;
}