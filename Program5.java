/*Задано уравнение вида q + w = e, где q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет. */

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner in_1 = new Scanner(System.in);
        System.out.println("Введите первое число в фомате '?цифра':");
        String q = in_1.nextLine();

        Scanner in_2 = new Scanner(System.in);
        System.out.println("Введите второе число в фомате 'цифра?':");
        String w = in_2.nextLine();

        Scanner in_3 = new Scanner(System.in);
        System.out.println("Результат сложения:");
        String e = in_3.nextLine();
        in_1.close();
        in_2.close();
        in_3.close();

        String temp = "?";
        String temp_i = "";
        String temp_j = "";
        int new_q = 0;
        int new_w = 0;
        int new_e = Integer.valueOf(e);
        boolean flag = true;

        for (int i = 0; i < 10; i++) {
            temp_i = Integer.toString(i);
            new_q = Integer.valueOf(q.replace(temp, temp_i));
            for (int j = 0; j < 10; j++) {
                temp_j = Integer.toString(j);
                new_w = Integer.valueOf(w.replace(temp, temp_j));
                if ((new_q + new_w) == new_e) {
                    System.out.printf("Получилось: %d + %d = %d", new_q, new_w, new_e);
                    System.out.println();
                    flag = false;
                }                
            }
        }
    
    if (flag == true) {
        System.out.println("C указанными параметрами рещение уравнения невозможно.");
    }
    }
}
