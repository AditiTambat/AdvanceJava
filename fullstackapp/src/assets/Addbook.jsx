import { useEffect, useState } from "react";
import axios from "axios";

function Addbook(){

  const [data, setData] = useState([]); 

  useEffect(() => {
    axios
      .get(``)
      .then((res) => {
        console.log(res.data); 
        setData(res.data);
      })
      .catch((e) => {
        console.log(e);
      });
  }, []); 

  

  return (
    <>
     
    </>
  );
}
export {Addbook};