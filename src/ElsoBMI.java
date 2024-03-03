import java.util.Scanner;

public class ElsoBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a testsúlyát kilogrammban! ");
        double testsuly = scanner.nextDouble();
        System.out.println("Kérem adja meg a magasságát méterben! ");
        double magassag = scanner.nextDouble();
        double bmi = testsuly / (magassag * magassag);

        if(bmi < 18.5) {
            System.out.println("Ön alultáplált ");
        } else if (bmi < 25 ) {
            System.out.println("Ön átlagos ");
        } else if (bmi < 30) {
            System.out.println("Ön túlsúlyos");
        } else {
            System.out.println("Ön elhízott");
        }
    }
}
