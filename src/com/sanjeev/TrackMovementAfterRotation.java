package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class TrackMovementAfterRotation {

    public static int elementAtGivenIndex(int arr[],int rotations[][],int index){
        int left,right;
        for(int i=rotations.length-1;i>=0;i--){
            left = rotations[i][0];
            right = rotations[i][1];
            if(left<=index && right>=index){
                if(left==index) index=right;
                else index--;
            }
            //System.out.println(index);
        }
        return arr[index];
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };


        // No. of rotations
        int rotations = 2;

        //12345
        //41235
        //24135
        //32415
        //13245

        // Ranges according to 0-based indexing
        int ranges[][] = { { 0, 3 }, { 0, 2 },{0,3} ,{0,4}};

        int index = 3;

        System.out.println(elementAtGivenIndex(arr, ranges, index));


    }
}

