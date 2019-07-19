import java.util.*;
import java.io.*;
class arguu
{
    public static void main(String a[])
    {
        int n=0;
        for(int i=0;i<a.length;i++)
        {
             Arrays.sort(a);
             n=a.length-1;
        }
        System.out.println(a[n]);
       
    }
}
