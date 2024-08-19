const images = [

    'https://1.bp.blogspot.com/-55tCw17XICU/UY-RzZaDItI/AAAAAAAABNw/-2gcvcNSJSY/s1600/bright-color-background-wallpaperx.jpg',

    'https://wallpaperaccess.com/full/251722.jpg',

    'https://eskipaper.com/images/cool-space-wallpaper-4.jpg',

    './images/chicken.jpg'


];

let imageHead = document.getElementById("image-head");
let i = 0;

setInterval(function() {
    imageHead.classList.remove('fade-in');
    imageHead.classList.add('fade-out');

    setTimeout(function() {
        imageHead.style.backgroundImage = "url(" + images[i] + ")";
        imageHead.classList.remove('fade-out');
        imageHead.classList.add('fade-in');

        i = (i + 1) % images.length; // Loop back to the first image
    }, 500); // Duration should match the CSS transition duration
}, 5000);
