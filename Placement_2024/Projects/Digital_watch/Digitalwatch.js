let hour = document.getElementById("hour");
let min = document.getElementById('min');
let sec = document.getElementById('sec');
let ampm = document.getElementById("ampm");

let h=new Date().getHours();
hour.innerHTML=h;
console(hour);
