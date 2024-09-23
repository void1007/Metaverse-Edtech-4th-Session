import styled from "styled-components";

const Container = styled.div`
  width: 100%;
  height: 100%;
`;

const Ul = styled.ul`
  display: flex;
  flex-wrap: wrap;
`;

const LI = styled.li`
  width: 100%;
  padding-left: 20px;
  list-style: none;
  font-weight: 700;
`;

const Link = styled.a`
  display: block;
  text-decoration: none;
  color: rgba(0, 0, 0, 0.7);
  padding: 10px 5px;
  font-size: 1.5rem;
  &:hover {
    background-color: dodgerblue;
    color: white;
  }
`;

export function Menu() {
  return (
    <>
      <Container>
        <Ul>
          <LI>
            <Link href="#">Home</Link>
          </LI>
          <LI>
            <Link href="#">Content</Link>
          </LI>
          <LI>
            <Link href="#">About Us</Link>
          </LI>
          <LI>
            <Link href="#">Contact</Link>
          </LI>
          <LI>
            <Link href="#">Social</Link>
          </LI>
        </Ul>
      </Container>
    </>
  );
}
