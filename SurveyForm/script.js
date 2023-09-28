function validateForm() {
    
    return true;
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}


function showPopup(data) {
    var popup = document.getElementById("popup");
    var popupData = document.getElementById("popupData");
    popupData.innerHTML = data;
    popup.style.display = "block";
}

function closePopup() {
    var popup = document.getElementById("popup");
    popup.style.display = "none";
}

document.getElementById("surveyForm").addEventListener("submit", function (e) {
    e.preventDefault();
    
    var formData = new FormData(e.target);
    var data = "";

    
    for (var pair of formData.entries()) {
        data += `<p><strong>${pair[0]}:</strong> ${pair[1]}</p>`;
    }

    showPopup(data);
    
    resetForm();
});
