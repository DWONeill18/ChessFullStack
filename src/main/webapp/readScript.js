let gameData;

function getGame(){

let id = document.getElementById("Game_id").value; 

fetchData("GET", null, "games/" + id).then((value) => {
    info = JSON.parse(value)
    document.getElementById("Game_id").value = info.game_id;
    document.getElementById("White").value = info.white;
    document.getElementById("Black").value = info.black;
    document.getElementById("Result").value = info.result;
    document.getElementById("Eco").value = info.eco;
    document.getElementById("Notation").value = info.notation;     
}).catch((err) => {
       console.log('rejected. reason:', err)});
   console.log('after promise');


}
