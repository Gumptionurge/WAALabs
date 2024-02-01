import React,{useState} from 'react'

function UseStateObject() {
    const [person,change]=useState({name:"John Doe",age:10})
  return (
    <div>UseStateObject HERE
        <h1> MY NAME IS: {person.name} AND MY AGE IS: {person.age}</h1>
        <p>
            {/*
            <input type='text' value={person.name} onChange={event=>change({name:event.target.value})}></input>
            <input type='number' value={person.age} onChange={event=>change({age:event.target.value})}></input>
              // THIS IS THE FAULT OF SETSTAE IN FUNCTIONAL HOOKS, IT DOESNT MERGE THE 
            */}
          
            <input type='text' value={person.name} onChange={event=>change({...person,name:event.target.value})}></input>
            <input type='number' value={person.age} onChange={event=>change({...person,age:event.target.value})}></input>
           
        </p>
    </div>
 
  )
}

export default UseStateObject