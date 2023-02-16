package lista5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y=1999;
		while (y>1000) {
			if (y%11==5) {
				System.out.println(y);
				y--;
			}else {
				y--;
			}
			
		}
	}

}
