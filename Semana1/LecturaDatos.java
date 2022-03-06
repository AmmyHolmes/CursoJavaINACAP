package Semana1;

import java.util.Scanner;

public class LecturaDatos {

	public static void main(String[] args) {

		double radio,area;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el radio");
		radio= leer.nextInt();
		area= (Math.pow(radio, 2))*Math.PI ;
		System.out.println("el área es: "+area);
	}

}
