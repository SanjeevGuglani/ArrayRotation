package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class FindPairInSortedArray {

    public static void printPairs(int arr[],int sum){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==sum){
                System.out.println(arr[start]+"  "+arr[end]);
                return;
            }else if(arr[start]+arr[end]<sum){
                start++;
            }else {
                end--;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int arr[]= {3,12,23,34,35,45,64};
        int sum=70;
        printPairs(arr,sum);
    }
}
