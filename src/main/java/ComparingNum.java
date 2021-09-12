/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class ComparingNum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        largest = Math.max(num1,largest);
        largest = Math.max(num2,largest);
        largest = Math.max(num3,largest);
        System.out.println("The largest number is "+largest+".");
        sc.close();
    }
}
