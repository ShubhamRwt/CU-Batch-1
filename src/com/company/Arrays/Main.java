package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        char[] ar = new char[5];   //  0 ,0, 0, 0, 0

        Scanner s = new Scanner(System.in);
        double[] b ={1,2,4,5,6};

        // .length is not a method.
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextLine().charAt(0);
        }

//        for (int i = 0; i < ar.length ; i++) {
//            System.out.println(ar[i]);
//        }

        System.out.println(Arrays.toString(ar));

        System.out.println(ar);
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

    }
}
