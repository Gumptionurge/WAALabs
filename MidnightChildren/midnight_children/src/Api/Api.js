import axios from 'axios'

const API =axios.create({baseURL: 'http://localhost:8080/'})

export const findAll =()=>{
return API.get('posts');
}

export const deleteById=(id)=>{
    return API.delete(`posts/${id}`);
}

export const addPost = (post) => {
    const postData = JSON.stringify(post);
    const config = {
      headers: {
        'Content-Type': 'application/json',
      },
    };
  
    return API.post('/posts', postData, config);
  };