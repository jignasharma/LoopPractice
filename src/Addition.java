import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any five numbers to calculate sum: ");
        int number = scanner.nextInt();
        int i, s = 0;

        for (i= 0; i<= 5; i++)


            s += i;

        System.out.println("The sum of five number is: " + s + "");
    }
}