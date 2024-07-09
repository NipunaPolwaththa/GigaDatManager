import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { ToastContainer } from 'react-toastify';
import './App.css';
import Demo from './page/demo/Demo';

function App() {
  return (
    <div className="App select-none">
      <ToastContainer
        position="bottom-right"
        theme="colored"
        autoClose="3000"
      />
      <Router>
        <Routes>
          <Route path="/" element={<Demo />} />
          <Route path="/page/demo" element={<Demo />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
