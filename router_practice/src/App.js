import logo from './logo.svg';
import './App.css';
import B from './B';
import A from './A';
import {Route,Routes} from 'react-router-dom'
import C from './C';

function App() {
  return (
    <div className="App">
     <C/>
     <Routes>
      <Route path='/' element={<A/>}></Route>
      <Route path='/B' element={<B/>}></Route>
      </Routes>
     </div>
  );
}

 {/**/}

export default App;
