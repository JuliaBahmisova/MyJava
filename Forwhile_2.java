import java.util.Scanner;

public class Forwhile_2 {

    public static void main(String[] args) {
        System.out.print("Введите число которое нужно возвести в степень");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Введите степень в которую нужно возвести число");
        int n = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(result);
        sc.close();
    }

}
