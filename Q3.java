public class Q3 {
    public static void main(String[] args) {
        String X = "Mississippi";
        System.out.println(X.replaceAll("i","!"));
        System.out.println("Expected: M!ss!ss!pp!\n");
        System.out.println(X.replaceAll("s","$"));
        System.out.println("Expected: Mi$$i$$ippi");
    }
}