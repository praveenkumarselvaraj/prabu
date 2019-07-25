import java.util.Scanner;
public class revv{
	public static void main(String[] args) {
		//int n;
		Scanner	sc = new Scanner(System.in);		
	    int n = sc.nextInt();
		int r=0;
		while(n!=0){
			r = n % 10;
			System.out.print(r);

			n = n / 10;
}
		}
}
