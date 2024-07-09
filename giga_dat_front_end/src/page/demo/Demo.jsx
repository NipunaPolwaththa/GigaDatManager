/* eslint-disable import/extensions */
import React, { useState, useEffect } from 'react';
import { GET, POST, request } from '../../api/ApiAdapter.jsx';

function Demo() {
  const [demos, setDemos] = useState([]);

  const getAllDemos = async () => {
    const res = await request('demo/all', GET);
    if (!res.error) {
      setDemos(res);
    } else {
      console.log('Demo data loading failed');
    }
  };

  useEffect(() => {
    getAllDemos();
  }, []);

  return <>hello world</>;
}
export default Demo;
