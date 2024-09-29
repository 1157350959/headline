package com.atguigu.pojo.vo;

import lombok.Data;

/**
 * ClassName: PortalVo
 * Package: com.atguigu.pojo.vo
 * Description:
 *
 * @Author HL
 * @Create 9/26/2024 9:44 AM
 * @Version:
 */
@Data
public class PortalVo {
    private String keyWords;
    private int type = 0;
    private int pageNum = 1;
    private int pageSize = 10;
}
