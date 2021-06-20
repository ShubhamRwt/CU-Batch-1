package com.company.Arrays;

import com.company.Arrays.ArrayUtils;

import java.util.Arrays;

public class ReversalAlgo {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5};
        int k=2;
        reversalAlgo(ar,k);
    }

    public static void reversalAlgo(int[] ar, int k){

        ArrayUtils.reversal(ar, 0, k-1);
        System.out.println(Arrays.toString(ar));

        ArrayUtils.reversal(ar, k, ar.length-1);
        System.out.println(Arrays.toString(ar));

        ArrayUtils.reversal(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));

    }
}
