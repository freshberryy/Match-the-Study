function showQualifications() {
    var department = document.getElementById("select-department").value;
    var qualifications = document.getElementById("qualifications");
    
    if (department) {
        qualifications.style.display = "block";
    } else {
        qualifications.style.display = "none";
    }
}