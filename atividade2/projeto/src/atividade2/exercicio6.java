package atividade2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,m,g,t;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Digite a quantidade de camisas vendidas no tamanho P: \n");
		p=input.nextInt();
		System.out.println("Digite a quantidade de camisas vendidas no tamanho M: \n");
		m=input.nextInt();
		System.out.println("Digite a quantidade de camisas vendidas no tamanho G: \n");
		g=input.nextInt();
		t=(p*10)+(m*12)+(g*15);
		System.out.println("O total arrecadado foi de: \nR$"+t);
		
	}

}
