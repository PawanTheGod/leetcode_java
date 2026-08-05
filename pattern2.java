public class pattern2{
    public static void main(String args[]){
        pattern2 obj  = new pattern2();
        obj.pattern2_fun(5);
    }
    public void pattern2_fun(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}