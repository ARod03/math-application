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

        System.out.println("The distance between the 2 points is " + Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) + ".");

        //6. Find and display the absolute (positive) value of a variable after it is set to -3.8

        double value = -3.8;
        System.out.println("The absolute value of -3.8 is " + Math.abs(value) + ".");

        //7. Find and display a random number between 0 and 1

        System.out.println("While picking between numbers 0 and 1, I have gotten " + Math.random() + ".");

        //8. Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with.

        int days = 24;
        int minutesPerHour = 60;
        int hoursPerDay = 24;

        System.out.println("There are " + days * hoursPerDay * minutesPerHour + " minutes in 24 days.");

        //BONUS: How many milliseconds?

        int totalMinutes = days * hoursPerDay * minutesPerHour;

        System.out.println("There are " + totalMinutes * 60 * 1000 + " milliseconds in a day.");

    }
}
