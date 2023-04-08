package pl.javastart.task;

import java.util.Scanner;

public class SumOfSquares {
    public void generate() {
        System.out.println("Podaj rozmiar tablicy:");
        Scanner scanner = new Scanner(System.in);
        int arrayLengthNumber = scanner.nextInt();

        double[] numbers = new double[arrayLengthNumber];
        System.out.println("Podaj " + arrayLengthNumber + " liczb:");
        for (int number = 0; number < numbers.length; number++) {
            double numberForArray = scanner.nextDouble();
            numbers[number] = numberForArray;
        }
        double squareSum = 0;
        for (double number : numbers) {
            squareSum += Math.pow(number, 2);
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + (int) squareSum);
        scanner.close();
    }
}
