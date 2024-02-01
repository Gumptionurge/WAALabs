import axios from 'axios'
const BASE_URL ='http://localhost:8080/posts'

export function api(){
return axios.get(BASE_URL)
}
export const getPostById = (postId) => {
    return axios.get(`${BASE_URL}/${postId}`);
  };