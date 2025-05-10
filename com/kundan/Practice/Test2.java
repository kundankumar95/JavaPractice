package com.kundan.Practice;
import java.util.Scanner;
import java.util.ArrayList;

public class Test2 {

    private static void sortTheArr(ArrayList<Integer> arr){
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == 0){
                cnt0++;
            }
            else if(arr.get(i) == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }

        for(int i=0;i<arr.size();i++){
            if(i < cnt0){
                arr.set(i, 0);
            }
            else if(i < cnt0 + cnt1){
                arr.set(i, 1);
            }
            else{
                arr.set(i, 2);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<size;i++){
            int ele = sc.nextInt();
            arr.add(ele);
        }

        sortTheArr(arr);

        for(int i=0;i<size;i++){
            System.out.print(arr.get(i) + " ");
        }

    }
}
