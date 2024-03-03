import java.util.Scanner;

public class OtodikFeladat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            int userGuess;
            System.out.println("Give me a number! ");
            userGuess = scanner.nextInt();
            if ( userGuess % 2 == 0){
                playAgain = true;
            }
            if ( userGuess % 2 != 0){
                System.out.println("The number is odd. The game is over! ");
                playAgain = false;
            }
        }
    }
}
