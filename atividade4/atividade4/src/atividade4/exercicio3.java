package atividade4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int unidades;
		float preco_un,preco_pag;
		
		System.out.println("Digite um número de unidades vendidas: ");//done by Manoel Suede
		unidades=input.nextInt();
		System.out.println("Digite o preço unitário: ");//done by Manoel Suede
		preco_un=input.nextFloat();
		
		if(unidades<=10){
			preco_pag=(unidades*preco_un);
			System.out.println("Valor total da compra: R$"+preco_pag);//done by Manoel Suede			
			
		}else {
			if((unidades>10)&&(unidades<=20)){
				preco_pag=((unidades*preco_un)-(unidades*preco_un*10/100));				
				System.out.println("Por ter comprado "+unidades+(" unidades esse cliente ganhou 10% de desconto.\n"));
				System.out.println("Valor total da compra: R$ "+preco_pag);//done by Manoel Suede
			}else {
				if((unidades>20)&&(unidades<=50)){
					preco_pag=((unidades*preco_un)-(unidades*preco_un*20/100));				
					System.out.println("Por ter comprado "+unidades+(" unidades esse cliente ganhou 20% de desconto.\n"));
					System.out.println("Valor total da compra: R$ "+preco_pag);//done by Manoel Suede
				}else {
					preco_pag=((unidades*preco_un)-(unidades*preco_un*30/100));				
					System.out.println("Por ter comprado "+unidades+(" unidades esse cliente ganhou 30% de desconto.\n"));
					System.out.println("Valor total da compra: R$ "+preco_pag);//done by Manoel Suede
					
				}
				
			}
		}
		
	}

}
