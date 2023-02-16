package atividade2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
float precoporlitro,preco_pago,quantidadelitros; //Variáveis declaradas
precoporlitro=0;preco_pago=0;quantidadelitros=0; 

System.out.println("Digite o valor do litro de gasolina: \n");
precoporlitro=input.nextFloat();
System.out.println("Digite o valor pago: \n");
preco_pago=input.nextFloat();
quantidadelitros=preco_pago/precoporlitro;
System.out.println("Você abasteceu: "+quantidadelitros+" litro(s) de gasolina.");//ATIVIDADE  FINALIZA , done by Manoel Suede
	}

}
