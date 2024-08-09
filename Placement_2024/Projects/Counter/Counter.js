 var count=0;

function increase(){
    count++;
    document.getElementById("val").innerHTML = count;
   
}
function decrease(){
    count--;
    document.getElementById("val").innerHTML = count;
}
function reset(){
    count=0;
    document.getElementById("val").innerHTML =count;
}