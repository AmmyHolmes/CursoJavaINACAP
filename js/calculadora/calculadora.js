/*function suma(){

}
let uno,dos,tres,resultado;
uno=1;
dos=2;
tres=3;
resultado=0;
document.getElementById("resultado").innerHTML=resultado;
document.getElementById("1").innerHTML=uno;
document.getElementById("2").innerHTML=dos;
document.getElementById("3").innerHTML=tres;
document.getElementById("suma").innerHTML=suma;
document.getElementById("resultado").innerHTML=resultado;
onclick='document.getElementById("resultado").innerHTML = ""'*/

const mostrarValorAnterior = document.getElementById('anterior');
const mostrarValorPosterior = document.getElementById('posterior');
const botonesNumeros = document.querySelectorAll('numero');
const botonesOperador = document.querySelectorAll('operador');



const calculadora = new Calculadora();
class Calculadora{
    sumar(num1,num2){
        return num1+num2;
    }
    sumar(num1,num2){
        return num1-num2;
    }
}

console.log(calculadora.sumar(2,3));