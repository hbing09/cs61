package com.huizi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        int num = 10;

        System.out.println(20-242);
        System.out.println(20*242);
        System.out.println(10/2);
        System.out.println(10/3); // 3.3333 -> 3
        System.out.println(10%3);
        System.out.println(-10/3); // -3.3333 -> -3
        System.out.println(-10%3);

        num = num -1; // num -= 1
        System.out.println(num);

        // 练习1：翻转一个三位数
        num = 123; // 321
        int digit1 = num % 10;
        int digit2 = num / 10 % 10;
        int digit3 = num / 100;
        System.out.println(digit1 * 100 + digit2 * 10 + digit3);

        //练习2：交换两个整型变量的值； 定义一个中间变量
        int num1 = 10;
        int num2 = 15;
        System.out.println(num1);
        System.out.println(num2);

        int temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println(num1);
        System.out.println(num2);

        // two sum
        // 异或（exclusive OR）运算: a ^ b, 相同取 0，不同取1
        int a = 2;
        int b = 1;
        System.out.println(a ^ b);

    }
}
