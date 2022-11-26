//Реализовать простой калькулятор

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Program4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Какую операцию выполнить:\n1. Сложение.\n2. Вычитание.\n3. Умножение.\n4. Деление.");
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();
        System.out.println("Введите числа через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        scan.close();
        switch (operation) {
            case "1" -> {
                String[] data = reader.readLine().split(" ");
                String num1 = data[0];
                String num2 = data[1];
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                System.out.println(a + " + " + b + " = " + (a + b));

            }
            case "2" -> {
                String[] data = reader.readLine().split(" ");
                String num1 = data[0];
                String num2 = data[1];
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                System.out.println(a + " - " + b + " = " + (a - b));

            }
            case "3" -> {
                String[] data = reader.readLine().split(" ");
                String num1 = data[0];
                String num2 = data[1];
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                System.out.println(a + " * " + b + " = " + (a * b));

            }
            case "4" -> {
                String[] data = reader.readLine().split(" ");
                String num1 = data[0];
                String num2 = data[1];
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("На ноль делить нельзя");
                }

            }
            default -> System.out.println("Некорректный ввод");
        }

    }

}
