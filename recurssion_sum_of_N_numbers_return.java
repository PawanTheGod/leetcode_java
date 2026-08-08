public class recurssion_sum_of_N_numbers_return {
    public int printSum(int n) {
        if (n == 1) {

            return 1;
        }
        return n + printSum(n - 1);
    }
    public static void main(String[] args) {
        recurssion_sum_of_N_numbers_return obj = new recurssion_sum_of_N_numbers_return();
        System.out.println(obj.printSum(5));
    }
}
