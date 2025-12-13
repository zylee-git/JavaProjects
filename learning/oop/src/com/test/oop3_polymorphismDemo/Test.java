package com.test.oop3_polymorphismDemo;

public class Test {
    static void main() {
        // 用父类的引用指向子类对象，形成多态
        // 调用父类方法，实际调用的是重写后的子类方法
        Person[] ps = new Person[3];
        ps[0] = new Student("a", 15);
        ps[1] = new Teacher("b", 25);
        ps[2] = new Administrator("c", 40);

        for(Person p : ps) {
            p.show();
        }
    }
}
