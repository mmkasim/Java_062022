package projetoatividade3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int numero1,numero2, soma; numero1=0;numero2=0;soma=0;
		
		//AQUI O USUÁRIO VAI INSERIR OS DADOS
		System.out.println("Digite o primeiro número: ");//done by Manoel Suede
		numero1=input.nextInt();
		System.out.println("Digite o segundonúmero: ");//done by Manoel Suede
		numero2=input.nextInt();
		// O SISTEMA JÁ RECEBEU OS DADOS DO USUÁRIO
		
		soma=(numero1+numero2); //AQUI FOI FEITA A SOMA DOS DOIS NÚMEROS
		
		
		if (soma>20){
			soma=(soma+8);
			
			System.out.println("O resualtado é: "+soma);	
		}else {
		soma=(soma-5);
				
		System.out.println("O resualtado é: "+soma);
		}//done by Manoel Suede
		
	}

}




























//done by Manoel Suede