package com.company;
import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a =1;
    for(int i=0; i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i-1);j++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

}
