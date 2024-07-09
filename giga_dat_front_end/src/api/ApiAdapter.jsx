import axios from 'axios';

const GET = 'get';
const POST = 'post';
const PUT = 'put';
const DELETE = 'delete';
const PATCH = 'patch';

const request = async (url, type, data, params, headers) => {
  const baseUrl = import.meta.env.VITE_API_ENDPOINT;
  const routePath = baseUrl + url;

  // const token = localStorage.getItem('token');
  const token = '2993A070-1E86-4967-8C93-D592602EDD30';
 
  const instance = axios.create(
    token
      ? {
          headers: {
            'Content-type': 'Application/json',
            'Access-Control-Allow-Origin': '*',
            Authorization: `${token}`,
          },
        }
      : {
          headers: {
            'Content-type': 'Application/json',
            'Access-Control-Allow-Origin': '*',
          },
        }
  );

  const options = {
    method: type,
    url: routePath,
    data,
    params,
    headers,
  };

  let result;
  try {
    result = await instance(options);
    return result.data;
  } catch (error) {
    // console.log(error.response.data.message);
    if (error.response) {
      if (error.response.status === 401) {
        localStorage.clear();
        // window.location.href = '/page/demo';
        result = { error };
      } else if (
        error.response.status === 406 &&
        error.response.data.message === 'No message available'
      ) {
        localStorage.clear();
        window.location.href = '/page/demo';
        result = 0;
      } else {
        result = { error };
      }
    }
    return result;
  }
};

export { GET, POST, PUT, PATCH, DELETE, request };
