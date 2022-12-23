import java.util.Scanner;

public class For_3 {

    public static void main(String[] args) {
        System.out.print("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(result);
            } else {
                result = result - 5;

                System.out.println(result);
            }
        }
        sc.close();
    }
}
