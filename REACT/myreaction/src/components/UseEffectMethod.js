import React,{useState, useEffect} from 'react'

function UseEffectMethod() {
    const[count,setCount]=useState(0)
    const[sex,setSex]=useState('')
    useEffect(()=>{
        document.title=`XXX PORN EXTREME ${count}`
        console.log({count})
    },[count])
    {/*ADD COUNT TO LIMIT THE SIDE EFFECTS TO ONLY WHEN THE COUNT CHANGES
    IF YOU WANT IT TO CHANGE ONCE DURING MOUNTING, THEN []
*/}
    const change = (event) => {
        setSex(event.target.value);
      };
  return (
    <div>
        <h1>CLICK ME bitch</h1>
        <h2><button onClick={()=>{setCount((prevCount)=>prevCount+1)}}>PRESSED {count} times</button></h2>
        {/*CONDITIONALITY */}
        <input value={sex} placeholder='TYPE YOUR SEX' type='text' onChange={change}></input>

    </div>
  )
}

export default UseEffectMethod