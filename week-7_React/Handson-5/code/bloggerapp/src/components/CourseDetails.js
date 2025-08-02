import React from 'react';
import ListItem from './ListItem';

function CourseDetails({ courses }) {
  const courseList = courses?.length ? (
    <ul>
      {courses.map((course, index) => (
        <ListItem key={index} value={course} />
      ))}
    </ul>
  ) : (
    <p>No courses to display.</p>
  );

  return (
    <div>
      <h3>Course Details</h3>
      {courseList}
    </div>
  );
}

export default CourseDetails;
