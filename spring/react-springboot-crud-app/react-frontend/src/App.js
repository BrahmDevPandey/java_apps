import "./App.css";
import React from "react";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import CreateEmployeeComponent from "./components/CreateEmployeeComponent";

function App() {
  return (
    <div>
      <Router>
        <div>
          <HeaderComponent />
          <div className="container">
            <Routes>
              <Route path="/" element={<ListEmployeeComponent />}></Route>
              <Route path="/employees" element={<HeaderComponent />}></Route>
              <Route
                path="/add-employee"
                element={<CreateEmployeeComponent />}
              ></Route>
            </Routes>
          </div>
          <FooterComponent />
        </div>
      </Router>
    </div>
  );
}

export default App;
