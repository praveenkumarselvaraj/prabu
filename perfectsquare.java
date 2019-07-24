import java.util.*;
class perfectsquare
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=n*n1;
        double a=Math.sqrt(n2);
            if((a-Math.floor(a))==0)
            {
                System.out.print("yes");
            }
            else
            System.out.print("no");
    }
}


