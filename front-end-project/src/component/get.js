import React,{ useEffect,useState} from "react";
import './CSS/view.css'
import Ga from '../assert/bc2.jpeg';
import axios from "axios";
function Get() {
    const [content, addContent]=useState([]);
    useEffect(()=>{

    axios.get('http://localhost:8080/gro').then(function (response) {
    addContent(response.data);
    });
    })
    return ( 
        <>
        <div style={{backgroundImage: `url(${Ga})`,height:'600pt',width:'1100pt', color:'white', fontSize:'25pt', fontFamily:'fantasy', textAlign:'center'}}>
            <table>
                <tr>
                    <th>productId</th>
                    <th>name</th>
                    <th>unit</th>
                    <th>price</th>
                    <th>life</th>
                    <th>origin</th>
                    <th>description</th>
                </tr>
                {content.map((value)=>(
                    <tr>
                        <td>{value.productId}</td>
                        <td>{value.name}</td>
                        <td>{value.unit}</td>
                        <td>{value.price}</td>
                        <td>{value.life}</td>
                        <td>{value.origin}</td>
                        <td>{value.description}</td>
                    </tr>
                ))}
                    
            </table>
            </div>
        </>
     );
}

export default Get;