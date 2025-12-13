package com.test.oop6_abstractClassDemo;

public class Test {
    static void main() {
        // Person p = new Person();  // 抽象类 Person 不能实例化
        Student s = new Student("Lee", 15);
        s.work();
        s.sleep();
    }
}
