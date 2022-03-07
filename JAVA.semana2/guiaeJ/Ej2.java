package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero");
		int numero =sc.nextInt();
		int suma= 0;
		int total = numero + 100;
		while(numero<=total) {
			suma = suma + numero;
			numero ++;
		}
		System.out.println(suma);
		
	}

}
