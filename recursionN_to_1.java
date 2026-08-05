public class recursionN_to_1 {
    int count = 1;

    public void printNumbers(int n) {
        // Your code goes here
        System.out.println(n);
        if (n <= 1) {
            return;
        }
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        recursionN_to_1 obj = new recursionN_to_1();
        obj.printNumbers(5);
    }
}
