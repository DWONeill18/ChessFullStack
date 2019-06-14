let gameData;

function getGame(){

let id = document.getElementById("Game_id").value; 

fetchData("GET", null, "games/" + id).then((value) => {
 let gameData = JSON.parse(value.responseText);}).catch((err) => {
    console.log('rejected. reason:', err)});
console.log('after promise');

document.getElementById("Game_id").innerText = value;
document.getElementById("White").innerText = value;
document.getElementById("Black").innerText = value;
document.getElementById("Result").innerText = value;

}