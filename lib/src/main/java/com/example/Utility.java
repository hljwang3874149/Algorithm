package com.example;

import java.util.Random;

/**
 * ==================================================
 * 项目名称：Algorithm
 * 创建人：wangxiaolong
 * 创建时间：2016/12/20 下午7:14
 * 修改时间：2016/12/20 下午7:14
 * 修改备注：
 * Version：
 * ==================================================
 */
public class Utility {
    public static int[] randomArray(int num, int start, int end) {
        if (end < 0 || start < 0) {
            throw new IllegalArgumentException("区间值不能小于0");
        }
        if (end <= start) throw new IllegalArgumentException("end 值不能小于等于 start");
        int[] array = new int[num];

        int value = end - start + 1;
        Random mRandom = new Random();
        for (int i = 0; i < num; i++) {
            array[i] = mRandom.nextInt(value) + start;
        }
        return array;
    }
}
