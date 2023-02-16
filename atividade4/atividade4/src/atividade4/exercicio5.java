package atividade4;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int p,q;
		
		float total;
		System.out.println("Código		Produto			Preço(R$)"
				+ "\n  1	Refri Lata		2,20"
				+ "\n  2	Refri Garrafa		3,00"
				+ "\n  3	Suco			3,00"
				+ "\n  4	Sorv 1 Bola		2,00"
				+ "\n  5	Sorv 1 Bola+Cobertura	2,50"
				+ "\n  6	Sorv 2 Bolas		3,00"
				+ "\n  7	Sorv 2 Bola+Cobertura	3,50"
				+ "\n  8	Sundae			5,00"
				+ "\n  9	Banana split		6,00"
				+ "\n  10	Especial da casa	8,50"
				+ "\n\n Baseado na tabela acima, digite apenas o código: ");//done by Manoel Suede
		p=input.nextInt();
		
		if ((p!=1) && (p!=2) && (p!=3) && (p!=4) && (p!=5) && (p!=6) && (p!=7) && (p!=8) && (p!=9) && (p!=10)){
			System.out.println("Você digitou um código inválido!!!");
		}else {
			System.out.println("\nAgora digite a quantidade: ");
			q=input.nextInt();
		if(p==1) {
			total =(float) ( (2.2)*q);
			System.out.println("\nValor total da compra R$ "+total);
		}else {
			if(p==2) {
				total =(float) (3*q);
				System.out.println("\nValor total da compra R$ "+total);
			}else {
				if(p==3) {
					total =(float) (3*q);
					System.out.println("\nValor total da compra R$ "+total);
				}else {
					if(p==4) {
						total =(float) (2*q);
						System.out.println("\nValor total da compra R$ "+total);
					}else {
						if(p==5) {
							total =(float) ((2.5)*q);
							System.out.println("\nValor total da compra R$ "+total);
						}else {
							if(p==6) {
								total =(float) (3*q);
								System.out.println("\nValor total da compra R$ "+total);
							}else {
								if(p==7) {
									total =(float) ((3.5)*q);
									System.out.println("\nValor total da compra R$ "+total);
								}else {
									if(p==8) {
										total =(float) (5*q);
										System.out.println("\nValor total da compra R$ "+total);
									}else {
										if(p==9) {
											total =(float) (6*q);
											System.out.println("\nValor total da compra R$ "+total);
										}else {
											
												total =(float) ((8.5)*q);
												System.out.println("\nValor total da compra R$ "+total);
											} 
												
											
											
										}
										
									}
									
								}
							}
						}
						
					}
					
				}
				
			}
		}
	}
	}


