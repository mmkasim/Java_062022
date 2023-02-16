package atividade2;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float nota1,nota2,nota3,media;
		nota1=0;nota2=0;nota3=0;media=0;
		System.out.println("Digite o valor da primeira nota: \n");
		nota1=input.nextFloat();
		System.out.println("Digite o valor da segunda nota: \n");
		nota2=input.nextFloat();
		System.out.println("Digite o valor da terceira nota: \n");
		nota3=input.nextFloat();
		media=(nota1+nota2+nota3)/3;
		System.out.println("A media deste aluno é: "+media);
		
	}

}
