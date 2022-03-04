Proceso ej3
	Definir numi,numf,total como entero;
	total <- 0;
	Escribir "Ingrese num inicial";
	Leer numi;
	Escribir "Ingrese num final";
	Leer numf;
	numI <- numi+1;
	numF <- numf-1;
	Mientras numI<=numF Hacer
		total <- total+numi;
		numi <- numi+1;
	FinMientras
	Escribir "La suma total es :",total;
FinProceso
