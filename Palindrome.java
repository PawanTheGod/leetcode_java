public class Palindrome {
    public static void main(String args[]){
        Palindrome obj = new Palindrome();
        int n = 1221;
        int rev = obj.palindrome_fun(n);
        if(n == rev){
            System.out.println(n + " is a palindrome number");
        }
        else{
            System.out.println(n + " is not a palindrome number");
        }
    }
    public int palindrome_fun(int n){
        int reversed = 0 ;
        int lastDigit = 0 ;
        while(n>0){
            lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
}
