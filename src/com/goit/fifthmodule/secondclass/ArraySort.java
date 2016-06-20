package com.goit.fifthmodule.secondclass;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arrayKsu = {-13, 37, 89, -57, 14, 92, 77};

        Arrays.sort(arrayKsu);

        for (int element : arrayKsu) {
            System.out.println(element);
        }
    }
}
