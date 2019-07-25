import java.util.*;
public class small {
	public static void main(String[] args) {
		int n;
		Scanner	sc = new Scanner(System.in);		
	    n = sc.nextInt();
	    int s = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
		    a[i] = sc.nextInt();
	    }
	   Arrays.sort(a); 
	  System.out.println(a[s-1]);
	}}
