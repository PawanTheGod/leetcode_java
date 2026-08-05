import java.util.ArrayList;

public class ArrayListExample_pract_2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList Elements:");
        for (String language : list) {
            System.out.println(language);
        }

        list.remove("Python");

        System.out.println("\nAfter Removing Python:");
        System.out.println(list);
    }
}
