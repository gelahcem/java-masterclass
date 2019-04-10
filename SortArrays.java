package com.example.app;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {
    private static Scanner scanner = new Scanner(System.in);
    
    public SortArrays(int i) {
        int[] myIntegers = getIntegers(i);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
	}

	public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity +" integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

                int[] sortedArray = Arrays.copyOf(array, array.length);
        
                boolean flag = true;
                int temp;
                while(flag) {
                    flag = false;

                    for(int i=0; i<sortedArray.length-1; i++) {
                        if(sortedArray[i] < sortedArray[i+1]) {
                            temp = sortedArray[i];
                            sortedArray[i] = sortedArray[i+1];
                            sortedArray[i+1] = temp;
                            flag = true;
                        }
                    }
                }
        
                return sortedArray;
            }

}