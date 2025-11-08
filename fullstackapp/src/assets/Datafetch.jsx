import { useEffect, useState } from "react";
import axios from "axios";

function Datafetch() {
  let [pagesize,setpagesize]=useState(3);
  let [data, setData] = useState([]);
  let [page,setpage]=useState(0); 

  useEffect(() => {
    axios
    //   .get(`http://localhost:8080/bookcontroller/showbooks`)
    .get(`http://localhost:8080/bookcontroller/getallbooks?pagenumber=${page}&pagesize=${pagesize}&sortre=ratings&order=asc`)
      .then((res) => {
        console.log(res.data.content); 
        setData(res.data.content);
      })
      .catch((e) => {
        console.log(e);
      });
  }, [page,pagesize]); 

  const nextpage = () => {
    console.log("Next Page Clicked");
     setpage(++page);
    console.log(page);
        
  };

  return (
    <>
     <div style={{ padding: "20px" }}>
      <h2> Book List</h2>

      {data.length > 0 ? (
        <table
          border="1"
          cellPadding="10"
          style={{
             borderCollapse: "collapse",
             width: "100%",
             textAlign: "left",
             marginTop: "15px",
             tableLayout: "fixed",
          }}
        >
          <thead style={{ backgroundColor: "#ef1111ff" }}>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Price</th>
              <th>Ratings</th>
            </tr>
          </thead>
          <tbody>
            {data.map((book) => (
              <tr key={book.id}>
                <td>{book.id}</td>
                <td>{book.bName}</td>
                <td>{book.price}</td>
                <td>{book.ratings}</td>
              </tr>
            ))}
          </tbody>
        </table>
      ) : (
        <p>Loading books...</p>
      )}
      </div>
      <button onClick={nextpage}>Next Page</button>
    </>
  );
}

export { Datafetch };


