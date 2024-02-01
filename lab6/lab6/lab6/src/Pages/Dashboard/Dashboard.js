import React, { useState } from 'react';
import Posts from '../../containers/Posts/Posts';
import PostDetails from '../../components/PostDetails/PostDetails';
import './Dashboard.css'

const Dashboard = () => {
  const [posts, setPosts] = useState([
    { id: 1, author: 'Hasan Al-Yousef', title: 'Introduction to Java' },
    { id: 2, author: 'Ariho Malouf', title: 'React for dummies' },
    { id: 3, author: 'Hilary Arinda', title: 'How to meditate like a Pro' },
  ]);

  const [newTitle, setNewTitle] = useState(''); // State for the new title
  const [selectedPost, setSelectedPost] = useState(null);

  const updateTitle = () => {
    // Update the title of the first post with the newTitle
    setPosts(prevPosts => [
      { ...prevPosts[0], title: newTitle },
      ...prevPosts.slice(1),
    ]);
    // Clear the newTitle after updating
    setNewTitle('');
  };

  const showPostDetails = (postId) => {
    const post = posts.find(post => post.id === postId);
    setSelectedPost(post);
  };

  
  return (
    <div className="dashboard-container">
      <h1>Dashboard</h1>

      {/* Textfield and Button for updating the first component's title */}
      <div className="input-container">
        <input
          type="text"
          value={newTitle}
          onChange={(e) => setNewTitle(e.target.value)}
          placeholder="New Title"
        />
        <button onClick={updateTitle}>Update Title</button>
      </div>

      {/* Display Posts */}
      <div className="posts-container">
        <Posts posts={posts} showDetails={showPostDetails} />
      </div>

      {/* Display PostDetails */}
      {selectedPost && <PostDetails post={selectedPost} />}
    </div>
  );
};

export default Dashboard;
