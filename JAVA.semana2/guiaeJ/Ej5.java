package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej5 {
//**************************************************
	public static void main(String[] args) {

		System.out.println("Ingrese 10 num");
		int inp = 1;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		while(inp <=10) {
			System.out.println("ingrese el numero "+inp);
			int num = sc.nextInt();
			if(num %2 !=0) {
				suma = suma + num;
			}
			inp++;
		}
		System.out.println(suma);
	}

}
