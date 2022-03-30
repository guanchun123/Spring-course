package com.bjpowerload.impl;

import com.bjpowerload.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome() {
        System.out.println("执行了SomeServiceImpl的dosome()方法");
    }
}
