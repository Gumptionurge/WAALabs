import React, { useState } from 'react';

function AddPost({ onAddPost }) {
  const [title, setTitle] = useState('');
  const [content, setContent] = useState('');
  const [author, setAuthor] = useState('');

  function handleAuthor(event) {
    setAuthor(event.target.value);
  }

  function handleContent(event) {
    setContent(event.target.value);
  }

  function handleTitle(event) {
    setTitle(event.target.value);
  }

  function handleSubmit() {
    // Call the function passed from Dashboard to add the post
    onAddPost({ title, content, author });

    // Clear the form after adding the post
    setTitle('');
    setContent('');
    setAuthor('');
  }

  return (
    <div>
      ADD SOME POSTS
      <input type="text" placeholder="Enter Title" value={title} onChange={handleTitle}></input>
      <input type="text" placeholder="Enter Content" value={content} onChange={handleContent}></input>
      <input type="text" placeholder="Enter Author" value={author} onChange={handleAuthor}></input>
      <button onClick={handleSubmit}>Add Post</button>
    </div>
  );
}

export default AddPost;
