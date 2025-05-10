package com.kundan.Practice;

import java.util.Scanner;
import java.util.ArrayList;

public class Test1 {

    private static int maximumSumSubArray(ArrayList<Integer> arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<arr.size();i++){
            sum += arr.get(i);
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<size;i++){
            int ele = sc.nextInt();
            arr.add(ele);
        }

        int result = maximumSumSubArray(arr);
        System.out.println(result);
    }
}