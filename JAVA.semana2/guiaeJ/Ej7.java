package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej7 {
//******************************************************+
	public static void main(String[] args) {

		System.out.println("Ingrese el numero a factorizar");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ini =1;
		int total = 1;
		while(ini <= num) {
			total =ini * total;
			ini++;
		}
		System.out.println(total);
		
	}

}
