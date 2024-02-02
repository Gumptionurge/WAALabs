import React from 'react'


function PostDetails({selectedPost,deleteHandler}) {



  return (
  <>
  <div style={{backgroundColor:'burlywood'}}>
        {(selectedPost)?(<div><span style={{color:'red'}}>TITLE: {selectedPost.title}</span>     
        <span style={{color:'green'}}>CONTENT: {selectedPost.content}</span>
        </div>):<div>nothing selected</div>}
    </div>

    <div><button style={{color:'purple'}} onClick={()=>{deleteHandler(selectedPost.id)}}>DELETE</button> <button>EDIT</button></div>
  </>
    
  )
}

export default PostDetails