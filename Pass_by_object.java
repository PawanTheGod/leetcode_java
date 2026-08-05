
class Wrapper {
    int value = 5;
}

public class Pass_by_object {

    static void modify(Wrapper obj){
        obj.value += 10; 
    }
    public static void main(String [] args){
        Wrapper w = new Wrapper();
        System.out.println("Before modify : "+ w.value);
        modify(w);
        System.out.println("After modify : "+ w.value);

    }
    
}
