package lista5;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y=0;
		System.out.println("Digite um valor: ");
		y=input.nextInt();
		while (y!=0) {
			if (y%2!=0) {
				System.out.println(y);
				y--;
			}else {
				y--;
			}
			
			
			
		}
		
	}

}
