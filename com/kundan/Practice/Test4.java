package com.kundan.Practice;
import java.util.Scanner;

public class Test4 {
    private static int countMatchP(int[][] mat, int row, int col){
        int count = -1;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int newRow = row + i;
                int newCol = col + j;
                if(newRow >= 0 && newRow < mat.length && newCol >= 0 && newCol < mat[0].length && mat[newRow][newCol] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    private static void solve(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        double dist = Integer.MAX_VALUE;
        int match = 0;
        int resRow = 0;
        int resCol = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    int count = countMatchP(mat, i, j) + 1;
                    if(count > match){
                        match = count;
                        resRow = i + 1;
                        resCol = j + 1;
                        dist = Math.sqrt((double)(i*i) + (double)(j*j));
                    }
                    else if(count == match){
                        double d = Math.sqrt((double)(i*i) + (double)(j*j));
                        if(d < dist){
                            resRow = i + 1;
                            resCol = j + 1;
                            dist = d;
                        }
                    }
                }
            }
        }

        System.out.println(resRow + " : " + resCol + " : " + match);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ele = sc.nextInt();
                mat[i][j] = ele;
            }
        }

        solve(mat);
    }
}



