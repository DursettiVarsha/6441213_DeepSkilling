import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginLogout = () => {
    setIsLoggedIn(prev => !prev);
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Flight Booking Portal</h1>

      <button onClick={handleLoginLogout}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>

      <hr />

      {isLoggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
