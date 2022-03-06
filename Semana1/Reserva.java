package Semana1;

import java.util.Scanner;

public class Reserva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int entradas = 0;
		int totales =0 ;
		int precio = 25000;
		int max = 30;
		System.out.println("Sistema de ventas de entradas,\n"
				+ "la entrada tiene un valor de:$25000,\n"
				
				);
		   while(entradas <= max) {
			
			 System.out.println("ingrese num entradas"
			 		+ " a comprar:");
			 entradas = sc.nextInt();
			 totales = totales + entradas;
			 int restantes = max - totales;
			 System.out.println("Usted està comprando "+ entradas +" entradas");
			 System.out.println("El total a pagar es :"+precio * entradas);
			 System.out.println("Disponibles: "+ restantes);
			 System.out.println("Totales vendidas: "+ totales);
             if(restantes < entradas) {
            	 System.out.println("Entradas agotadas, solo puede comprar :"+
             restantes);
             }
			 
		
		}
		
		
	}

}
