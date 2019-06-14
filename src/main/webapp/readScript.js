let gameData;

function getGame(){

let id = document.getElementById("Game_id").value; 

fetchData("GET", null, "games/" + id).then((value) => {
 let info = JSON.parse(value.responseText);
 console.log(info);

// fetchData("GET", null, "games/" + id).then((value) => {
//     gameData = value}).catch((err) => {
//        console.log('rejected. reason:', err)});
//    console.log('after promise');

let info = JSON.parse(gameData.responseText);

document.getElementById("Game_id").innerText = info;
document.getElementById("White").innerText = info;
document.getElementById("Black").innerText = info;
document.getElementById("Result").innerText = info;
}
}