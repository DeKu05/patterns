package com.company;
import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a =1;
    for(int i=0; i<n;i++){
        for(int j=1;j<=i+1;j++){
            if((i+j)%2==0) {
                System.out.print(0 + " ");
            }
            else{
                System.out.print(1+" ");
            }
        }
        System.out.println();
    }
    }

}