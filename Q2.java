public class Q2 {
    public static void main(String[] args) {
        String X="Mississippi" , Y;
        Y = X.replaceAll("i","ii");
        System.out.println(Y);
        System.out.println(Y.length());
        Y = Y.replaceAll("ss","s");
        System.out.println(Y);
        System.out.println(Y.length());
    }
}
