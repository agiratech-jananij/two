var city=document.querySelector('#cities')
var btn=document.querySelector('#sign')
var cityinput=document.querySelector('.cityoutput')
var description=document.querySelector('.descri')
var temp=document.querySelector('.temperature')
var winds=document.querySelector('.wind')

apik = "457c4877348478f7d28ca856bd6cd259"

//kelvin to celcious. 1 Kelvin is equal to -272.15 Celsius.

function convertion(a){
    return (a - 273).toFixed(2)
}
//Now we have to collect all the information with the help of fetch method

    btn.addEventListener('click', function(){

//This is the api link from where all the information will be collected

        fetch('https://api.openweathermap.org/data/2.5/weather?q='+city.value+'&appid='+apik)
        .then(res => res.json())

         //.then(data => console.log(data))

        .then(data => {

//Now you need to collect the necessary information with the API link. Now I will collect that information and store it in different constants.

            var nameval = data['name']
            var descrip = data['weather']['0']['description']
            var tempature = data['main']['temp']
            var wndspd = data['wind']['speed']
//Now with the help of innerHTML you have to make arrangements to display all the information in the webpage.
            city.innerHTML=`Weather of <span>${nameval}<span>`
            temp.innerHTML = `Temperature: <span>${ convertion(tempature)} C</span>`
            description.innerHTML = `Sky Conditions: <span>${descrip}<span>`
            winds.innerHTML = `Wind Speed: <span>${wndspd} km/h<span>`

        })

//Now the condition must be added that what if you do not input anything in the input box.
        //.catch(err => alert('You entered Wrong city name'))
    })
//If you click on the submit button without inputting anything in the input box or typing the wrong city name then the above text can be seen.