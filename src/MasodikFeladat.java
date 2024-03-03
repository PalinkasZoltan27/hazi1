import java.util.Scanner;

public class MasodikFeladat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg -100 és 100 között az első számot: ");
        int firstnumber = scanner.nextInt();
        System.out.println("Kérem adja meg -100 és 100 között a második számot: ");
        int secondnumber = scanner.nextInt();
        System.out.println("A két szám közötti páros számok a következők: ");
        for (int i = firstnumber + 1; i < secondnumber; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n---------------------");

        System.out.println("Kérem adja meg -100 és 100 között az első számot: ");
        int firstnumber2 = scanner.nextInt();
        System.out.println("Kérem adja meg -100 és 100 között a második számot: ");
        int secondnumber2 = scanner.nextInt();
        System.out.println("A két szám közötti páros számok a következők: ");
        int[] nums = new int[secondnumber2];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i-firstnumber2;
            //if (i % 2 == 0);
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }



    }
}
