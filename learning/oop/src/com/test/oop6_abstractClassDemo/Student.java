package com.test.oop6_abstractClassDemo;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);  // 使用父类（抽象类）的构造函数
    }

    @Override
    public void work() {  // 重写抽象父类中的抽象方法
        System.out.println("Student is learning");
    }
}
