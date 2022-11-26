//Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();
        int trin = 0;
        for (int i = 0; i < n; i++) {
            trin += i;
        }
        System.out.println(trin);
        scan.close();
    }
}
