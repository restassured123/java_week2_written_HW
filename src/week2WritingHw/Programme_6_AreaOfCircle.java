package week2WritingHw;

        //Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = scanner.nextDouble();
         areaOfCircle(radius);

        }
        // Calculating the area of circle

        public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is :" + area);

    }

}


