import java.util.Scanner;

public class ElsoFeladat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg piramis magasságát: ");
        int height = scanner.nextInt();
        System.out.println("Kérlek add meg a piramis szélességét: ");
        int width = scanner.nextInt();
        System.out.println("Kérlek add meg a piramist alkotó szimbólumokat: ");
        String symbol = scanner.next();
        drawPyramid(height, width, symbol);
    }
    private static void drawPyramid(int height,int width, String symbol) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i * width / height +1 && j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
