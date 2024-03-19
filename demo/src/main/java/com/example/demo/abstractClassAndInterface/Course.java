package com.example.demo.abstractClassAndInterface;

// interface没有任何实例属性 (Java 8)
// interface不允许定义实例方法, 只允许抽象方法
// A是写鼠标对电脑的控制逻辑的人; B是做鼠标的人
// 鼠标接口 - 任何厂商都可以生产鼠标, 只要鼠标实现这个接口
public interface Course {

    public static int someValue = 1;

    void start();
    void end();
}
