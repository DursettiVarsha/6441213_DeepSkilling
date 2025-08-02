import React from 'react';

function BookDetails({ books }) {
  if (!books || books.length === 0) return <p>No books available.</p>;

  return (
    <div>
      <h3>Book Details</h3>
      <ul>
        {books.map((book, index) => (
          <li key={index}>{book}</li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
