public class pattern8 {
    public static void main(String args[]) {
        pattern8 obj = new pattern8();
        obj.pattern8_fun(5);
    }

    public void pattern8_fun(int n) {
        for (int i = n-1; i >= 0; i--) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
