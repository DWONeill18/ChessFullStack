let gameData;

function getGame(id){
fetchData("GET", null, "games/" + id).then((value) => {
 gameData=value}).catch((err) => {
    console.log('rejected. reason:', err)});
console.log('after promise');
}