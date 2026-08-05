class solution11 {
    int count = 1;
    public void printNumbers(int n) {
        // Your code goes here
        System.out.println(count);
        if(count == n){
            return ;
        }
        count++;
        printNumbers(n);
    }
    public static void main(String[] args) {
        solution11 obj = new solution11();
        obj.printNumbers(5);
    }
}