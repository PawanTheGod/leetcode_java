public class recurssion_sum_of_N_numbers {
    public static int sum= 0;

    public void Sum_Of_Num(int n){
        if(n==0 ){
            return  ;
        }
        sum+=n;
        Sum_Of_Num(n-1);
    }
    public static void main(String[] args) {
        recurssion_sum_of_N_numbers obj = new recurssion_sum_of_N_numbers();
        obj.Sum_Of_Num(5);
        System.out.println(" sum : "+sum);
    }

}
