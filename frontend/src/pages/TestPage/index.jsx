import { useNavigate } from "react-router-dom";

const TestPage = () => {
  const navigate = useNavigate();

  return (
    <>
      <h1>This is Test Page!</h1>
      <button onClick={() => navigate("/")}>Go to Home</button>
    </>
  );
};

export default TestPage;
