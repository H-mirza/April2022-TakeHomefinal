package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		
		System.out.println("give me Nth smallest number");
		
		Scanner ui = new Scanner(System.in);
		int Nth = ui.nextInt();
		
		int[] A = new int[500];
		Random rn = new Random();
		
		for (int i = 0; i < 500; i++) {
			
			A[i] = rn.nextInt(500);
			
			System.out.print(A[i] + " ");
			
		}
		
		Arrays.sort(A);
			System.out.println();
		
		for(int i=0; i<A.length;i++) {
			System.out.print((A[i]+" "));
			
			}
		
		System.out.println();
		System.out.println("smallest number" + A[Nth-1]);
	}

}
