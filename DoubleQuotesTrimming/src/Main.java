public class Main {
    public static void main(String[] args) {
       String str= "RAUZ969303-BR 00 localize item is not allowed to connect under Global/Original item. Please change \"Allow localized item in BOM\" attribute of the parent item to be Yes, then try again.";
       str = str.replaceAll("\"", "");
       System.out.println(str);
    }
}