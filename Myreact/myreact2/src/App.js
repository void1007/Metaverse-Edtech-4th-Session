import { List } from "./Components/20240722/List";
import { Test1 } from "./Components/20240722/Test1";
import { Test2 } from "./Components/20240722/Test2";
import { Avatar } from "./Components/20240723/Avatar";
import { AvatarWrapper } from "./Components/20240723/AvatarWrapper";
import { CounterState } from "./Components/20240723/CounterState";
import { Score } from "./Components/20240723/Score";
import { ScoreWrapper } from "./Components/20240723/ScoreWrapper";
import { createGlobalStyle } from "styled-components";
import { Home } from "./Components/20240724/Home";
import { Menu } from "./Components/20240724/Menu";
import { ListWrapper } from "./Components/ListWrapper";
import { ItemList } from "./Components/20240724/ItemList";
import { OpenWeather } from "./Components/OpenWeatherWrap/OpenWeather";

const GlobalStyle = createGlobalStyle`
@font-face {
    font-family: 'GmarketSansMedium';
    src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'GmarketSansMedium';
}
`;

function App() {
  return (
    <>
      {/* <ListWrapper />
      <AvatarWrapper /> */}
      {/* <ScoreWrapper />
      <CounterState /> */}
      {/*<GlobalStyle />
      <Home />
      <ItemList />*/}
      <OpenWeather />
    </>
  );
}

export default App;
