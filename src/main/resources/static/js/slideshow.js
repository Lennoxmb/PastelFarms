const images = [

    'https://1.bp.blogspot.com/-55tCw17XICU/UY-RzZaDItI/AAAAAAAABNw/-2gcvcNSJSY/s1600/bright-color-background-wallpaperx.jpg',

    'https://wallpaperaccess.com/full/251722.jpg',

    'https://eskipaper.com/images/cool-space-wallpaper-4.jpg',

    './images/chicken.jpg'


];

let currentImageIndex = 0;
let currentHead = 1;

function changeImage() {
    let nextImageIndex = (currentImageIndex + 1) % images.length;
    let currentElement = document.getElementById(`image-head-${currentHead}`);
    let nextElement = document.getElementById(`image-head-${3 - currentHead}`); // Switch between 1 and 2

    nextElement.style.backgroundImage = `url(${images[nextImageIndex]})`;

    currentElement.classList.remove('fade-in');
    currentElement.classList.add('fade-out');

    nextElement.classList.remove('fade-out');
    nextElement.classList.add('fade-in');

    currentImageIndex = nextImageIndex;
    currentHead = 3 - currentHead; // Switch between 1 and 2
}

window.onload = function() {
    let firstElement = document.getElementById('image-head-1');
    let secondElement = document.getElementById('image-head-2');

    firstElement.style.backgroundImage = `url(${images[0]})`;
    secondElement.style.backgroundImage = `url(${images[1]})`;

    firstElement.classList.add('fade-in');

    // Start the transitions with a delay to ensure the first fade-in works
    setTimeout(function() {
        changeImage(); // First manual call to changeImage to handle initial transition
        setInterval(changeImage, 5000); // Subsequent transitions
    }, 500);
};