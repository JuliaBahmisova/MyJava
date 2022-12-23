import java.util.Scanner;

public class while_3 {

    public static void main(String[] args) {
        System.out.print("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int i = 0;
        while (i < n) {

            if (i == 0) {
                System.out.println(result);
            } else {
                result = result - 5;
                System.out.println(result);
            }
            i++;
        }

        sc.close();
    }

}
