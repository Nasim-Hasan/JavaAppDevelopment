import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<List<String>> nature = new ArrayList<List<String>>();
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<String> colors = new ArrayList<String>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        nature.add(fruits);
        nature.add(colors);

        // Get the iterator
        Iterator it = nature.iterator();

        System.out.println(it.hasNext());

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}