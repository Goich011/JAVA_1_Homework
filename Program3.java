//Вывести все простые числа от 1 до 1000

public class Program3 {
    public static void main(String[] args){
        boolean flag = false;
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }


            }
            if (flag == false){
                System.out.print(i + " ");
            }
            flag = false;
        }

    }
}
