import React from 'react';

const PostDetails = ({ post }) => {
  return (
    <div>
      <h3>ID: {post.id}</h3>
      <p>Author: {post.author}</p>
      <p>Title: {post.title}</p>
      {/* Add Edit and Delete buttons */}
      <button>Edit</button>
      <button>Delete</button>
    </div>
  );
};

export default PostDetails;