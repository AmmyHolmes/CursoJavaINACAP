Proceso sin_titulo
	Definir i,num,total como entero;
	num <- 1;
	i <- 1;
	total <- 1;
	Mientras i<=10 Hacer
		Escribir "ingrese el numero:",i;
		Leer num;
		Escribir num;
		total <- total*num;
		i <- i+1;
	FinMientras
	Escribir total;
FinProceso
