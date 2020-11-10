package ru.job4j.condition;

public class AlertDivByZero {

    public static void posibleDiv(int number) {
        if (number == 0) {
            System.out.println("Cannot be divided by 0.");
        } else if (number < 0) {
            System.out.println("This is negative number.");
        } else {
            System.out.println("This is positive number.");
        }
    }

    public static void main(String[] args) {
        posibleDiv(4);
        posibleDiv(-2);
        posibleDiv(0);
    }
}
