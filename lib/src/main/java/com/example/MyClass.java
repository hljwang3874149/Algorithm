package com.example;

public class MyClass {

    public static void main(String[] args) {

        int[] selectionArray = Utility.randomArray(50000, 0, 1000000);
        int[] copyArray = selectionArray.clone();
        int[] copyBubble = selectionArray.clone();

//        int[] after = selectionSort(selectionArray);
        inputSort(copyArray);
        inputSort1(selectionArray);
        int[] input = bubbleSort(copyBubble);

        for (int value : input) {
            System.out.println(value);
        }
    }

    //选择排序 o(n2)
    private static int[] selectionSort(int[] selectionArrary) {
        long startTime = System.currentTimeMillis();

        int selection;
        for (int i = 0, len = selectionArrary.length; i < len; i++) {
            selection = i;
            for (int j = i + 1; j < len; j++) {
                if (selectionArrary[j] < selectionArrary[selection]) {
                    selection = j;
                }

            }
            swap(selectionArrary, selection, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("selection = " + (endTime - startTime));
        return selectionArrary;
    }

    private static void swap(int[] selectionArrary, int selection, int check) {
        int value = selectionArrary[check];
        selectionArrary[check] = selectionArrary[selection];
        selectionArrary[selection] = value;
    }

    // 插入排序优化 当排序值 很接近时 复杂度接近o(N)
    private static int[] inputSort(int[] source) {
        long startTime = System.currentTimeMillis();

        for (int i = 1, len = source.length; i < len; i++) {
            int value = source[i];
            int j;
            for (j = i; j > 0 && source[j - 1] > value; j--) {
                source[j] = source[j - 1];
            }
            source[j] = value;
        }

        System.out.println("input " + (System.currentTimeMillis() - startTime));
        return source;
    }

    //插入排序 o(n2）
    private static int[] inputSort1(int[] source) {
        long startTime = System.currentTimeMillis();

        for (int i = 1, len = source.length; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (source[j] < source[j - 1]) {
                    swap(source, j, j - 1);
                } else break;
            }
        }

        System.out.println("input " + (System.currentTimeMillis() - startTime));
        return source;
    }

    //冒泡排序 o(n2)
    private static int[] bubbleSort(int[] source) {
        long startTime = System.currentTimeMillis();
        for (int i = 0, len = source.length - 1; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (source[j] > source[j + 1]) {
                    swap(source, j + 1, j);
                }
            }
        }

        System.out.println("input " + (System.currentTimeMillis() - startTime));
        return source;
    }

}
