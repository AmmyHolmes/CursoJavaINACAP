package Semana2.guiaeJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej8 {
//********************************************************
	public static void main(String[] args) {

		System.out.println("Ingrese 10 num impares");
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int in = 0;
		ArrayList <Integer> lista = new ArrayList<Integer>();
		while(num <=10) {
			System.out.println("Ingrese el numero "+ num);
			in = sc.nextInt();
			if(in %2!=0) {
				lista.add(in);
				num ++;
			}else {
				System.out.println("ese es un numero \n"
						+ "par,ingrese un numero impar");
			}
		}
		System.out.println("num ingresados: "+lista);
	
	}

}
