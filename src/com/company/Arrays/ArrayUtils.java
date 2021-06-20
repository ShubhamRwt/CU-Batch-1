package com.company.Arrays;

import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {

        int[] ar = {1,2,30,4,5};
//
//        System.out.println(maxIndex(ar));

        System.out.println(Arrays.toString(reverse(ar)));


//        placeSwap(ar);
//        System.out.println(Arrays.toString(ar));    // 2, 1 , 3, 4, 5
    }

    public static void placeSwap(int[] a){

        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;

        System.out.println(Arrays.toString(a));  // 2 , 1, 3, 4, 5
    }

    public static int maxIndex(int[] ar){

//        Arrays.sort(ar);    // nlogn

        int max = 0;

        for (int i = 1; i <ar.length ; i++) {

            if(ar[i]>ar[max]){
                max=i;
            }
        }

        //Index out of Bound
        return max;
    }

    public static int[] reverse(int[] ar){

        int start = 0;
        int end = ar.length-1;

        while(start<end){

            int temp = ar[start];
            ar[start]= ar[end];
            ar[end] = temp;

            start++;
            end--;
        }

        return ar;
    }

    public static void reversal(int[] ar, int start, int end){

        while(start<end) {

            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start++;
            end--;
        }
    }

}
