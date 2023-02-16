package atividade2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float custodefabrica,custoaoconsumidor;
		custoaoconsumidor=0;custodefabrica=0;
		System.out.println("Digite o custo de fábrica do carro: \n");
		custodefabrica=input.nextFloat();
		
		custoaoconsumidor=((custodefabrica*73/100)+custodefabrica);
		System.out.println("O custo total desse veículo ao consumidor será de R$: "+custoaoconsumidor);

	}

}
