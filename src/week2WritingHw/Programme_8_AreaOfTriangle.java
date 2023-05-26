package week2WritingHw;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the length of the triangle : ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle :");
        int height = scanner.nextInt();
        areaOfTriangle(length,height);
        // closing the scanner object
        scanner.close();


    }
    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int lenght , int height){
        int area =(lenght*height)/2;
        System.out.println("The Area of a triangle is : " + area);
    }
}
