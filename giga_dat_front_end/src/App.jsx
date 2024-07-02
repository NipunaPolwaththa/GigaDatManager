/* eslint-disable import/no-unresolved */
/* eslint-disable import/extensions */
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { ToastContainer } from 'react-toastify';
import './App.css';

function App() {
  return (
    <div className="App select-none">
      <ToastContainer
        position="bottom-right"
        theme="colored"
        autoClose="3000"
      />
      <Router>
        {/* <Route path="/auth" element={<Login />} />
          <Route element={<PrivateRoute />}>
            <Route path="/" element={<Login />} />
          </Route> */}
      </Router>
    </div>
  );
}

export default App;
