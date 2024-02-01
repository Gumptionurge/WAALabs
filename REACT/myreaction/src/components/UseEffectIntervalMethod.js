import React ,{useEffect,useState} from 'react'


function UseEffectIntervalMethod() {
    const[count,setCount]=useState(0)

    useEffect(()=>{
        const interval = setInterval(()=>{setCount(prevCount=>prevCount+1)},1000)
        return ()=>{
            clearInterval(interval)
        }
    },[])
{/*
WHEN YOU USE AN EMPTY DEPENDENCY[], DONT USE COUNT LIVE OTHERWISE IT DOESNT UPDATE
also the return callback function is for unmounting
*/}
  return (
    
    <div>{count}</div>
    
  )
}

export default UseEffectIntervalMethod