var now = new Date();
now.setDate(now.getDate() + 1);

var tomorrow = now.toISOString().split('T')[0];
document.getElementsByName("date")[0].setAttribute('min', tomorrow);

const picker = document.getElementById('dateInput');
picker.addEventListener('input', function(e){
    var day = new Date(this.value).getUTCDay();
    if([6,0].includes(day)){
        e.preventDefault();
        this.value = '';
        alert('We are closed on weekends. Please choose a weekday.');
    }
});