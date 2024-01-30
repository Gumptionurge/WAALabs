import logo from './logo.svg';
import './App.css';
import MComponent from './components/Greet';
import Deo from './components/Carol'
import Aclass from './components/Aclass';
import James from './components/James';
import Hasan from './components/Hasan';

function App() {
  return (
    <div className="App">
      {/*<MComponent/>
      <Deo/>
      <Aclass/>
      <James/>
      <Aclass/>
  */}
     <Hasan name='Hasan Al-Yousef' son='Bishar'/>
     <Hasan name='Ariho Gumption' son='YET TO FIND GIRLFRIEND'/>
     <button>GET GIRLFRIEND</button>
     <Hasan name='James ' son='Jemeson'>
      <p1>HEYYY HEYYYYY EXECUTE PLEASE</p1>
     </Hasan>

    </div>
  
  );
}

export default App;
