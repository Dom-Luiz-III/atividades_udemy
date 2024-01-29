function gritar() {
    alert("AAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
}

function perguntar() {
    var nome;

    nome = prompt("Qual é o seu nome? ");
    alert("Olá " + nome);
}

function mudar_texto() {
    //Comando para pegar algum elemento do HTML e modificar ele
    var h1 = document.getElementsByTagName("h1");
    // Nessa função é chamado a lista 0 da tag h1 que tem no nosso código html

    // alert(h1[0].innerText);
    if (h1[0].innerText == "Geek University") {
        h1[0].innerText = "Evolua seu lado geek!";
    } else {
        h1[0].innerText = "Geek University";
    }

}

function inclementar() {
    //Comando para pegar elemento por ID
    var p1 = document.getElementById("p1");
    //Aqui o elemento é chamado por ID, que é um identificador único na qual só quem tiver ele será chamado por essa função.

    p1.innerText = parseInt(p1.innerText) + 1
}