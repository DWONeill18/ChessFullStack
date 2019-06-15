function updateGame() {

    let id = document.getElementById("Game_id").value;

    fetchData("PUT", null, "games/" + id).then((
        document.getElementById("updateMessage").innerHTML = "Success!!"))
        .catch((err) => {
        console.log('rejected. reason:', err)
    });
    console.log('after promise');
    console.log("record updated");

}