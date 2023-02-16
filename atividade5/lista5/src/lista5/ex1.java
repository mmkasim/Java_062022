package lista5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 1;
		double y=1;	
		while (y!=0)		{		
			System.out.println("Digite um valor: ");
			y=input.nextInt();
			
		if (y!=0) {		
		if (y%2==0) {			
			y = Math.sqrt ( y );
			System.out.println("A raiz desse número é: \n"+y);	
			
		} else {
			y=y*y;
			System.out.println("O quadrado desse número é: \n"+y);
			
		}		
		}else {
			System.out.println("\n Você digigou 0 (zero), \nScript finalizado! \n");
			y=0;
		}
	
		}
		
		}
		
	}


