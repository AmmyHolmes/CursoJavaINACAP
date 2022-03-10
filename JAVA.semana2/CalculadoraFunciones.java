package Semana2;

import java.util.Scanner;

public class CalculadoraFunciones {

	public static void main(String[] args) {
	
		int opcion;
		do {
			System.out.println("*********calculadora**********");
			System.out.println("Para sumar presione:1 \n"
					+ "Para restar presione:2 \n"
					+ "Para multiplicar presione:3 \n"
					+ "Para dividir presione:4 \n");
			Scanner sc = new Scanner(System.in);
			 opcion = sc.nextInt();
			System.out.println("Ingrese el num1:");
			int num1=sc.nextInt();
			System.out.println("Ingrese el num2:");
			int num2=sc.nextInt();
			
			switch(opcion) {
				case 1:
					suma(num1,num2);
					break;
				case 2:
					resta(num1,num2);
					break;
				case 3:
					multiplicacion(num1,num2);
					break;
				case 4:
					division(num1,num2);
					break;
				default:
					System.out.println("opcion invalida");
					
			}
		}while(opcion != 0);
	}
	
	public static void suma(int num1,int num2) {
		int total=0;
		total=num1+num2;
		System.out.println("resultado es:"+total);
	}
	public static void resta(int num1,int num2) {
		int total=num1-num2;
		System.out.println("resultado es:"+total);

		}
	public static void multiplicacion(int num1,int num2) {
		int total=num1*num2;
		System.out.println("resultado es:"+total);

	}
	public static void division(int num1,int num2) {
		int total = 0;
		if(num2!=0) {
			total=num1/num2;
		}else {
			System.out.println("no se puede dividir por 0");
		}
	
		System.out.println("resultado es:"+total);

	}

}
