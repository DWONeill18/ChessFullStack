function updateGame() {

    let body = {};
    let id = document.getElementById("Game_id").value;
    body.white = document.getElementById("White").value;
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