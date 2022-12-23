import java.util.Scanner;

public class While_1 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число до 15: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        if (n > 15) {
            System.out.println("Число должно быть от1 до 15");
        } else {
            int i = 1;
            while (i <= n) {
                sum = sum * i;
                i++;
            }

            System.out.println(sum);
        }
        sc.close();
    }

}