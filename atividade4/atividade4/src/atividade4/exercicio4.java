package atividade4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int salario,quantidadevendas,salariomaispremio;
		System.out.println("Digite o valor do salário: ");//done by Manoel Suede
		salario=input.nextInt();
		System.out.println("Digite a quantidade de vendas no mês: ");//done by Manoel Suede
		quantidadevendas=input.nextInt();
		
		if(quantidadevendas<=100){
			System.out.println("Esse vendedor não atingu a quantidade mínima de vendas para receber premiação, portanto receberá apenas o salário: R$"+salario);//done by Manoel Suede
		}else {
			if((quantidadevendas>100) && (quantidadevendas<=500)){
				salariomaispremio=salario+50;
				System.out.println("Salário fixo: "+salario+"\nTotal de vendas no mês: "+quantidadevendas+"\nValor a receber: R$"+salariomaispremio);	
			}else {
				if((quantidadevendas>500) && (quantidadevendas<=750)){
					salariomaispremio=salario+70;
					System.out.println("Salário fixo: "+salario+"\nTotal de vendas no mês: "+quantidadevendas+"\nValor a receber: R$"+salariomaispremio);	
				}else {
					salariomaispremio=salario+100;
					System.out.println("Salário fixo: "+salario+"\nTotal de vendas no mês: "+quantidadevendas+"\nValor a receber: R$"+salariomaispremio);
				}
			}
		}
	}

}
