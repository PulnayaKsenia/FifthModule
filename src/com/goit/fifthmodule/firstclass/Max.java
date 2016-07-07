package com.goit.fifthmodule.firstclass;

public class Max {

    public static void max(int[] arrayKsu) {

        for (int i = 0; i < arrayKsu.length - 1; i++) {
            for (int j = 0; j < arrayKsu.length - i - 1; j++) {
                if (arrayKsu[j] < arrayKsu[j + 1]) {
                    int imn = arrayKsu[j];
                    arrayKsu[j] = arrayKsu[j + 1];
                    arrayKsu[j + 1] = imn;
                }
            }

        }
        System.out.println("Max value in this array is: " + arrayKsu[0]);

    }

}
