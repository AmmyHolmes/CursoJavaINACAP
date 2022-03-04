Proceso sin_titulo
	Definir sueldo,i,opcion,sueldos,cantidad,menores,mayores como entero;
	opcion <- 0;
	sueldo <- 0;
	sueldos <- 0;
	cantidad <- 0;
	menores <- 0;
	mayores <- 0;
	Escribir "para ingresar sueldo presione 1";
	Escribir "si desea salir presione cualquier tecla";
	Leer opcion;
	Mientras opcion=1 Hacer
		Escribir "ingrese el sueldo";
		Leer sueldo;
		liquido <- sueldo*0.9;
		sueldos <- liquido+sueldos;
		cantidad <- cantidad+1;
		Escribir "***********************";
		Escribir "sueldo ingresado=",sueldo;
		Escribir "liquido del sueldo=",liquido;
		Si liquido<450000 Entonces
			menores <- menores+1;
		FinSi
		mayores <- cantidad-menores;
		Escribir "cantidad de liquidos menores a 450 mil:",menores;
		Escribir "cantidad de liquidos mayores a 450 mil:",mayores;
		Escribir "cantidad sumada=",cantidad;
		Escribir "total de sueldos liquidos=",sueldos;
		Escribir "*************************";
		Escribir "para salir presione cualquier tecla";
		Escribir "para nuevo sueldo presione 1";
		Si opcion=1 Entonces
			Leer opcion;
		SiNo
			Leer opcion;
			Escribir "adios!";
		FinSi
	FinMientras
FinProceso
