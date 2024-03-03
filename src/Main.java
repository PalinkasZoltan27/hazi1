public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private static void drawHalfPyramid(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(symbol +" ");
            }
            System.out.println();
        }
    }

}