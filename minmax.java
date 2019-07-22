import java.util.*;
class minmax
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int d[]=new int[n];
       for(int i=0;i<n;i++)
       {
           d[i]=sc.nextInt();
       }
       Arrays.sort(d);
        System.out.print(d[0]+" "+d[d.length-1]);
    }
}
