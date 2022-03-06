package Semana1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;





public class Signos2 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		String fecha;
		System.out.println("Ingrese fecha en formato dd/mm");
		fecha=sc.next();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM");
		Date s = formato.parse(fecha);
		Date a = formato.parse("20/03");
		Date b = formato.parse("21/04");
		Date c = formato.parse("22/05");
		Date d = formato.parse("22/06");
		Date e = formato.parse("22/07");
		Date f = formato.parse("22/08");
		Date g = formato.parse("22/09");
		Date h = formato.parse("22/10");
		Date i = formato.parse("22/11");
		Date j = formato.parse("21/12");
		Date k = formato.parse("20/01");
		Date l = formato.parse("18/02");
		Date m = formato.parse("20/03");
	
		
		if(s.compareTo(a)>0 && s.compareTo(b)<0) {
			System.out.println("Tu signo eres Aries");
		}else if(s.compareTo(b)>=0 && s.compareTo(c)<0) {
			System.out.println("Tu signo es Tauro");
		}else if(s.compareTo(c)>=0 && s.compareTo(d)<0) {
			System.out.println("Tu signo es Géminis");
		}else if(s.compareTo(d)>=0 && s.compareTo(e)<0) {
			System.out.println("Tu signo es Cancer");
		}else if(s.compareTo(e)>0 && s.compareTo(f)<=0) {
			System.out.println("Tu signo es Leo");
		}else if(s.compareTo(f)>0 && s.compareTo(g)<0) {
			System.out.println("Tu signo es Virgo");
		}else if(s.compareTo(g)>0 && s.compareTo(h)<0) {
			System.out.println("Tu signo es Libra");
		}else if(s.compareTo(h)>0 && s.compareTo(i)<0) {
			System.out.println("Tu signo es Escorpio");
		}else if(s.compareTo(i)>0 && s.compareTo(j)<0) {
			System.out.println("Tu signo es Sagitario");
		}else if(s.compareTo(j)>0 && s.compareTo(k)<0) {
			System.out.println("Tu signo es Capricornio");
		}else if(s.compareTo(k)>0 && s.compareTo(k)<=0) {
			System.out.println("Tu signo es Piscis");
		}else if(s.compareTo(l)>0 && s.compareTo(m)<=0) {
				System.out.println("Tu signo es Acuario");
			
		}else {
				System.out.println("Tu signo es Piscis");
			}
		System.out.println("su fecha de nacimiento es:"+fecha);
		}	
	}


