package Semana2;

import java.util.Scanner;

public class MenuAritmetica {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.-suma");
			System.out.println("2.-restar");
			System.out.println("3.-dividir");
			System.out.println("4.-multiplicar");
			System.out.println("5.-salir");
			System.out.println("Ingrese la opcion");
			opcion = sc.nextInt();
			System.out.println("Ingrese el primer num");
			int num1 = sc.nextInt();
			System.out.println("Ingrese el segundo num");
            int num2 = sc.nextInt();
            
			switch(opcion) {
			case 1:
				int total = num1+num2;
				System.out.println("el total es: "+total);
			break;
			case 2:
				int totalR = num1-num2;
				System.out.println("el total es: "+totalR);
				break;
			case 3:
					if(num2 ==0) {
						System.out.println("no se puede dividir por 0");
					}else {
					int totalD = num1/num2;
					System.out.println("La parte entera de la division es: "+totalD);
					}
				break;
			case 4:
				int totalM = num1*num2;
				System.out.println("el total es: "+ totalM);
				break;
			case 5:
				System.out.println("byee");
				break;
		    default:
		    	System.out.println("opcion invalida");
			}
			
			
		}
		while(opcion !=5);

	}

}
