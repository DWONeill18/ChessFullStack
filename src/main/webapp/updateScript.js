function updateGame() {

    let body = {};
    let id = document.getElementById("Game_id").value;

    
    if (document.getElementById("White").value !== null){
        body.white = document.getElementById("White").value;
    }
    else {
        
        fetchData("GET", null, "games/" + id).then((value) => {
            info = JSON.parse(value)        
            document.getElementById("White").value = info.white;

        });
    
    body.black = document.getElementById("Black").value;
    body.result = document.getElementById("Result").value;
    body.eco = document.getElementById("Eco").value;
    body.notation = document.getElementById("Notation").value;

    let json = JSON.stringify(body);

    fetchData("PUT", json, "games/" + id).then((
        document.getElementById("updateMessage").innerHTML = "Success!!"))
        .catch((err) => {
        console.log('rejected. reason:', err)
    });
    console.log('after promise');
    console.log("record updated");

}