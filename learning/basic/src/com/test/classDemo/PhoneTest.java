package com.test.classDemo;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建Phone类的一个对象
        Phone myPhone = new Phone();

        System.out.println(myPhone.getPrice());

        myPhone.setPrice(1999);
        System.out.println(myPhone.getPrice());

        myPhone.call();
    }
}
