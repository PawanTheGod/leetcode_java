import java.util.Scanner;

public class prime_Number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is prime or not");
        n = sc.nextInt();
        // if(n % n == 0 && n % 1 == 0){
        // System.out.println("Prime");
        // }else{
        // System.out.println("not prime");
        // }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
    }
}
