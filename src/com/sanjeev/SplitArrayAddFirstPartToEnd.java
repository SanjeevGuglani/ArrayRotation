package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
//Split the array and add the first part to the end
public class SplitArrayAddFirstPartToEnd {

    public static void reverseSubArray(int arr[],int beg,int end){
        int temp;
        while(beg<end){
            temp = arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++; end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={10,11,12,13,14};
        int k=1;
        reverseSubArray(arr,0,k);
        reverseSubArray(arr,k+1,arr.length-1);
        reverseSubArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
