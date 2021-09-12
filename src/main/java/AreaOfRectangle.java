/*
 *  UCF COP3330 Fall 2021 Exercise 7 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int f2 = length * width;
        double m2 = f2 * 0.09290304;

        System.out.println(String.format("The area is:\n%d square feet\n%.3f square meters", f2, m2));
    }
}