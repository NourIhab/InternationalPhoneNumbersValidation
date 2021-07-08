


function ShowHideDiv() {
    var country = document.getElementById('country');
    var number = document.getElementById('numbers');
    var cameroon = document.getElementById('cameroon');
    var ethiopia = document.getElementById('ethiopia');
    var morocco = document.getElementById('morocco');
    var mozambique = document.getElementById('mozambique');
    var uganda = document.getElementById('uganda');
    switch (country.value) {
        case "CAMEROON":
            number.style.display = 'none';
            cameroon.style.display = 'block';
            ethiopia.style.display = 'none';
            morocco.style.display = 'none';
            mozambique.style.display = 'none';
            uganda.style.display = 'none';
            break;
        case "ETHIOPIA":
            number.style.display = 'none';
            ethiopia.style.display = 'block';
            cameroon.style.display = 'none';
            morocco.style.display = 'none';
            mozambique.style.display = 'none';
            uganda.style.display = 'none';
            break;
        case "MOZAMBIQUE":
            number.style.display = 'none';
            mozambique.style.display = 'block';
            ethiopia.style.display = 'none';
            cameroon.style.display = 'none';
            uganda.style.display = 'none';
            morocco.style.display = 'none';
            break;
        case "UGANDA":
            number.style.display = 'none';
            uganda.style.display = 'block';
            mozambique.style.display = 'none';
            ethiopia.style.display = 'none';
            cameroon.style.display = 'none';
            morocco.style.display = 'none';
            break;
        case "MORCCO":
            number.style.display = 'none';
            uganda.style.display = 'none';
            mozambique.style.display = 'none';
            ethiopia.style.display = 'none';
            cameroon.style.display = 'none';
            morocco.style.display = 'block';
            break;
        case"SELECT_YOUR_COUNTRY":
            number.style.display = 'block';
            uganda.style.display = 'none';
            mozambique.style.display = 'none';
            ethiopia.style.display = 'none';
            cameroon.style.display = 'none';
            morocco.style.display = 'none';
            break;
        default:
    }

}

 



