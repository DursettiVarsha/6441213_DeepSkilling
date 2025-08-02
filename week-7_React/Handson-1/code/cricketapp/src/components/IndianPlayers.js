import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'KL Rahul', 'Hardik', 'Dhoni', 'Jadeja'];
  const evenTeam = ['Rohit', 'Gill', 'Bumrah', 'Shami', 'Suryakumar'];

  const [firstOdd, ...restOdd] = oddTeam;
  const [firstEven, ...restEven] = evenTeam;

  const T20Players = ['Virat', 'Rohit', 'Gill', 'SKY'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Sarfaraz Khan'];

  const allPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{firstOdd}</li>
        {restOdd.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{firstEven}</li>
        {restEven.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>All Players (Merged)</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
