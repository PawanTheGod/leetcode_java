class reverse {
    public static void main(String[] args) {
        reverse obj = new reverse();
        int n = 12345;
        int digitCount = obj.reverseFun(n);
        System.out.println("Reversed number of " + n + " is: " + digitCount);
    }
    public int reverseFun(int n) {
        int reversed = 0;
        while(n != 0){
            
            int lastDigit = n % 10 ;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;

        }
        return reversed;
    }
}