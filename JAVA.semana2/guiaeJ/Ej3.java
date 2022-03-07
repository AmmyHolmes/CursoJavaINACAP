package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej3 {
//*************************************
	public static void main(String[] args) {
		System.out.println("ingrese num inicial");
		Scanner sc = new Scanner(System.in);
	   int ini = sc.nextInt();
		System.out.println("ingrese num final");
       int fin = sc.nextInt();
       int suma = 0;
       int ini2 = ini +1;
       
       while(ini2 < fin) {
    	   suma = suma +ini2;
    	   ini2++;
       }System.out.println(suma);

	}

}
