package Semana1;

import java.util.Scanner;

public class HolaMundoLenguajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la opción"
				+ " de idioma preferido=\n"
				+ "-1: español \n"
				+ "-2: Inglés \n"
				+ "-3: Francés \n");
		int opcion=s.nextInt();
		if(opcion==1) {
			System.out.println("Hola mundo!");
		}else if(opcion==2) {
			System.out.println("hello world!");
		}else if(opcion==3) {
			System.out.println("salut monde!");
		}else {
			System.out.println("Ingresó una opción invalida");
		}
	}

}
