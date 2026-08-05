import java.util.Scanner;

public class arrays {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value of index " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The value of Arr[" + i + "] is " + arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the array is " + sum);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value of the array is " + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum value of the array is " + min);

        int avg= sum/arr.length;
        System.out.println("average is : "+avg);

        System.out.println("count the numbers of even and odd numbers in the array");
        int evenCount = 0; 
        int oddCount = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

        System.out.println("Printing the array in reverse order");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println("The value of Arr["+ i + "] is " + arr[i]);
        }

        System.out.println("Enter the key to search in the array");
        int key = sc.nextInt();
        for(int i = 0 ;i< arr.length;i++){
            if(arr[i] == key){ 
                System.out.println("The element is found at : "+ i);
            }
        }

    }
    
}