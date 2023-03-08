import logo from './logo.svg'
import React,{useState,useEffect} from 'react';
import ReactDOM from "react-dom/client";
import {BrowserRouter as Router, Link, Route, Routes} from 'react-router-dom';
import './App.css';
import Post from './component/post';
import Delete from './component/delete';
import Get from './component/get';
import Put from './component/put';

function App() {
  return (
    <Router>
    <ul class="nav nav-tabs">

        {/* <li class="nav-item"> */}
        {/* <a class="nav-link active" aria-current="page" href="/src/Components/hooksdemo.js">HooksDemo</a> */}
        <Link to="/get" class="nav-link active">Get </Link>
        {/* </li> */}

        {/* <li class="nav-item"> */}
          {/* <a class="nav-link active" aria-current="page" href="/src/Components/hooksdemo.js">HooksDemo</a> */}
          <Link to="/post" class="nav-link active">Post</Link>
        {/* </li> */}

         {/* <li class="nav-item"> */}
        {/* <a class="nav-link active" aria-current="page" href="/src/Components/hooksdemo.js">HooksDemo</a> */}
        <Link to="/delete" class="nav-link active">Delete </Link>
        {/* </li> */}

        {/* <li class="nav-item"> */}
          {/* <a class="nav-link active" aria-current="page" href="/src/Components/hooksdemo.js">HooksDemo</a> */}
          <Link to="/put" class="nav-link active">Put</Link>
        {/* </li> */}
    </ul>
  <Routes>
    <Route path="/get" element={<Get/>}/>
    <Route path="/post" element={<Post/>}/>
    <Route path="/delete" element={<Delete/>}/>
    <Route path="/put" element={<Put/>}/>
  </Routes>
  </Router>
  );
}

export default App;
