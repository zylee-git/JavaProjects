package com.test.oop2_extendDemo;

public class Student extends Person {
    public String grade;

    public Student() {
        // super();  // 子类构造方法会默认调用super()
    }

    public Student(String name, int age, String grade) {
        super(name, age);  // 显式调用父类的有参构造函数
        this.grade = grade;
    }

    // Override 注解表示子类重写父类方法
    // 子类重写父类方法时，访问权限子类必须大于等于父类
    // 子类重写父类方法时，返回值类型子类必须小于等于父类
    @Override
    public void drink() {
        System.out.println("drink boiled water");
    }
}
