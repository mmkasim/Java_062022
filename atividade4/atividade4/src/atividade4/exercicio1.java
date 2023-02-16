package atividade4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int v1,v2,v3; v1=0;v2=0;v3=0;
		System.out.println("Digite o primeiro valor: ");//done by Manoel Suede
		v1=input.nextInt();
		System.out.println("Digite o segundo valor: ");//done by Manoel Suede
		v2=input.nextInt();
		System.out.println("Digite o terceiro valor: ");//done by Manoel Suede
		v3=input.nextInt();
		
		
		if ((v1>0)&&(v2>0)&&(v3>0)){ //esse é o "IF GLOBAL" que testa se é ou não possivel formar um triângulo
			System.out.println("Baseado nos número digitados, é possível se formar um triângulo.\n");
			
			if ((v1==v2)&&(v2==v3)){
				System.out.println("Temos um triângulo equilátero, pois os três valores são iguais.\n");
				
			}else {
				if ((v1==v2)||(v2==v3)||(v1==v3)){
					System.out.println("Temos um triângulo isósceles, pois dois lados têm medidas iguais.\n");
				}else {
					System.out.println("Temos um triângulo escaleno, pois os três lados têm medidas diferentes.\n");
				}
				
			}
			
			
			
			
			
			
		}else {
			System.out.println("Impossível formar um triângulo, pois um dos valores é negativo ou nulo. \n\nPara formar um triângulo você deve inserir valores inteiros maiores que 0(zero).");
		}//done by Manoel Suede
		
	}

}
