package com.goit.fifthmodule.firstclass;

import java.util.Scanner;

public class CreateArray  {
    //  anti pattern "boat anchor" - данный метод в программе не используется
    public static void create(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("HELLO! This program searches min and max value in array!");

        System.out.println("Please, enter array's length: ");
        int n = in.nextInt();
        int[] arrayKsu = new int[n];

        System.out.println("Enter array's elements: ");
        for (int i = 0; i < n; i++) {
            arrayKsu[i] = in.nextInt();
        }

        System.out.println("Your array's elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrayKsu[i]);
        }

    }
}
