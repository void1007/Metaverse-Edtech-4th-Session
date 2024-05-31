const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get("id");
console.log("Game Id :",id);

const url = "http://localhost:8080/products/" + id;

axios.get(url)
.then((response)=>{
    console.log("데이터: ", response.data);
    displaysingleProducts(response.data);
})
.catch((error)=>{
    console.log("에러 발생: ",error)
})

function displaysingleProducts(data){
    const product = document.querySelector(".product");
    const game = document.createElement("div");
    game.classList.add("game");
    const img = document.createElement("img");
    img.src = data.image;
    img.classList.add("image");
    game.appendChild(img);
    product.appendChild(game);
    const title = document.createElement("p");
    const genre = document.createElement("p");
    const price = document.createElement("p");
    const text = document.createElement("p");
    title.textContent="게임 타이틀 : " + data.title;
    genre.textContent="게임 장르 : " + data.genre;
    price.textContent="게임 가격 : " + data.price +" 원";
    text.textContent=data.text;
    game.appendChild(title);
    game.appendChild(genre);
    game.appendChild(price);
    game.style.setProperty("box-shadow","initial","important");
    game.style.setProperty("transform","initial","important");
    game.style.setProperty("cursor","initial","important");
    game.appendChild(text);
}