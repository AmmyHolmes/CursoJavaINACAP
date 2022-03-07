package Semana2.guiaeJ;

import java.util.Scanner;

public class Ej4 {
//*****************************************************
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int suma = 0;
		System.out.println("Ingrese el primer num");
		int ini = sc.nextInt();
		System.out.println("Ingrese el segundo num");
        int fin = sc.nextInt();
        int ini2 = ini +1;
        while(ini2<fin) {
        	if(ini2 %2==0) {
        		suma = suma +ini2;
        	}
        	
        	ini2++;
        }
        System.out.println(suma);
	}

}
