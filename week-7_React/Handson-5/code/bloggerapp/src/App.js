import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [show, setShow] = useState('book');

  const books = ['Clean Code', 'Atomic Habits', 'Deep Work'];
  const blogs = ['React Basics', 'JS Tips & Tricks'];
  const courses = ['ReactJS', 'NodeJS', 'MongoDB'];

  const renderComponent = () => {
    if (show === 'book') return <BookDetails books={books} />;
    else if (show === 'blog') return <BlogDetails blogs={blogs} />;
    else if (show === 'course') return <CourseDetails courses={courses} />;
    else return <p>Select something to display</p>;
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Blogger App</h1>

      <div>
        <button onClick={() => setShow('book')}>Show Books</button>
        <button onClick={() => setShow('blog')}>Show Blogs</button>
        <button onClick={() => setShow('course')}>Show Courses</button>
      </div>

      <hr />
      {renderComponent()}
    </div>
  );
}

export default App;
