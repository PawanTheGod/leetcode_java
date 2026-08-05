public class pattern4 {
    public static void main(String args[]){
        pattern4 obj = new pattern4();
        obj.pattern4_fun(5);
    }
    public void pattern4_fun(int n){
        for(int i = n ; i>=1; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
