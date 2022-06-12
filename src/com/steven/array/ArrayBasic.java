package com.steven.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        //1. 一维数组的声明和初始化 declaration and initialization

        // 1.1  静态初始化 static init
        int[] studentIds;
        studentIds = new int[]{111,222,333,444};
        // 1.2  动态初始化  dynamic init
        String[] names = new String[5];
        names[0] = "S";
        names[1] = "T";
        names[2] = "E";
        names[3] = "V";
        names[4] = "E";

        //2. Get length of an array
        System.out.println(names.length);

        //3. loop through array
        for (int i = 0; i< names.length;i++) {
            System.out.println("element is =>"+names[i]);
        }
        //***** enhanced for loop
        for (String name : names) {
            System.out.println("element is =>" + name);
        }

        //4. 默认初始化值  default initialized value of an array
        int[] intArray = new int[6];
        for(int item : intArray) {
            System.out.println("default initialized value ->"+item);
        }

        short[] shortArray = new short[6];
        for(int item : shortArray) {
            System.out.println("default initialized value ->"+item);
        }

        /*
            some other typed array omitted
         */

        //5. 内存解析   array in memory analysis



        //main
        System.out.println("My Array ==>"+ Arrays.toString(studentIds));
        System.out.println(Arrays.toString(names));
    }
}
