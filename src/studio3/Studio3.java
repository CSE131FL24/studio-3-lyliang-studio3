package studio3;
import java.util.Scanner;
public class Studio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=38;
		boolean[] prime = new boolean[n];
		//int counter=0;
		
		for(int k = 0; k<n ; k++)
			prime[k]=true;
			
		for(int i = 2; i< Math.sqrt((double)n) ; i++)
			for(int j = i;j*i< n ; j++) {
				prime[i*j-2]=false;
				
			}
		for(int k = 0; k<n ; k++)
			
			System.out.println(prime[k] +" "+(k+2));
		
	}

}
