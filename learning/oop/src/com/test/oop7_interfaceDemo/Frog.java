package com.test.oop7_interfaceDemo;

import com.test.oop2_extendDemo.Person;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name) {
        super(name);
    }

    // 实现接口的抽象方法
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }


    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }
}
