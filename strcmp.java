import java.util.Scanner;

public class strcmp {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int r=0;
		while(n1 != 0){
			r = n1 % 10;
			if(r % 2 != 0){
				System.out.print(r+" ");
			}
			n1 = n1 / 10;
		}
}
}	
