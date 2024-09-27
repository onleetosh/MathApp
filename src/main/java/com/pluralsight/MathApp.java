package com.pluralsight;

public class MathApp {


    public static void main (String[] args)  {

        //create two variables to represent the salary for Bob and Gary
        double bobSalary = 50000;
        double garySalary = 60000;

        //create a variable for highest salary between Bod and Gary
        double highestSalary = Math.max(bobSalary, garySalary);

        //display the highest salary
        System.out.println("The highest salary is between Bob and Gary is  " + highestSalary);

        //create two variables named car price and truck and assign a value
        double carPrice = 5000;
        double truckPrice = 10000;

        //find and display the smallest value between two vehicles
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is " + lowestPrice);

        //find and display the area of a circle who radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);
        System.out.println(area);

        //find and display the square root of a variable after it is set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        //find and display the distance between two points (5,10) and (85,50)
        int x1 = 5, y1 = 10;
        int x2 =85, y2 =50;
        double distanceBetween = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is " + distanceBetween);

        //find and display the absolute value of a variable
        double number2 = -3.8;
        double absoluteValue = Math.abs(number2);
        System.out.println("The absolute value of " + number2 + " is " + absoluteValue);

        //find and display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.print("A random number between 1 and 0 is  " + randomNumber );

        //find and display a random number between 1 and 5
        double randomNumber2 = 1 + (Math.random() * 4);
        System.out.println("A random number between 1 and 5 is " + randomNumber2);

    }
}

