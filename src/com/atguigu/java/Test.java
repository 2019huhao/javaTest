package com.atguigu.java;

/**
 * 赋值运算：先算等号右边的，然后再赋值。
 * 《JAVA虚拟机规范》
 * */
public class Test {
    public static void main(String[] args) {
        //首先定义一个局部变量i=1；
        int i = 1;
        //将i值压入操作数栈，i++导致局部变量的i等于2，再将操作数栈中的i值传给左边的i，所以此时的i又等于1；
        i = i++;
        System.out.println("1-----> i =" + i);
        //将i=1压入操作数栈，然后i++导致i的值等于2，再将操作数栈中的i=1值赋值给左边的j，所以j等于1，但是i等于2；
        int j = i++;
        System.out.println("2-----> j =" + j);
        System.out.println("3-----> i =" + i);
        //首先将i=2存入操作栈，执行i++所以i=3
        int k = i+ ++i * i++;
        System.out.println("i =" + i);
        System.out.println("j =" + j);
        System.out.println("k =" + k);

        int n = 1;
        n = n++;
        System.out.println("1-----> n =" + n);
        n = ++n;
        System.out.println("2-----> n =" + n);
    }
}
