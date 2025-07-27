import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>My Academy Dashboard</h1>

      <CohortDetails
        name="React Bootcamp"
        status="ongoing"
        startDate="2024-07-01"
        endDate="2024-08-15"
      />

      <CohortDetails
        name="Java Spring Cohort"
        status="completed"
        startDate="2024-04-01"
        endDate="2024-06-01"
      />
    </div>
  );
}

export default App;
