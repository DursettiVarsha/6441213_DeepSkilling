import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 98 },
    { name: 'Rohit Sharma', score: 85 },
    { name: 'KL Rahul', score: 40 },
    { name: 'Shubman Gill', score: 72 },
    { name: 'Hardik Pandya', score: 55 },
    { name: 'Ravindra Jadeja', score: 66 },
    { name: 'MS Dhoni', score: 105 },
    { name: 'Yuvraj Singh', score: 69 },
    { name: 'Jasprit Bumrah', score: 60 },
    { name: 'Mohammed Shami', score: 50 },
    { name: 'Suryakumar Yadav', score: 99 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with score below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
