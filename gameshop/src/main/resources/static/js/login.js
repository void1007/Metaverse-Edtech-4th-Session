const urlLogin = "http://localhost:8080/user/login";    // const : 선언된 변수에 대해 값을 한 번만 할당할 수 있고, 이후에는 변경할 수 없음
const urlLogout = "http://localhost:8080/user/logout";
const urlSignup = "http://localhost:8080/user/signup";
let userId = "";    // "let"으로 선언된 변수는 블록 범위(block-scoped)를 가지며, 재할당이 가능. 변수의 값을 나중에 변경할 수 있음
let password = "";
let signupId = "";
let signupPassword = "";
let signupName = "";
let signupEmail = "";


document.querySelector("#userId").addEventListener("change", (e)=>{
  console.log(e.target.value);
  userId = e.target.value;
});
document.querySelector("#password").addEventListener("change", (e)=>{
  console.log(e.target.value);
  password = e.target.value;
});

document.querySelector("#userIdCheck").addEventListener("change",(e)=>{
  console.log(e.target.value);
  signupId = e.target.value;
})
document.querySelector("#passwordCheck").addEventListener("change",(e)=>{
  console.log(e.target.value);
  signupPassword = e.target.value;
})
document.querySelector("#nameCheck").addEventListener("change",(e)=>{
  console.log(e.target.value);
  signupName = e.target.value;
})
document.querySelector("#emailCheck").addEventListener("change",(e)=>{
  console.log(e.target.value);
  signupEmail = e.target.value;
})

document.querySelector(".ProceedBtn").addEventListener("click",()=>{
  const data ={
    userId:signupId,
    password:signupPassword,
    userName:signupEmail,
    userEmail:signupName
  }
  axios.post(urlSignup,data,{withCredentials: true})
  .then((response)=>{
    console.log("데이터: ", response);
  })
  .catch((error)=>{
    console.log("에러 발생:",error)
  })
});

document.querySelector(".loginBtn").addEventListener("click", ()=>{
  const data = {
    userId: userId,
    password: password,
  }
  axios
    .post(urlLogin, data, { withCredentials: true })
    .then((response) => {
      console.log("데이터: ", response);
      sessionCurrent();
    })
    .catch((error) => {
      console.log("에러 발생: ", error);
    })
});

document.querySelector(".logoutBtn").addEventListener("click", ()=>{
    if (confirm("로그아웃하시겠습니까?")) {
        axios
        .post(urlLogout, {}, {withCredentials: true})
        .then((response)=>{
            console.log("데이터:", response);
            if (response.status == 200) {
                document.querySelector(".login-box").classList.remove("hidden");
                document.querySelector(".user-box").classList.add("hidden");
            }
        })
        .catch((error)=>{
            console.log("에러 발생:", error);
        })
    }
})

document.querySelector(".signupBtn").addEventListener("click",()=>{
  document.querySelector(".login-box").classList.add("hidden");
  document.querySelector(".signup-box").classList.remove("hidden");
})
document.querySelector(".Back-btn").addEventListener("click",()=>{
  document.querySelector(".login-box").classList.remove("hidden");
  document.querySelector(".signup-box").classList.add("hidden");
})

function sessionCurrent() {
  axios
    .get("http://localhost:8080/user/current", { withCredentials: true })
    .then((response) => {
      console.log("데이터 : ", response);
      if (response.status == 200) {
        console.log("세션유지");
        if (response.status == 200) {
          document.querySelector(".login-box").classList.add("hidden");
          document.querySelector(".user-box").classList.remove("hidden");
          document.querySelector(".user-box p").textContent =
            response.data.userId+ "님, 환영합니다.";
        }
      }
    })
    .catch((error) => {
      console.log("에러발생 : ", error);
    });
}

//js 파일이 로드 될때 호출됨
sessionCurrent();
