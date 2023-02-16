package lista5;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y,z;z=0;
		float media;
		y=1;
		x=0;
		while (y!=0) {		
		System.out.println("Digite a idade: ");
		y=input.nextInt();			
		x++;		
		z=z+y;
		}
		x--;
		media=z/x;
		System.out.println("A média das idades digitadas é: "+media);
		
		
	}

}
