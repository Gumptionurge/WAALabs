import React from 'react';
import Post from '../../components/Post/Post';
import '../../Pages/Dashboard/Dashboard.css'

const Posts = ({ posts, showDetails }) => {
  return (
    <div className='posts-container'>
      {posts.map((post) => (
        <div key={post.id}>
          <Post {...post} showDetails={() => showDetails(post.id)} />
        </div>
      ))}
    </div>
  );
};

export default Posts;
