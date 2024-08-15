const images = [

    'https://1.bp.blogspot.com/-55tCw17XICU/UY-RzZaDItI/AAAAAAAABNw/-2gcvcNSJSY/s1600/bright-color-background-wallpaperx.jpg',

    'https://wallpaperaccess.com/full/251722.jpg',

    'https://eskipaper.com/images/cool-space-wallpaper-4.jpg',

    './images/chicken.jpg'


];

let imageHead = document.getElementById("image-head");

let i = 0;
setInterval(function() {
    imageHead.style.backgroundImage = "url(" + images[i] + ")";
    i = i + 1;
    if (i === images.length) {
        i =  0;
    }
}, 5000);