import java.util.*;
import java.math.*;
class bwtamg
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int number = n1 + 1; number < n2; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }
           // originalNumber = number;
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }
            if (result == number)
                System.out.print(number + " ");
        }
    }
}

