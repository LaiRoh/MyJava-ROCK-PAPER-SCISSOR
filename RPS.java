package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to Rock-Paper-Scissor");
        int min = 1;
        int max = 3;
        int ranNum = (int) (Math.random() * (max - min + 1) + min);

        //here 1 = rock, 2 = paper, and 3 = scissor

        System.out.println("Enter 1, 2, or 3 [REMEMBER: here 1 = rock, 2 = paper, and 3 = scissor]");
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();

        

            if (ranNum == 1) {
                if (userNum == 1) {
                    System.out.println("The game is draw between you and computer.");
                    System.out.println(ranNum);
                } else if (userNum == 2) {
                    System.out.println("You won this time!");
                    System.out.println(ranNum);
                } else if (userNum == 3) {
                    System.out.println("Oh no! You Lost!");
                    System.out.println(ranNum);
                } else {
                    System.out.println("The value you entered is incorrect! Please check it once.");
                }
            } else if (ranNum == 2) {
                if (userNum == 2) {
                    System.out.println("The game is draw between you and computer.");
                    System.out.println(ranNum);
                } else if (userNum == 3) {
                    System.out.println("You won this time!");
                    System.out.println(ranNum);
                } else if (userNum == 1) {
                    System.out.println("Oh no! You Lost!");
                    System.out.println(ranNum);
                } else {
                    System.out.println("The value you entered is incorrect! Please check it once.");
                }
            } else {
                if (userNum == 3) {
                    System.out.println("The game is draw between you and computer.");
                    System.out.println(ranNum);
                } else if (userNum == 1) {
                    System.out.println("You won this time!");
                    System.out.println(ranNum);
                } else if (userNum == 2) {
                    System.out.println("Oh no! You Lost!");
                    System.out.println(ranNum);
                } else {
                    System.out.println("The value you entered is incorrect! Please check it once.");
                }
            }
        } 
}
