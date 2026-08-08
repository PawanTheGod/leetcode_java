class reverse {

    public static void main(String[] args) {
        // Create an object of the class to call the non-static method
        reverse obj = new reverse();

        // The number to be reversed
        int n = 12345;

        // Call reverseFun() to get the reversed number
        int digitCount = obj.reverseFun(n);

        // Print the result
        System.out.println("Reversed number of " + n + " is: " + digitCount);
    }

    // Method that takes an integer and returns its reverse
    public int reverseFun(int n) {
        // Variable to store the reversed number, initially 0
        int reversed = 0;

        // Loop until all digits of n are processed
        while (n != 0) {

            // Extract the last digit of n (e.g., 12345 % 10 = 5)
            int lastDigit = n % 10;

            // Append the last digit to the reversed number
            // (shift existing digits left by multiplying by 10, then add the new digit)
            reversed = reversed * 10 + lastDigit;

            // Remove the last digit from n (e.g., 12345 / 10 = 1234)
            n = n / 10;

        }

        // Return the final reversed number
        return reversed;
    }
}