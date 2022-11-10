package com.lucia.algo.grunt.primary;

/**
 * @author: zhoulu
 * @date: 2022-11-10
 * @desc: 打印整数的32位二进制表示
 */
public class PrintBinary {

    private static int MAXIMUM = 32;

    public static void main(String[] args) {
        int num = 6;
        printNumber(num);
    }

    public static void printNumber(int num){
        // int-32位  long-64位
        for (int i = MAXIMUM; i >=0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }
}
