import React from 'react';

const Profile = ({ user }) => (
  <div>
    <h1>{user.name}</h1>
    <p>Email: {user.email}</p>
    <p>Joined: {formatDate(user.joined)}</p>
  </div>
);

export default Profile;