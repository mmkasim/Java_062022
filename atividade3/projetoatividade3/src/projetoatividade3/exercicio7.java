package projetoatividade3;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int idade; idade=0;
		System.out.println("Digite a idade: ");//done by Manoel Suede
		idade=input.nextInt();
		
		
		if (idade<18){
			System.out.println("Essa pessoa é menor de idade.");	
		}else {
		if((idade>=18)&&(idade<65)) {
			System.out.println("Essa pessoa é maior de idade");
			
		}else {
			System.out.println("Essa pessoa é idosa");	
		}
		
		}//done by Manoel Suede
	
	}

}
