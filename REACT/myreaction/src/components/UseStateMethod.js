import React,{useState} from 'react'

function UseStateMethod(){
const [person,updateAge] = useState({name:"JOHN DOE",age:0})

const changeAge=()=>{
return updateAge({name:"John Doe",age:person.age+1})    
}

const changeName=(props)=>{
    return updateAge({name:"John Doe",age:person.age+1})    
    }

return (
    <div>
        <h1>MY NAME IS : {person.name} AND MY AGE IS {person.age} 
        </h1>

        <button onClick={changeAge}>ADD MORE</button>  <button onClick={changeName}>CHANGE NAME </button>
       
    </div>
)

}

export default UseStateMethod;