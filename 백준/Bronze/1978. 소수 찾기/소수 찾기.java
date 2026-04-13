import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 수의 개수
        int count = 0;          // 소수 개수

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(count);
    }
    // 소수 판별
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}