package com.test.oop1_staticDemo;

public class StudentTest {
    static void main() {
        Student s1 = new Student("Lee", 20, "male");
        Student s2 = new Student("Zhang", 22, "female");
        Student.teacherName = "Wang";

        s1.study();
        s1.show();
        s2.study();
        s2.show();
    }
}
