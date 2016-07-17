package com.goit.fifthmodule.firstclass;

public class Min {
    public static void min(int[] arrayKsu) {
        for (int i = 0; i < arrayKsu.length; i++) {
            int min = arrayKsu[i];
            int mini = i;
            for (int j = i + 1; j < arrayKsu.length; j++) {
                if (arrayKsu[j] < min) {
                    min = arrayKsu[j];
                    mini = j;
                }
            }
            if (i != mini) {
                int imn = arrayKsu[i];
                arrayKsu[i] = arrayKsu[mini];
                arrayKsu[mini] = imn;
            }
        }
        System.out.println("Min value in this array is: " + arrayKsu[0]);
    }
}
