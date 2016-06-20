package com.goit.fifthmodule.firstclass;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arrayKsu = {-13, 37, 89, -57, 14, 92, 77};

        int min = arrayKsu[0];
        for (int i = 0; i < arrayKsu.length; i++) {
            if (min > arrayKsu[i])
                min = arrayKsu[i];
        }
        System.out.println("Минимальное значение в данном массиве " + min);

        int max = arrayKsu[0];
        for (int i = 0; i < arrayKsu.length; i++) {
            if (max < arrayKsu[i])
                max = arrayKsu[i];
        }
        System.out.println("Максимальное значение в данном массиве " + max);
    }
}


