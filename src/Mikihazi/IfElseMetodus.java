package Mikihazi;

public class IfElseMetodus {
    public static void main(String[] args) {
        char muvelet = '+';
        int a = 12;
        int b = 6;
        metod(muvelet,a,b);
    }
    private static void metod(char muvelet, int a, int b) {
        int eredmeny;
        if (muvelet == '+') {
            eredmeny = a + b;
        } else if (muvelet == '-') {
            eredmeny = a - b;
        } else if (muvelet == '/') {
            eredmeny = a / b;
        } else {
            eredmeny = a * b;
        }
        System.out.println("Az eredmény: " + eredmeny);
    }
}
