public class pattern3 {
    public static void main(String args[]){
        pattern3 obj = new pattern3();
        obj.pattern3_fun(6);
    }
    
    void pattern3_fun(int n){
        for(int i = 1 ; i <=n;i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
