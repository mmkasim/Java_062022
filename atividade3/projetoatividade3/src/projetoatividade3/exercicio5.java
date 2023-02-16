package projetoatividade3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int numero; numero=0;
		System.out.println("Digite um número: ");//done by Manoel Suede
		numero=input.nextInt();
		numero=numero%5;
		
		if (numero==0){
			System.out.println("O número digitado é divisível por 5.");	
		}else {
		
		System.out.println("O número digitado NÃO é divisível por 5.");
		}//done by Manoel Suede
		
	}

}
