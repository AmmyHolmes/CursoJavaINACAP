Proceso ej_8
	Definir i,num como enteros;
	Escribir "ingrese 10 numeros pares ";
	i <- 1;
	Mientras i<=10 Hacer
		Escribir "ingrese el num",i;
		Leer num;
		Si num%2<>0  Entonces
			i <- i+1;
		SiNo
			Escribir "no es un numero impar,reingrese el num";
		FinSi
	FinMientras
	Escribir "completaste los 10 num impares";
FinProceso
