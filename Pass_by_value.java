public class Pass_by_value {
    static void modify(int a){
        a = a + 10;
    }
    public static void main(String [] args){
        int x = 5;
        System.out.println("Before modify: " + x);
        modify(x);
        System.out.println("After modify: " + x);
        System.out.println("This demonstrates that Java uses pass-by-value for primitive types.\n but however, if we use objects, the behavior will be different.");
    }
}