package Semana2;

import java.util.Scanner;

public class EjMatrizDiagonales {

	public static void main(String[] args) {
	

		System.out.println("*********************diagonal**************************");
		diagonal();
		System.out.println("*********************inversa**************************");
		inversa();

	}
	
	public static void inversa() {
		int ma2[][] = new int[6][6];
		for(int linea=0;linea<6;linea++) {
			for(int co = 5;co>=0;co--) {
				if(linea==co) {
					ma2[linea][co]=1;
				}
				System.out.print(ma2[linea][co]);
			}System.out.println();
		}
	}
	public static void diagonal() {
		int largoFila=6;
		int largoColumna=6;
        int ma[][]  = new int[largoFila][largoColumna]; 
        
        for(int fila=0;fila<largoFila;fila++) {
        	for(int colum =0;colum<largoColumna;colum++) {
        		if(fila == colum) {
        			ma[fila][colum]=1;
        		}System.out.print(ma[fila][colum]);
        	}System.out.println();
        }
		
		
		
		
	
	}

}
