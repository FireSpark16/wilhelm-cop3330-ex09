/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex09.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        final double factor = 350;
        int length = myApp.getLength();
        int width = myApp.getWidth();
        int resultF = myApp.calculateF(length, width);
        int gallons = myApp.calculateGallons(resultF, factor);
        myApp.outPut(resultF, gallons);

    }

    private void outPut(int resultF, int gallons) {
        System.out.print("You will need to purchase " + gallons + " gallons of paint to cover "+ resultF + " square feet.");
    }

    private int calculateGallons(int resultF, double factor) {
        return (int) Math.ceil(resultF / factor);
    }

    private int calculateF(int length, int width) {
        return length * width;
    }

    private int getLength() {
        System.out.print("What is the length of the room in feet? ");
        return Integer.parseInt(in.nextLine());
    }

    private int getWidth() {
        System.out.print("What is the width of the room in feet? ");
        return Integer.parseInt(in.nextLine());
    }
}
