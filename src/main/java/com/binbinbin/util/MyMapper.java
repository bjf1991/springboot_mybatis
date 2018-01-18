package com.binbinbin.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by bin on 2018/1/18.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}