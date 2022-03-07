var total = 0;

document.getElementById("op1").addEventListener("click", function() { total = total + 7000 });
document.getElementById("op2").addEventListener("change", function() { total = total + 5000 });

function todo() {
    let pagar = total + total * 0.19;
    alert(`El precio es  ${total} mas iva,el total sería ${pagar}`);
}
/*https://es.stackoverflow.com/questions/145220/obtener-datos-de-un-formulario-y-almacenarlos-en-variables */