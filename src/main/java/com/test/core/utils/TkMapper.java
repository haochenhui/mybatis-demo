package com.test.core.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * Created by hch on 2017/7/11.
 */
public interface TkMapper<T>  extends Mapper<T>, MySqlMapper<T>{
}
