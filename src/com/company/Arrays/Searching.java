package com.company.Arrays;

public class Searching {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,10};

        System.out.println(binarySearch(ar,10));

        System.out.println(linearSearch(ar, 10));
    }

    public static int linearSearch(int[] ar, int element){

        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]==element){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] ar, int element){


        int start = 0;
        int end = ar.length-1;

        while(start<=end){

            int mid = start+(end - start)/2;  //avoid overflow

            if(ar[mid] == element){
                return mid;
            } else if (ar[mid]<element){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
