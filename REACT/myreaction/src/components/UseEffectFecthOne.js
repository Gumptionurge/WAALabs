import React, { useEffect, useState } from 'react';
import axios from 'axios';

function UseEffectFetch() {
  const [post, setPost] = useState({});
  const [id, setId] = useState(1);
  const [displayPost, setDisplayPost] = useState(false);

  useEffect(() => {
    if (displayPost) {
      axios.get(`https://jsonplaceholder.typicode.com/posts/${id}`)
        .then((res) => {
          console.log(res.data);
          setPost(res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    }
  }, [id, displayPost]);

  return (
    <div>
      <input
        value={id}
        placeholder='TYPE ID'
        onChange={(event) => {
          setId(event.target.value);
        }}
      ></input>
      <button
        onClick={() => {
          setDisplayPost(true);
        }}
      >
        FIND BY ID
      </button>
      {/* Display the post title conditionally */}
      {displayPost && post.title && <p>{post.title}</p>}
    </div>
  );
}

export default UseEffectFetch;