function deleteGame(){

let id = document.getElementById("Game_id").value; 

fetchData("DELETE", null, "games/" + id).then((value) => {
    info = JSON.parse(value)}).catch((err) => {
       console.log('rejected. reason:', err)});
   console.log('after promise');

   console.log("ID deleted")

}