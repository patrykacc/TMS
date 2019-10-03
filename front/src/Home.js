import React from 'react';
import './App.css';
import TrainingsList from "./trainings/trainingsTable/TrainingsTable";

function Home(props) {
    return (
        <div className="Home">
            <TrainingsList {...props} />
        </div>
    );
}

export default Home;
