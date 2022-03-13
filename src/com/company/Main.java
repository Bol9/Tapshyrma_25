package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        int[] array = new int[50];
        ArrayList<Integer> array1 = new ArrayList<>();
        LinkedList<Integer> array2 = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(0, 2);
            array1.add(random.nextInt(0,2));
            array2.add(random.nextInt(0,2));



        }

        //System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arraySort(array)));
        System.out.println(arraySort(array1));
        System.out.println((arraySort(array2)));





    }
    public static  int[] arraySort(int[] array){

       Arrays.sort(array);
       return array;

    }
    public static ArrayList<Integer> arraySort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        return arrayList;
    }
    public static LinkedList<Integer> arraySort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        return linkedList;
    }
}
