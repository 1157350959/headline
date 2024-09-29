package com.atguigu.service;

import com.atguigu.pojo.Type;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author a1157
* @description 针对表【news_type】的数据库操作Service
* @createDate 2024-09-24 15:05:12
*/
public interface TypeService extends IService<Type> {

    Result findAllTypes();
}
