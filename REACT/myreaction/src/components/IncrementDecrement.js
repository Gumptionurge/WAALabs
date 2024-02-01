import React,{useState}from 'react'

function IncrementDecrement() {

    let [count,change]=useState(0);
const add=()=>{
    change(count+1)
}
const subtract=()=>{
    change(count-1)
}
const reset=()=>{
    change(0)
}

const changeBy5=()=>{
    for(let i=0;i<5;i++){
        change((prevCount)=>prevCount+1)
        console.log(i)
    }
    
    
}

  return (
    <div>
        <h1>Increment or decrement</h1>
        <h2>THE COUNT IS : {count}</h2>
        <h3><button onClick={add}>ADD</button> <button button onClick={subtract}>SUBTRACT</button> 
        <button button onClick={reset}>RESET</button> </h3>
        <button button onClick={changeBy5}>ADD 5</button>
        </div>
  )
}

export default IncrementDecrement