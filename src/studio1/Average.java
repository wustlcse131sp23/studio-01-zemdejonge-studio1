package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of the two integers to be averaged?");
		int n1 = in.nextInt();
		System.out.println("The second of the two integers to be averaged?");
		int n2 = in.nextInt();
		System.out.println( (double) (n1 + n2) / 2);

	}

}
