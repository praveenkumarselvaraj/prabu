import java.util.*;
class Aray{ 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt(); 
        int awr[]=new int[n];
        for(int i=0;i<n1;i++)
        {
            awr[i]=sc.nextInt();
        }
        Arrays.sort(awr);
        for(int i=0;i<n1;i++)
        {
        System.out.print(awr[i]+" ");
        }
    } 
} 
