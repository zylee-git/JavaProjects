package com.test.oop5_finalDemo;

public class finalVariableDemo {
    static void main() {
        // final 修饰变量代表常量，不能被修改
        final int a = 10;
        // a = 11;  // 常量不能修改

        // 若final 修饰引用类型，只是其地址值不能发生变化
        final Student s = new Student();
        s.show();
        s.age = 1;  // s是常量，但是s对象的属性值仍然可以改变
        s.show();
    }
}

class Student {
    public int age;

    public void show(){
        System.out.println(age);
    }
}
