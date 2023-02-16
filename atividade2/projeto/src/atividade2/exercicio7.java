package atividade2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int paes,broas;
		float totalarrecadado,totalapoupar;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Digite a quantidade de broas vendidas: \n");
		broas=input.nextInt();
		System.out.println("Digite a quantidade de pães vendidos: \n");
		paes=input.nextInt();
		totalarrecadado=(float) ((float) (paes*0.12)+(broas*1.5));
		totalapoupar=(totalarrecadado*10/100);
		System.out.println("O total arrecadado de todas as vendas é: R$"+totalarrecadado);
		System.out.println("\nO total a se guardar: R$"+totalapoupar);
		
	}

}
