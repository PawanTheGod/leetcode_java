public class recurssion {
    void printN(int count , int n){
        if(count == n){
            return ;
        }
        System.out.println("Pawan "+count +" ");
        printN(count+1,n);

    }
    public static void main(String[] args) {
        recurssion obj = new recurssion();
        obj.printN(0, 10);
    }
}