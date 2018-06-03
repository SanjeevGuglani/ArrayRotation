package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */


//Find Maximum Sum of Element if rotation is allowed
    //Time Complexity O(n2)
public class MaxSumInArray {

    public static int maxSumInArray(int arr[]){
        int max=0,sum=0,j,k;
        for(int i=0;i<arr.length;i++){
            sum=0;j=i;k=0;
            while(true){
                sum = sum + arr[j]*k;
                j++;
                k++;
                if(j>=arr.length){
                    j=j%arr.length;
                }
                if(j==i) break;
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 2, 10};
        System.out.println(maxSumInArray(arr));
        int arr1[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maxSumInArray(arr1));
    }
}
