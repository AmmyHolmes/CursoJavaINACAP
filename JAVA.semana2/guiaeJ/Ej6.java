package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej6 {
//******************************************************
	public static void main(String[] args) {

		int num = 1;
		int total=1;
		Scanner sc = new Scanner(System.in);
		while(num<=10) {
			System.out.println("Ingrese el num "+num);
			int mul = sc.nextInt();
			total = total * mul;
			num ++;
		}
		System.out.println(total);
		
		
		
	}
		
}
	

