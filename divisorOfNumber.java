import java.util.Scanner;

public class divisorOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number for all divisiors:");
        int num ; 
        Scanner sc =  new Scanner(System.in);
        num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
