class countDigit {
    public static void main(String[] args) {
        countDigit obj = new countDigit();
        int n = 12345;
        int digitCount = obj.countDigitt(n);
        System.out.println("Number of digits in " + n + " is: " + digitCount);
    }
    public int countDigitt(int n) {
        int count=0;
        while(n>0){
            count = count + 1 ;
            n = n / 10 ;
            
        }
        return count;
    }
}