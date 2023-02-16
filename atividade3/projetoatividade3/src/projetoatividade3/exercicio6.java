package projetoatividade3;

import java.util.Scanner;

public class exercicio6 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			
			float peso,altura,imc;			
			System.out.println("Digite o peso: ");//done by Manoel Suede
			peso=input.nextFloat();
			System.out.println("Digite a altura: ");//done by Manoel Suede
			altura=input.nextFloat();
			imc=peso/(altura*altura);
			System.out.println("O Índice de mássa corpórea desse indivíduo é: "+imc+" \nLogo, isso significa que esse indivíduo está ");
			if (imc<20){
				System.out.println(" abaixo do peso.");	
			}else {
				if ((imc==20)&&(imc<=25)){
				System.out.println(" com peso normal.");	
			}else {
				if ((imc>25)&&(imc<=30)) {
					System.out.println("com sobre peso");
					
				}else {
					if ((imc>30)&&(imc<=40)) {
						System.out.println(" obeso");						
					}else {
						System.out.println(" obesidade mórbida");
					}
				}
				
				}
			
			}
			
			}   //done by Manoel Suede
			
		}

	