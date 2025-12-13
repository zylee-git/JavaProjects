package com.test.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    static void main() {
        // 集合内的元素只能为引用数据类型
        // 若要存储基本数据类型，可以变为其对应的包装类
        ArrayList<String> al1 = new ArrayList<>();  // 声明一个ArrayList集合，元素类型为String
        System.out.println(al1);  // []，空集合

        // add方法添加元素
        al1.add("str1");
        al1.add("str2");
        al1.add("str3");
        al1.add("str4");
        System.out.println(al1);

        // remove方法按值删除元素，集合有此元素则返回true
        boolean res1 = al1.remove("str5");
        System.out.println("Delete element \"str5\": " + res1);
        System.out.println(al1);
        boolean res2 = al1.remove("str4");
        System.out.println("Delete element \"str4\": " + res2);
        System.out.println(al1);

        // remove方法也可以按索引删除元素，返回值为被删除的元素
        String res3 = al1.remove(2);
        System.out.println("Deleted " + res3);
        System.out.println(al1);

        // set方法可以修改指定位置的元素
        al1.set(1, "STR2");
        System.out.println(al1);

        // int的包装类为Integer
        // char的包装类为Character
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Character> al3 = new ArrayList<>();
    }
}
