package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		int opcion=0 ;
		int suma = 0;
		int cantidad = 0;
		int menores = 0;
		int mayores = 0;
		int sueldo = 0;
		Scanner sc= new Scanner(System.in);
	 do {
		 System.out.println("Para otro sueldo escriba 1");
		 opcion = sc.nextInt();
		 System.out.println("Ingrese el sueldo");
		 sueldo = sc.nextInt();
		 suma = suma + sueldo;
		 cantidad ++;
		 if(sueldo<450000) {
			 menores++;
		 }else {
			 mayores ++;
		 }
		 System.out.println("cantidad:"+cantidad);
		 System.out.println("mayores:"+mayores);
		 System.out.println("menores:"+menores);
		 System.out.println("sueldos totales:"+suma);
			 
	 }
	 while(opcion ==1);
	

	}

}
