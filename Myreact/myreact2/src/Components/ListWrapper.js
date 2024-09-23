import { List } from "./20240722/List";

export function ListWrapper() {
  const products = [
    { title: "Banana" },
    { title: "Apple" },
    { title: "Grape" },
  ];

  const user = {
    name: "Alice",
    imageUrl:
      "https://dcimg7.dcinside.co.kr/viewimage.php?id=2ab2c6&no=24b0d769e1d32ca73ce981fa11d0283174e253ba7e9967bde184fb60657ebfb8058a774fd55fa1f4bc0cfa3578f7b50f64e154a82d5bfd495e8b281eb8285db8ec469869e612bc28278837190a14de5a67abe3143b627b4e1e17281fcd",
  };

  return (
    <>
      <List products={products} user={user} />
    </>
  );
}

/* 컴포넌트가 매개변수를 받을 때 구조분해할당을 이용함!!
const options = {title:"Menu",width:100,height:200};
const{title,width,height} = options;
console.log(title); //Menu
*/
