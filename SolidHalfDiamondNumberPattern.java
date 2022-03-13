package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b;
        for(int i=0; i<=n; i++){
            for(int j=0;j<=i;j++){
                a=n-j;
                System.out.print(a);
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=n;j>0+i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
