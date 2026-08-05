public class copyOfArray {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        int b[] = a;
        int c[];
        System.out.println("Elements of array a:");
        System.out.println("Method - basic for Beginners :");
        for(int i: b){
            System.out.print(i + " ");
        }
        System.out.println("\nMethod 1 :");
        for(int i : a){
            b[i] = a[i];
        }
        for(int i: b){
            System.out.print(i + " ");
        }

    }
}
