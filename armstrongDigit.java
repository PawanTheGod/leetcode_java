import java.util.Scanner;

public class armstrongDigit {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking");
        number = sc.nextInt();
        System.out.println("Is armStrong number : " + isArmStrong(number));

    }

    static boolean isArmStrong(int n) {
        int digit = 0, temp;
        int sum = 0;
        temp = n;
        while (temp > 0) {   // all digit calculate logic  
            temp = temp / 10;
            digit++;
        }
        System.out.println("Number of digit = " + digit);
        
        temp = n;
        while (temp > 0) {              // 1^3 + 5^3 + 3^3 logic  
            int lastDigit = temp % 10;
            sum = (int) (sum + Math.pow(lastDigit, digit));
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
