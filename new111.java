import java.util.*;
class new111
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char b=sc.next().charAt(0);
        int c=sc.nextInt();
        if(b=='/')
        {
            System.out.print(a/c);
        }
        else
        System.out.print(a%c);
    }
}

