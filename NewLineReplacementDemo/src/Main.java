public class Main {
    public static void main(String[] args) {
        String s = "Replace\n"
                + " all\n"
                + " line\n"
                + " breaks\n"
                + " from\n"
                + " strings";

        System.out.println("Original String with line breaks - " + s);

        // replacing line breaks from string
        s = s.replace("\n", "");

        System.out.println("String after replacing line breaks - " + s);
    }
}