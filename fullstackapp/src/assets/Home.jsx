import { useNavigate } from "react-router-dom";
function Home() {
  const navigate = useNavigate();
  return (
    <>
      <h1>HOME PAGE</h1>
      <h2>Choose your choice.</h2>
      <div style={{ margin: "50px" }}>
        <button
          style={{
            padding: "10px 20px",
            border: "none",
            borderRadius: "5px",
            cursor: "pointer",
            marginRight: "45px",
          }}
        >
          Add any book
        </button>

        <button
          style={{
            padding: "10px 20px",
            border: "none",
            borderRadius: "5px",
            cursor: "pointer",
          }}
          onClick={() => navigate("/books")}
        >
          See all books
        </button>
      </div>
    </>
  );
}
export { Home };
