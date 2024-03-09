package Mikihazi;

public class IfElse {
    public static void main(String[] args) {
        char muvelet = '*';
        int a = 12;
        int b = 6;
        int eredmeny;
        if (muvelet == '+') {
            eredmeny = a + b;
        } else if (muvelet == '-'){
            eredmeny = a - b;
        } else if (muvelet == '/'){
            eredmeny = a / b;
        } else {
            eredmeny = a * b;
        }
        System.out.println("Az eredmény: "+ eredmeny);
    }
}
