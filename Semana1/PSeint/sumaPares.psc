Proceso sin_titulo
	Definir ni,nf,pares como entero;
	Escribir "Ingrese numero inicial";
	Leer ni;
	cont <- ni;
	pares <- 0;
	Escribir "ingrese numero final";
	Leer nf;
	Mientras cont <= nf Hacer
		detector <- cont%2;
		Si detector ==0 Entonces
			pares <- pares + cont;
		FinSi
		cont <- cont +1;
	FinMientras
	Escribir "la suma de los pares del rango es : ",pares;
FinProceso
