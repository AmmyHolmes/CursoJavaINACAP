package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej9 {
//*****************************************************************************************
	public static void main(String[] args) {
	
		int opcion = 0;
		do {
			System.out.println("Calculo de area geometrica,\n"
					+ "seleccione la figura a calcular:");
			System.out.println("1.-Circulo \n"
					+ "2.-Cuadrado \n"
					+ "3.-Triangulo \n"
					+ "4.- Rectangulo");
			int med=0;
			double area=0;
			double alt = 0;
			Scanner sc = new Scanner(System.in);
			 opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese el radio");
				med = sc.nextInt();
				area = med * (Math.PI);
				System.out.println("El area es :"+area);
				break;
			case 2:
				System.out.println("Ingrese medida del lado");
				med =sc.nextInt();
				area = med*med;
				System.out.println("El area es :"+area);

				break;
			case 3:
				System.out.println("Ingrese base");
				med = sc.nextInt();
				System.out.println("Ingrese altura");
				alt = sc.nextInt();
				area= (med*alt)/2;
				System.out.println("El area es :"+area);

				break;
			case 4:
				System.out.println("Ingrese la base");
				med = sc.nextInt();
				System.out.println("Ingrese la altura");
				alt = sc.nextDouble();
				area = med*alt/2;
				System.out.println("El area es :"+area);

				break;
			default:
				System.out.println("opcion incorrecta");
			}
			
			}while(opcion != 5);
			
		}
	
		
	}


