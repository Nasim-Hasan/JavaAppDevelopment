import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Create a Map
        Map<Integer, String> map = new HashMap<>();

        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");

        // Print the Map
        System.out.println("Map: " + map);

        // Convert the Map to Stream
        Stream<Map.Entry<Integer, String>> stream = map.entrySet().stream();

        // Print the TreeMap
        System.out.println("Stream: " + Arrays.toString(stream.toArray()));
    }
}