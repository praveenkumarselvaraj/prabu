import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[]) 
    {
        float p, r, t,n,a,d;
        Scanner s = new Scanner(System.in);
        p = s.nextFloat();
        r = s.nextFloat();
        t = s.nextFloat();
        n=t;
        d=r;
        a=p;
         float sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum = sum + a; 
            a = a + d; 
        } 
        System.out.print((int)sum);
    }
}
