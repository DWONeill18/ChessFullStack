
let id;
let white = "";
let black = "";
let result = "";
let eco = "";
let notation = "";

const setGameId = (number) => id = number.value;
const setWhite = (whiteText) => white = whiteText.value;
const setBlack = (blackText) => black = blackText.value;
const setResult = (resultText) => result = resultText.value;
const setEco = (ecoText) => eco = ecoText.value;
const setNotation = (notationText) => notation = notationText.value;

function findGame() {
    fetchData("GET", null, "games/" + id).then((value) => {
        sessionStorage.setItem("userData", value);
        let body = JSON.parse(value);
        document.getElementById("White").value = body.white;
        document.getElementById("Black").value = body.black;
        document.getElementById("Result").value = body.result;
        document.getElementById("Eco").value =  body.eco;
        document.getElementById("Notation").value = body.notation;
    }).catch((err) => {
        console.log('rejected. reason:', err)
    });
    console.log('after promise');

}

function updateGame() {
    let body = JSON.parse(sessionStorage.getItem("userData"));
    if (white !== "") {
        body.white = white
    }
    if (black !== "") {
        body.black = black
    }
    if (result !== "") {
        body.result = result
    }
    if (eco !== "") {
        body.eco = eco
    }
    if (notation !== "") {
        body.notation = notation
    }

    let json = JSON.stringify(body);

    fetchData("PUT", json, "games/" + id).then(() => {
        document.getElementById("updateMessage").innerHTML = "Success!!";
        setTimeout(() => {document.getElementById("updateMessage").innerHTML = " ";}, 5000);
})
            .catch ((err) => {
    console.log('rejected. reason:', err)
});
console.log('after promise');
console.log("record updated");

    }
