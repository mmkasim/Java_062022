package projetoatividade3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int numero; numero=0;
		System.out.println("Digite um número: ");//done by Manoel Suede
		numero=input.nextInt();
		numero=numero%3;
		
		if (numero==0){
			System.out.println("O número digitado é múltiplo de 3.");	
		}else {
		
		System.out.println("O número digitado NÃO é múltiplo de 3.");
		}//done by Manoel Suede
		
	}

}
