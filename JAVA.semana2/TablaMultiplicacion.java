package Semana1;

import java.util.Scanner;

public class TablaMultiplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int resultado = 0;
		System.out.println("Ingrese la tabla numero:");
		int numero=sc.nextInt();
		while( i <=12) {
			resultado = numero*i;
			System.out.println(numero+" por "+i+"="+ resultado);
			i++;
		}

	}

}
