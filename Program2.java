import java.util.Scanner;

//Вычислить n-ое треугольного число n! (произведение чисел от 1 до n)

public class Program2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();
        long factorial = 1;
        if (n == 0 || n == 1) {
            System.out.println("Факториал числа равен 1");
        } else {
            for (int i = 1; i <= n ; i++) {
                factorial *= i;
            }
            System.out.println("Факториал " + n + " равен: " + factorial);
        }
        scan.close();
    }
}

