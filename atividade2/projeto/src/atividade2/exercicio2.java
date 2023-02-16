package atividade2;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 

		int valordoquilo;float pesodopratocheio,totalapagar;
		valordoquilo=12;pesodopratocheio=0;totalapagar=0;

		
		System.out.println("Digite o peso do seu prato em KG: \n");
		pesodopratocheio=input.nextFloat();
		totalapagar=pesodopratocheio*12;
		System.out.println("Total a pagar: R$"+totalapagar);//ATIVIDADE  FINALIZA , done by Manoel Suede
	}

}
