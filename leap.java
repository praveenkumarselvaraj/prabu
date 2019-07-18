import java.util.*;
class leap
{
    public static void main(String arv[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n%4==0)
        System.out.print("yes");
      else if(n%400==0)
      {
          System.out.print("yes");
      }
      else if(n%100==0)
      System.out.print("no");
      else
      System.out.print("no");
    }
}

