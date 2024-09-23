import styled from "styled-components";
import { Avatar } from "./Avatar";

const Container = styled.div`
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 50px;
`;

// const { name, job, country } = /*객체를 리턴하는 함수()*/;
// const[x0,x1,x2] = /*배열을 리턴하는 함수()*/;

const colors = ["lightgreen", "teal", "lightgrey", "khaki"];

const persons = [
  { name: "Alice", job: "Programmer", country: "Korea" },
  { name: "Tom", job: "Student", country: "Norway" },
  { name: "Ronaldo", job: "FootballPlayer", country: "Portugal" },
  { name: "Billy", job: "GayActor", country: "USA" },
];

export function AvatarWrapper() {
  return (
    <>
      <Container>
        {persons.map((p, i) => (
          <Avatar persons={p} bgcolor={colors[i]} />
        ))}
      </Container>
    </>
  );
}
