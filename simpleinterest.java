import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[]) 
    {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        p = s.nextFloat();
        r = s.nextFloat();
        t = s.nextFloat();
      float si;
        si = (r * t * p) / 100;
        System.out.print((int)si);
    }
}
