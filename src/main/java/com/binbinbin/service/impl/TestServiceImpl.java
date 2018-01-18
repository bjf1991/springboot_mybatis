package com.binbinbin.service.impl;

import com.binbinbin.mapper.TestMapper;
import com.binbinbin.entity.TestEntity;
import com.binbinbin.service.BaseServiceImpl;
import com.binbinbin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bin on 2018/1/18.
 */
@Service
public class TestServiceImpl extends BaseServiceImpl<TestEntity> implements TestService{

    @Autowired
    private TestMapper testMapper;

}