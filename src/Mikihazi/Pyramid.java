package Mikihazi;

public class Pyramid {
    public static void main(String[] args) {
        char symbol = '+';
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

}
