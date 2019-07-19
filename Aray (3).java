import java.util.*;
class Aray{ 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int l=ar.length;
        int s=l/2;
        System.out.print(ar[s]);
    } 
} 
