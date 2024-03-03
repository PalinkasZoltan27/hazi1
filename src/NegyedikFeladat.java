public class NegyedikFeladat {
    public static void main(String[] args) {
        System.out.println("A páros számok 1 és 10 között a következők: ");
        int firstnumber = 1;
        int secondnumber = 10;
        for (int i = firstnumber + 1; i < secondnumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n---------------------");

        //tömbbel:

        System.out.println("A páros osztható számok 1 és 10 között a következők: ");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
          //  if (i % 2 == 0) ;
            nums[i] = i;
        }

        for (int num : nums) {
            // if (num % 2 == 0);
            System.out.print(num + " ");
        }
    }
}
