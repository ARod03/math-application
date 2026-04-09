package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

    // Question 1:
    // declare variables here
    // then code solution
    // then use System.out.println() to display results
    // ex: System.out.println("The answer is " + answer);
    // REPEAT FOR NEXT EXERCISE

        //1. Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")

        double bobSalary = 50000.00;
        double garySalary = 60000.00;

        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary + ".");

        //2. Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.

        double carPrice = 18000.00;
        double truckPrice = 26000.00;

        double cheapestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest price between the car and truck is $" + cheapestPrice + ".");

        //3. Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        System.out.println("The area of the circle is " + Math.PI * radius * radius + ".");

        //4. Find and display the square root a variable after it is set to 5.0

        double factor = 5.0;
        System.out.println("The square root of 5.0 is " + Math.sqrt(factor) + ".");

        //5. Find and display the distance between the points (5, 10) and (85, 50)

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;


    }
}
