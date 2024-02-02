import React from 'react';
import Post from './Post';

const Posts = ({posts,clickHandler}) => {
  const postList = posts.map((post) => {
    return (
      <Post 
        post={post}
        key={post.id}
        clickHandler={clickHandler}
       
      />
    );
  });

  return postList;
};

export default Posts;