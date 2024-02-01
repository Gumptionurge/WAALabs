import React, { useState } from 'react';

function UseStateArrayMethod() {
  const [books, setBooks] = useState([
    { title: "To Kill a Mockingbird", author: "Harper Lee" }
  ]);

  const [newBookTitle, setNewBookTitle] = useState('');
  const [newBookAuthor, setNewBookAuthor] = useState('');

  const addBook = () => {
   // Check if both title and author are not empty
   if (newBookTitle.trim() !== '' && newBookAuthor.trim() !== '') {
    // Add a new book to the array with values from input fields
    setBooks([...books, { title: newBookTitle, author: newBookAuthor }]);
    
    // Clear input fields after adding a new book
    setNewBookTitle('');
    setNewBookAuthor('');
  } else {
    // Display an alert or handle the case when title or author is empty
    alert('Please enter both title and author.');
  }
  };

  return (
    <div>
      <h1>Books:</h1>
      {books.map((book, index) => (
        <div key={index}>
          <p>BOOK TITLE: {book.title}</p>
          <p>BOOK AUTHOR: {book.author}</p>
        </div>
      ))}
      
      {/* Input fields for the new book */}
      <input
        type='text'
        placeholder='Enter title'
        value={newBookTitle}
        onChange={(event) => setNewBookTitle(event.target.value)}
      />
      <input
        type='text'
        placeholder='Enter author'
        value={newBookAuthor}
        onChange={(event) => setNewBookAuthor(event.target.value)}
      />
      
      {/* Button to add a new book */}
      <button onClick={addBook}>Add Book</button>
    </div>
  );
}

export default UseStateArrayMethod;