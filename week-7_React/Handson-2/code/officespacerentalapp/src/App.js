import React from 'react';
import officeImage from './officespace.webp'; //  use your image file here

function App() {
  const heading = <h1 style={{ textAlign: 'center' }}>Office Space Rental App</h1>;

  const offices = [
    { name: "Tech Tower", rent: 75000, address: "MG Road, Bengaluru" },
    { name: "Biz Park", rent: 55000, address: "Powai, Mumbai" },
    { name: "StartHub", rent: 45000, address: "Gachibowli, Hyderabad" },
    { name: "SkyView", rent: 65000, address: "Cyber City, Gurgaon" }
  ];

  const getRentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}

      <div style={{ textAlign: 'center', marginBottom: '20px' }}>
        <img src={officeImage} alt="Office Space"  />
      </div>

      <h2>Available Office Spaces</h2>
      <ul>
        {offices.map((office, index) => (
          <li key={index} style={{ marginBottom: "15px" }}>
            <strong>Name:</strong> {office.name}<br />
            <strong>Address:</strong> {office.address}<br />
            <strong>Rent:</strong> <span style={getRentStyle(office.rent)}>₹{office.rent}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
