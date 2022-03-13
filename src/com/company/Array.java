package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {




    public int[] met() {
        Random random = new Random();
        int[] array = new int[50];

        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(0, 2);


        }
        //System.out.println(Arrays.toString(array));
        return array;
    }


}


