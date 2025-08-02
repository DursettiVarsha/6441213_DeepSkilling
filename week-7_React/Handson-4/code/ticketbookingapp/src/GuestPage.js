import React from 'react';

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>You can browse available flights, but booking requires login.</p>
      <ul>
        <li>Flight A - Delhi to Mumbai</li>
        <li>Flight B - Hyderabad to Bangalore</li>
        <li>Flight C - Chennai to Kolkata</li>
      </ul>
    </div>
  );
}

export default GuestPage;
