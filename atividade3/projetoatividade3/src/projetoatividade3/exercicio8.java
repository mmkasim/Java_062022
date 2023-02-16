package projetoatividade3;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int idade; idade=0;
		System.out.println("Digite a idade: ");//done by Manoel Suede
		idade=input.nextInt();
		
		
		if (idade<16){
			System.out.println("Não eleitor(a)");	
		}else {
		if((idade>=18)&&(idade<65)) {
			System.out.println("Eleitor(a) obrigatório");
			
		}else {
			if((idade>=16)&&(idade<18)) {
				System.out.println("Eleitor(a) facultativo");
			}else {
				System.out.println("Eleitor(a) facultativo");
			}
		}
		
		}//done by Manoel Suede
	
	}

}
