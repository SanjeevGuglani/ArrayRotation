package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class RotateHammingDistance {

    public static  int rotateHammingDistance(int arr[]){
        int j=0;
        int max=0,sum;
        for(int i=0;i<arr.length;i++){
            sum=0;
            j=i;
            for(int k=0;k<arr.length;k++){
                 if(arr[k]!=arr[j]){
                     //System.out.println("Rotation "+i+" K :"+k+" J :"+j);
                     sum++;
                 }
                 j++;
                 j=j%arr.length;
                 if(j==k) break;
            }
            //System.out.println("Rotation "+i+" sum :"+sum+" max :"+max);
            max = (sum>max)? sum:max;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1};
        System.out.println(rotateHammingDistance(arr));
        int arr1[] = {2,4,1,1};
        System.out.println(rotateHammingDistance(arr1));
    }
}
