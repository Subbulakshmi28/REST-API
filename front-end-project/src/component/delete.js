import React,{ useEffect,useState} from "react";
import './CSS/view.css'
import Gq from '../assert/bc3.jpeg';
import axios from "axios";

function Delete() {

    const [deleteId,addDeleteId]=useState("");
    const handleDelete=()=>{
    axios.delete(`http://localhost:8080/gro/${deleteId}`)
    .then((response)=>console.log(response));
    }
    return ( 
        <>
        <div id="deleteUser" style={{backgroundImage: `url(${Gq})`,height:'600pt',width:'1100pt', color:'white', fontSize:'25pt', fontFamily:'fantasy', textAlign:'center'}}>
            <input  id="delete-input" type="text" placeholder="Enter the ID to delete" 
            style={{width:300,height:40,color:"black",marginTop:'250pt'}} onChange={(event)=>{addDeleteId(event.target.value)}}></input>
            <input id="delete-button" type="button" value="DELETE" style={{width:300,height:40,color:"black"}} onClick={handleDelete}></input>
            <br/><br/><br/>
        </div>
        </> 
    );
}

export default Delete;