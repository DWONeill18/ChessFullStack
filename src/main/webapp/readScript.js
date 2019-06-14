function fetchData(method, textbody, url) {
    return new Promise((resolve, reject) => {
        const req = new XMLHttpRequest();
        req.onreadystatechange = () => {

            if (req.readyState === 4) {

                if (req.status >= 200 && req.status < 300) {           
                    resolve(req.responseText);                  
                }
                else {
                    reject("something went wrong");
                }
            }
        };
        req.open(method, "http://35.242.174.17:8080/ChessDatabaseAPI-1.0/api/" + url);
        req.setRequestHeader("content-type", "application/json");
        req.send(textbody);
    });
}

console.log('before promise');

let gameData;

function getGame(){
fetchData("GET", document.getElementById=("Game_id").value, "games").then((value) => {
 gameData=value}).catch((err) => {
    console.log('rejected. reason:', err)});
console.log('after promise');
}

