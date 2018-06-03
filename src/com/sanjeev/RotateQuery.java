package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class RotateQuery
{
    public static int operationRight(int start,int sizeOfArray,int kPos){
        start=start-kPos;
        if(start<0){
            start =sizeOfArray+start;
        }
        return start;
    }

    public static int operationLeft(int start,int sizeOfArray,int kPos){
        start =  (start + kPos)%sizeOfArray;
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int start=0;
        int sum[] = new int[arr.length];
        int queries[][] = {{ 1, 3 },{ 3, 0, 2 },{ 2, 1 },{ 3, 1, 4 }};
        for(int i=0;i<arr.length;i++){
            if(i==0) {
                sum[i] = arr[0];
            }else {
                sum[i] =sum[i-1]+arr[i];
            }
        }

        int []command;
        int left=0;
        int right=0;
        for(int i=0;i<queries.length;i++){
            command=queries[i];
            if(command[0]==1){
                start=operationRight(start,arr.length,command[1]);
            }else if(command[0]==2){
                start=operationLeft(start,arr.length,command[1]);
            }else if(command[0]==3){
                left = (start + command[1]) % arr.length;
                right = (start + command[2])%arr.length;
                System.out.println("Left :"+left+" Rifht "+right);
                if(left<right){
                    System.out.println("Res :"+(sum[right]-sum[left]+arr[left]));
                }else {
                    System.out.println("Res :"+(sum[arr.length-1]-sum[left]+sum[right]+arr[left]));
                }
            }
        }
    }
}
