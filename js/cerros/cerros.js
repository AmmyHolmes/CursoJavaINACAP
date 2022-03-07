//Tienes un array de 1,0,-1. El 1 representa ascenso de 100 metros, el -1 descenso 
//de 100 metros, el 0 es que estás en planicie. Debes contar el número de cerros.
// Un cerro se cuenta si tienes un ascenso de 200m o más y a la vez, luego de su cumbre, baja 
//al menos 200m

let digitos=new Array();


digitos.push(1,1,1,-1,-1,0,0,-1,1,1,-1,0,-1,0,1,1,-1,1,-1);
var subida=0;
var bajada=0;
var cerros=0;
digitos.forEach(num => {
    
    if(num==1){
        subida=subida+100;
       
    }else if(num ==0){
        altura=altura;
    }else if(num == (-1)){
        bajada= bajada + 100;
        if(subida>=200 && bajada == 200){
            cerros ++;
            subida=subida-bajada;
            bajada=0;
        }
        
        
    }
});
document.write('<br><br> cerros totales: '+cerros+'<br><br>');



