let gameData;

function getGame(){

let id = document.getElementById("Game_id").value; 

fetchData("GET", null, "games/" + id).then((value) => {
    info = JSON.parse(value)
    document.getElementById("Game_id").innerText = info.game_id;
    document.getElementById("White").innerText = info.white;
    document.getElementById("Black").innerText = info.black;
    document.getElementById("Result").innerText = info.result;
}).catch((err) => {
       console.log('rejected. reason:', err)});
   console.log('after promise');


}
