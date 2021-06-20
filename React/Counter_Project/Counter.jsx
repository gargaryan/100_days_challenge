import React, { useState } from "react";
import "./styles.css";
function Counter() {
  const [data, setData] = useState(0);
  /*
  const upcount=()=>{
    setData(data+1)
  }
  const downcount=()=>{
    setData(data-1)
  }
  */
  return (
    <div className="counter">
      <button onClick={()=>{
        setData(data+1);
      }} className="design">
        +
      </button>
      <input type="text" value={data} id="spacing" />
      <button onClick={()=>{setData(data-1)}} className="design">
        -
      </button>
    </div>
  );
}
export default Counter;
