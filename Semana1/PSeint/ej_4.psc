Proceso ej4
	Definir num1,num2,numi,numf,total como entero;
	Escribir "Ingrese el primer num";
	Leer num1;
	Escribir "Ingrese el segundo num";
	Leer num2;
	numi <- num1+1;
	numf <- num2-1;
	total <- 0;
	Mientras numi<=numf Hacer
		Si numi%2=0 Entonces
			total <- total+numi;
			numi <- numi+1;
		SiNo
			numi <- numi+1;
		FinSi
	FinMientras
	Escribir "la suma del rango es:",total;
FinProceso
