package atividade4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float a,b,c,area; a=0;b=0;c=0;area=0;
		System.out.println("\nVamos formar um trapézio\n");//done by Manoel Suede
		System.out.println("Digite o valor da primeira base: ");//done by Manoel Suede
		a=input.nextFloat();
		System.out.println("Digite o valor da segunda base: ");//done by Manoel Suede
		b=input.nextFloat();
		System.out.println("Digite o valor da altura: ");//done by Manoel Suede
		c=input.nextFloat();
		
		if ((a<=0)||(b<=0)||(c<=0)){
			System.out.println("Impossível formar um trapézio, pois um ou mais valores é nulo ou negativo");//done by Manoel Suede
		}else {
			if(a==b) {
				System.out.println("Impossível formar um trapézio, pois na formação de um trapézio os valores das bases, obrigatoriamente, são diferentes.");//done by Manoel Suede
			}else {
				area=(((a+b)*c)/2);
				System.out.println("A área total desse trapézio é: "+area);//done by Manoel Suede
			}
		}
		

		//done by Manoel Suede
		
	}

}
