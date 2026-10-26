import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("podaj liczbe: ");
            int n = scanner.nextInt();
            boolean isPrime = n >= 2;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " jest pierwsza");
            } else {
                System.out.println(n + " nie jest pierwsza");
            }
        }
    }
}