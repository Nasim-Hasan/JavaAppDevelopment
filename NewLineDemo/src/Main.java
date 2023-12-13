public class Main {
    public static void main(String[] args) {
        String hasNewline = "this has a newline\n.";
        String noNewline = "this doesn't";

        System.out.println(hasNewline.contains("\n"));
        System.out.println(hasNewline.contains("\\n"));
        System.out.println(noNewline.contains("\n"));
        System.out.println(noNewline.contains("\\n"));

        String word = "test\n.";
        System.out.println(word.length());
        System.out.println(word);
        word = word.replace("\n","\n ");
        System.out.println(word.length());
        System.out.println(word);
    }
}