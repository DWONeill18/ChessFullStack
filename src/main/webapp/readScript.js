let gameData;

function getGame(){

let id = document.getElementById("Game_id").value; 

fetchData("GET", null, "games/" + id).then((value) => {
 gameData=value}).catch((err) => {
    console.log('rejected. reason:', err)});
console.log('after promise');
}