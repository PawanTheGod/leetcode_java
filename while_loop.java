public class while_loop{
    public static void main(String[] args){
        int factorial = 1 ;
        int n = 5;
        while(n>0){
            factorial *= n;
            n--;
        }
        System.out.println("Factorial of 5 is: " + factorial);
    }
}