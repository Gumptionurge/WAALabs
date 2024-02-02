import React, { useState } from 'react'


function Nothing() {

    const[count,setCount]=useState(0);
  

const handleClick=()=>{
    alert("FUCK YOU!")
    setCount(count+1)
}

  return (
    <div style={{backgroundColor:'red'}}>
<button style={{color:'blue'}}onClick={handleClick}>YOU'VE CLICKED ME {count} Times</button>


    </div>
  )
}

export default Nothing