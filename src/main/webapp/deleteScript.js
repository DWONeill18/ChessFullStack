function deleteGame() {

    let id = document.getElementById("Game_id").value;

    fetchData("DELETE", null, "games/" + id).then((
        getElementById("deleteMessage").innerHTML = "Success!!"))
        .catch((err) => {
        console.log('rejected. reason:', err)
    });
    console.log('after promise');
    console.log("ID deleted")

    // if (getGame(id) != null){

    //     document.getElementById("deleteMessage").innerHTML = "Success!!"

    // }
    // else{
    //     document.getElementById("deleteMessage").innerHTML = "Failed!!"
    // }

}