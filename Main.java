package com.company;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row and column:");
        int i,k = sc.nextInt();
        for( i=1;i<=5;i++){
            for(int l=i;l<5;l++){
                System.out.print(" ");
            }
            for( k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}