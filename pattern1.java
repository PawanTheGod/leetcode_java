class pattern1 {  
    public static void main(String args[]){
        pattern1 obj = new pattern1();
        obj.pattern1_fun(5);
    }
    public void pattern1_fun(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0 ; j< n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}