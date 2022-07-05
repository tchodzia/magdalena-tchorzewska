import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Leon");
        names.add("Olaf");
        names.add("Dorota");
        names.add("Monika");
        names.add("Szymon");

        System.out.println(names);
        names.set(3, "Barbara");
        names.add(2, "Jerzy");


        int size = names.size();
        System.out.println(size);
        System.out.println(names);
        names.remove("Barbara");
        System.out.println(names);

        ArrayList<Integer> arrNumbers = new ArrayList<>();

    }
}
