import java.util.LinkedList;

public class LinkedListExample_pract_1 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("LinkedList Elements:");
        for (String item : list) {
            System.out.println(item);
        }

        list.remove("Banana");

        System.out.println("\nAfter Removing Banana:");
        System.out.println(list);
    }
}