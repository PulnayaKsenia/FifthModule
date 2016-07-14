package com.goit.fifthmodule.firstclass;

import com.goit.fifthmodule.secondclass.ArraySort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//  anti pattern "boat anchor" - данный экземпляр класса в программе не используется
        CreateArray create = new CreateArray();
        ArrayMinMax minMax = new ArrayMinMax();

        Min.min(minMax.getArrayKsu());
        Max.max(minMax.getArrayKsu());

        ArraySort.ArraySort(minMax.getArrayKsu());
    }
}
