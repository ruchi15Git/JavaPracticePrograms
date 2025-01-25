package IfElseStatements;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args){
       /* Write a program that classifies a triangle based on its side lengths.
       Given three input values representing the lengths of the sides,
       determine if the triangle is equilateral (all sides are equal),
       isosceles (exactly two sides are equal),
        or scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1=sc.nextInt();
        System.out.println("Enter side 2: ");
        int side2=sc.nextInt();
        System.out.println("Enter side 3: ");
        int side3=sc.nextInt();
        if(side1<=0||side2<=0||side3<=0){
            System.out.println("Please give proper length of sides: ");
        }else{
        if(side1 == side2 && side2 == side3){
            System.out.println("equilateral triangle.");
        } else if (side1==side2||side2==side3 ||side3==side1) {
            System.out.println("isosceles triangle.");
        }else{
            System.out.println("scalene triangle.");
        }}

    }
}
