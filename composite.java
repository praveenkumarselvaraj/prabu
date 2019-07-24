import java.util.*;
class composite

{

public static void main(String args[])

{
 int flag=0;
//System.out.print("Enter a number");
 Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 for(int i=2;i<=n;i++ )
 {
  flag=0;
 for(int j=2;j<i;j++)
 {
 if(i % j == 0)
 flag++;
 }
 }
 if(flag!=0)
 System.out.println("yes");
 else
 System.out.println("no");
 }

}
