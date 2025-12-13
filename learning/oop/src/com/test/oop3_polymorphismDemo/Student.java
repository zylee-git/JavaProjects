package com.test.oop3_polymorphismDemo;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.print("Student ");
        super.show();
    }
}
