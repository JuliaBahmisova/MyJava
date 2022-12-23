import java.util.Scanner;

public class Forwhile_1 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число до 15: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        if (n > 15) {
            System.out.println("Число должно быть от1 до 15");
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }
            System.out.println(sum);
        }
        sc.close();
    }

}
