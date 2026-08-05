    import java.util.Scanner;
    public class GCD {
        public static void main(String[] args) {
            int number1 , number2;
            System.out.println("Enter first number to find GCD");
            Scanner sc = new Scanner(System.in); 
            number1 = sc.nextInt();
            System.out.println("Enter second number to find GCD");
            number2 = sc.nextInt();
            int gcd = 0;
            // for(int i = 1 ; i <= number1 && i<= number2 ; i++){
            //     if(number1 % i == 0 && number2 % i == 0){
            //         gcd = i;
            //     }
            // }
            while(number1 != number2){
                if(number1>number2){
                    number1 = number1 - number2;
                }
                if(number2>number1){
                    number2 = number2 - number1;
                }

            }


            System.out.println("GCD : "+ number1 );
        }
    }
