package com.test.oop7_interfaceDemo;

public interface Swim {
    /**
     * 接口是一种规则
     * 接口不能实例化
     * 接口不能含有构造方法
     * 接口和类之间是实现关系（implements），可以是多实现
     * 接口的实现类要么重写接口中的所有抽象方法，要么是抽象类
     * 接口和接口之间是继承关系（extend），可以是多继承
     * 接口中的变量只能是常量，默认修饰符 public static final
     * 接口中的方法，默认修饰符 public abstract
     * 允许在接口中定义默认方法，使用关键字default修饰（不可省略），不强制重写（重写时需要去掉default关键字）
     * 允许在接口中定义静态方法，使用关键字static修饰（不可省略），只能通过接口名调用
     * 允许在接口中定义私有方法，普通私有方法可以被default方法调用，静态私有方法可以被static方法调用
     */
    public abstract void swim();

    public default void show(){  // 默认方法，有方法体
        System.out.println("Interface default function show");
    }
}
