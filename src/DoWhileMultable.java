import java.util.Scanner;

public class DoWhileMultable {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int inputi = s.nextInt();

        for(int i = 0; i < Math.ceil(inputi / 5.0) * 10; i++) {
            if ( i > 0 && i % 10 == 0 ) System.out.println();

            int t = inputi - 5 * (i / 10);
            for(int j = 0; j < (t > 5 ? 5 : t); j++) {
                int a = 5 * (i / 10) + j + 1;
                int b = i % 10 + 1;
                System.out.print(a + " x " + b + " = "  + (a * b) + "\t");
            }
            System.out.println();
        }
    }
        }



