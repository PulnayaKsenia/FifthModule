package com.goit.fifthmodule.secondclass;

public class ArraySort {
    public static void ArraySort(int[] arrayKsu) {

        boolean swapOccurred = true;

        while (swapOccurred) {
            swapOccurred = false;

            for (int i = 0; i < arrayKsu.length - 1; i++) {
                if (arrayKsu[i] > arrayKsu[i + 1]) {
                    int arrayVariable = arrayKsu[i];

                    arrayKsu[i] = arrayKsu[i + 1];
                    arrayKsu[i + 1] = arrayVariable;

                    swapOccurred = true;

                }
            }
        }
        for (int element : arrayKsu) {
            System.out.println(element);
        }

    }


}
