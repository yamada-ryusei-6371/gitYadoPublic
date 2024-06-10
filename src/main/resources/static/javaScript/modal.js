
// モーダルウィンドウとボタン、クローズアイコンの要素を取得
var btn = document.getElementsByClassName("openModal");
console.log("openModal count " + btn.length);
for (var i = 0; i < btn.length; i++) {
    console.log(btn[i].id);
    btn[i].addEventListener("click", function() {
        var modalId = this.id.replace("openModal_", "myModal_");
        var modal = document.getElementById(modalId);
        if (modal) {
            modal.style.display = "block";
        }
    });
}

var span = document.getElementsByClassName("close");
console.log("closeModal count " + span.length);
for (var i = 0; i < span.length; i++) {
    console.log(span[i].id);
    span[i].addEventListener("click", function() {
        var modalId = this.id.replace("closeModal_", "myModal_");
        var modal = document.getElementById(modalId);
        if (modal) {
            modal.style.display = "none";
        }
    });
}

// モーダルの外側をクリックした時にモーダルを非表示
window.onclick = function(event) {
    var modal = document.getElementsByClassName("modal");
    for (var i = 0; i < modals.length; i++) {
        if (event.target == modal[i]) {
            modal[i].style.display = "none";
        }
    }
}