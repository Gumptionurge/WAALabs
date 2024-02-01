import React,{useEffect,useState} from 'react'
import axios from 'axios'

function UseEffectFetch() {
const[posts,setPost]=useState([])

useEffect(()=>{
    axios.get('https://jsonplaceholder.typicode.com/posts').then(
        (res)=>{
console.log(res.data)
setPost(res.data)
            }).catch(
                (err)=>{
console.log(err)
})
},[]
)

return(<div>
{
    <ol>
        {
          posts.map(
            (post)=><li key={post.id}> {post.title}</li>
          )
        }
    </ol>
}

</div>)
  
}

export default UseEffectFetch