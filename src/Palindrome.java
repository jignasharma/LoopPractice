import java.util.Scanner;

public class Palindrome
{

        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input any number: ");
            int num = scanner.nextInt();
            int sum = 0, r;
            int temp = num;
            while(num > 0)
            {
                r = num % 10;
                sum = (sum*10)+r;
                num = num/10;
            }
            if(temp==sum)
                System.out.println("It is a Palindrome number.");
            else
                System.out.println("Not a palindrome");
        }
    }


