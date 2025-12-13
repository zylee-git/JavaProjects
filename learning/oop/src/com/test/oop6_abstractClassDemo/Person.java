package com.test.oop6_abstractClassDemo;

public abstract class Person {
    /**
     * 抽象类不能实例化为对象
     * 有抽象方法的类必须定义为抽象类（但抽象类中可以没有抽象方法）
     * 抽象类可以有构造函数
     * 抽象类的子类要么是抽象类，要么需要重写所有抽象方法
     */
    String name;
    int age;

    public Person() {  // 抽象类允许有构造函数
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void work();  // abstract 代表抽象方法，没有具体实现，子类必须重写

    public void sleep() {  // 抽象类可以含有非抽象方法
        System.out.println("Sleep");
    }
}
