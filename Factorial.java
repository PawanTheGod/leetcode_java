public class Factorial{
    int fact = 1;
    static int factFun(int n){
        if(n==1){
            return 1;
        }
        return n * factFun(n-1);
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.factFun(5));
    }
}


