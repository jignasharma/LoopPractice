import java.util.Scanner;

public class Factorial {

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number to find factorial");

        int number = scanner.nextInt();
        int i=1, factorial = 1;

        while ( i <= number ) {
            factorial = factorial * i;
            i++;

        }


        System.out.println("Factorial of number " + number + " is " + factorial);

    }
}