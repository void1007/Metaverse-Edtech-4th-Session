//const urlLogin = "/api/user/login";
const urlAuthenticate = "/api/authenticate";
const urlLogout = "/api/user/logout";
const urlSignup = "/api/user/signup";
const urlSession = "/api/user/current";
let userId = "";
let password = "";
let userIdSignup = "";
let passwordSignup = "";
let userName = "";
let userEmail = "";

document.querySelector("#userId").addEventListener("change", (e) => {
  console.log(e.target.value);
  userId = e.target.value;
});
document.querySelector("#password").addEventListener("change", (e) => {
  console.log(e.target.value);
  password = e.target.value;
});
document.querySelector("#userIdSignup").addEventListener("change", (e) => {
  console.log(e.target.value);
  userIdSignup = e.target.value;
});
document.querySelector("#passwordSignup").addEventListener("change", (e) => {
  console.log(e.target.value);
  passwordSignup = e.target.value;
});
document.querySelector("#userName").addEventListener("change", (e) => {
  console.log(e.target.value);
  userName = e.target.value;
});
document.querySelector("#userEmail").addEventListener("change", (e) => {
  console.log(e.target.value);
  userEmail = e.target.value;
});

document.querySelector(".loginBtn").addEventListener("click", () => {
  const data = {
    userId: userId,
    password: password,
  };
  axios
    // .post(urlLogin, data, { withCredentials: true })
    .post(urlAuthenticate, data, { withCredentials: true })
    .then((response) => {
      console.log("데이터: ", response.data);
      if (response.data.resultCode == "SUCCESS") {
        sessionStorage.setItem("JWT-token", response.data.data.token);
      }
      window.location.reload();
      //sessionCurrent();
    })
    .catch((error) => {
      console.log("에러 발생: ", error.response.data);
    });
});
document.querySelector(".logoutBtn").addEventListener("click", () => {
  if (confirm("로그아웃하시겠습니까?")) {
    sessionStorage.removeItem("JWT-token");
    window.location.reload();
    // axios
    //   .post(urlLogout, {}, { withCredentials: true })
    //   .then((response) => {
    //     console.log("데이터:", response.data);
    //     if (response.data.resultCode == "SUCCESS") {
    //       document.querySelector(".login-box").classList.remove("hidden");
    //       document.querySelector(".user-box").classList.add("hidden");
    //     }
    //   })
    //   .catch((error) => {
    //     console.log("에러 발생:", error.response.data);
    //   });
  }
});
document.querySelector(".signupBtn").addEventListener("click", () => {
  const data = {
    userId: userIdSignup,
    password: passwordSignup,
    userName: userName,
    userEmail: userEmail,
  };
  axios
    .post(urlSignup, data, { withCredentials: true })
    .then((response) => {
      console.log("데이터: ", response.data);
      alert("회원가입이 완료되었습니다. 로그인해주세요.");
      window.location.reload();
    })
    .catch((error) => {
      console.log("에러 발생: ", error.response.data);
    });
});

function signup() {
  document.querySelector(".login-box").classList.add("hidden");
  document.querySelector(".user-box").classList.add("hidden");
  document.querySelector(".signup-box").classList.remove("hidden");
}

function sessionCurrent() {
  const jwtToken = sessionStorage.getItem("JWT-token");
  if (!jwtToken) {
    console.log("인증이 필요합니다.");
    return;
  }
  axios
    .get(urlSession, {
      withCredentials: true,
      headers: {
        Authorization: `Bearer ${jwtToken}`,
      },
    })
    .then((response) => {
      console.log("데이터:", response.data);
      if (response.data.resultCode == "SUCCESS") {
        console.log("세션 유지");
        document.querySelector(".login-box").classList.add("hidden");
        document.querySelector(".user-box").classList.remove("hidden");
        document.querySelector(".user-box p").textContent =
          response.data.data.userId + "님, 환영합니다.";
      }
    })
    .catch((error) => {
      console.log("에러 발생:", error.response.data);
    });
}

// js 파일이 로드될때 호출됨
sessionCurrent();
