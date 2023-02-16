package atividade2;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int h,m,s;
		System.out.println("Digite o valor em segundos: \n");
		s=input.nextInt();
		h=(s/3600);m=(s/60);
		System.out.println("Temos: "+h+"h\nEsse mesmo tempo é o equivalente a: "+m+" Minutos");//Manoel Suede
	}

}
