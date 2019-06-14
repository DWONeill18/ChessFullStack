function submitCreate(){
    let body = {};
    body.white = document.getElementById("White").value;
    body.black = document.getElementById("Black").value;
    body.result = document.getElementById("Result").value;
    body.eco = document.getElementById("Eco").value;
    body.notation = document.getElementById("Notation").value;

    let json = JSON.stringify(body);

    let request = new XMLHttpRequest();
    request.open("POST", "api/games/");
    request.setRequestHeader("content-type", "application/json");

    req.onreadystatechange = () => {
        if (req.readyState === 4) {
            if (req.status >= 200 && req.status < 300) {
                document.getElementById("message").innerHTML = "Success!!"
            }
            else {
                document.getElementById("message").innerHTML = "Fail!!"
            }
        }
    };

    request.send(json);

}