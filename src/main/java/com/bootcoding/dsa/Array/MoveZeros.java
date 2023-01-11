package com.bootcoding.dsa.Array;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] ={0,1,0,3,12};
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[0] + " ");
    }
}
