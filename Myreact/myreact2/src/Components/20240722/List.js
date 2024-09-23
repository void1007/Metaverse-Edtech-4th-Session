import styled from "styled-components";

const Ul = styled.ul``;

const Li = styled.li`
  list-style: none;
  color: lightCoral;
`;

const container = styled.div`
  width: 100vw;
  margin: 0 auto;
  text-align: center;
`;

const Title = styled.h1`
  font-size: 2rem;
`;

const Photo = styled.img`
  border-radius: 50%;
`;

export function List({ products, user }) {
  //Javascript 코딩 영역

  return (
    <>
      <h1>List Components</h1>
      <p>리액트 연습 코드</p>
      <ul>
        {products.map((p) => (
          <Li>{p.title}</Li>
        ))}
      </ul>
      <container>
        <Title>{user.name}</Title>
        <Photo src={user.imageUrl}></Photo>
      </container>
    </>
  );
}
