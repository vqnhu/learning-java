package OOP.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //    exception = an event occurs during the execution of a program that
        //                disturb the normal flow of instructions

//        Hvis koden ikke fungerer så kommer en exception i form av eks en beskjed.
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide;");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by;");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            scanner.close();
        }
    }
}

