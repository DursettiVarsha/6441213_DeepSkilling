import React from 'react';

function BlogDetails({ blogs }) {
  return blogs?.length > 0 ? (
    <div>
      <h3>Blog Details</h3>
      <ul>
        {blogs.map((blog, index) => (
          <li key={index}>{blog}</li>
        ))}
      </ul>
    </div>
  ) : null; // conditional rendering using &&
}

export default BlogDetails;
