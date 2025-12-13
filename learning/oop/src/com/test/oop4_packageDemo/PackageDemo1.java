package com.test.oop4_packageDemo;

/*
  使用同一个包的对象时，不需要import
  使用java.lang包中的类时，也不需要import
  其余情况均需要使用import导入包中的类
  同名类需要用全类名
 */

import com.test.oop1_staticDemo.Student;  // 导入com.test.oop1_staticDemo包中的Student类

public class PackageDemo1 {
    static void main() {
        Student s = new Student("Lee", 15, "male");
        s.show();
    }
}
