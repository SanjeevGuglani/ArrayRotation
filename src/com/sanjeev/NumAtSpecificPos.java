package com.sanjeev;

import java.util.Arrays;

/**
 * Created by Sanjeev Guglani
 */
public class NumAtSpecificPos {

    //Rearrange an array such that arr[i] = i
    //O(n2) time
    //O(n) space
    public static void method1(int arr[]){
        int resultantArray[]=new int[arr.length];
        int j;
        for(int i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(arr[j]==i){
                    resultantArray[i]=i;
                    break;
                }
            }
            if(j==arr.length){
                resultantArray[i]=-1;
            }
        }
        System.arraycopy(resultantArray,0,arr,0,resultantArray.length);
    }

    public static void main(String[] args) {
        int arr[]= {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        method1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
