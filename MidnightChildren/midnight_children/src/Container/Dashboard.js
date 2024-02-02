import React, {useEffect,useState}from 'react'
import { findAll } from '../Api/Api';
import { deleteById } from '../Api/Api'
import Posts from '../Component/Posts';
import PostDetails from '../Component/PostDetails';
import AddPost from '../Component/AddPost';
import { addPost } from '../Api/Api'

function Dashboard() {

   const[posts,setPosts]=useState([]);
   const[selected,select]=useState(null)

   function clickHandler(post){
    select(post)

   }

   const deleteHandler=(id)=>{
    deleteById(id)
    const updatedPosts = posts.filter((post) => post.id !== id);
        setPosts(updatedPosts);
        select(null);
    }

   useEffect(()=>{
    findAll().then(
        (res)=>{
            console.log(res.data)
            setPosts(res.data)
        }
    )

   },[])

   const onAddPost = (newPost) => {
    addPost(newPost)
      .then((res) => {
        // Update the state with the newly added post
        setPosts([...posts, res.data]);
      })
      .catch((error) => {
        console.error('Error adding post:', error);
      })
  };

  return (
    <div>Dashboard
        <Posts posts={posts} clickHandler={clickHandler} />
        <PostDetails selectedPost={selected} deleteHandler={deleteHandler}/>

        <AddPost onAddPost={onAddPost}/>
    </div>
  )
}

export default Dashboard