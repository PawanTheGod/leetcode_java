import java.util.Arrays;

public class reverseArray {
    int arr []={1,2,3,4,5} ;
    int rev [] = new int[5]; 
    void reverseFun(){
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        int j = 0;
        for(int i=arr.length-1 ; i>=0;i--){
            rev[j] = arr[i];
            // System.out.println(rev[i]);
            j++;
        }
        System.out.println("After");
        System.out.println(Arrays.toString(rev));

    }
    public static void main(String[] args) {
        reverseArray obj = new reverseArray();
        obj.reverseFun();
    }
}
