import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ForLoopOddEven {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input any five digit");
        int input = scanner.nextInt();
        int oddnum = 3;
        int evennum = 2;
        int sum = 0;

        for (int i=1; i<=input;  i++)
        {
            if (input %2==0) {
                evennum = sum;
            }
            else if (input %2==1){
                oddnum = sum;
            }
        }

        System.out.println("These is: "+oddnum+" Odd Numbers");
        System.out.println("These is: "+evennum+" Even Numbers");


    }
}
