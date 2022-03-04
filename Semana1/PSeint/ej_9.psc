Proceso ej9
	Definir figura,area,base,altura como entero;
	Escribir "1=	Triangulo";
	Escribir "2=cuadrado";
	Escribir "3=rectangulo";
	Leer figura;
	Segun figura Hacer
		1:
			Escribir "calculo área triangulo";
			Escribir "ingrese base";
			Leer base;
			Escribir "ingrese altura";
			Leer altura;
			area <- (base*altura)/2;
		2:
			Escribir "calculo área de cuadrado";
			Escribir "ingrese lado del cuadrado";
			Leer base;
			area <- base*2;
		3:
			Escribir "calcular área rectangulo";
			Escribir "ingrese base";
			Leer base;
			Escribir "ingrese altura";
			Leer altura;
			area <- base*altura;
	FinSegun
	Escribir "el area es:",area;
FinProceso
