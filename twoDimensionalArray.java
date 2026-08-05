public class twoDimensionalArray {
    public static void main(String[] args) {
        // int arr [][] = new int [3][3]; // one way to intialize 2D array
        int arr1[] = { 10, 20, 30, 40, 50 };
        System.out.println("Entering elements in array:");
        int fromMethod[] = getArray();
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Elements in 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Passing array to method:");
        printArray(arr1);
        System.out.println("\nReturning array from method:");
        for (int i : fromMethod) {
            System.out.print(i + " ");
        }

    }

    // arrays can be passed in methods
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Arrays can be returned from methods
    static int[] getArray() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

}
