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
        System.out.print(ar[ar.length-1]);
    } 
} 
