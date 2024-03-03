public class HarmadikFeladat {
    public static void main(String[] args) {
        System.out.println("A hárommal osztható számok -100 és 100 között a következők: ");
        int firstnumber = -100;
        int secondnumber = 100;
        for (int i = firstnumber + 1; i < secondnumber; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
