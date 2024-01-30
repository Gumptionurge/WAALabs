
import React from 'react';
import './Post.css';

const Post = ({ id, author, title, showDetails }) => {
  return (
    <div className='post-container'>
      <h3>ID: {id}</h3>
      <p>Author: {author}</p>
      <p>Title: {title}</p>
      <button onClick={showDetails}>Show Details</button>
    </div>
  );
};

export default Post;

