import React, { Component } from 'react';
import axios from 'axios';
import Gd from '../assert/bc1.jpeg';
class Put extends Component {
    state = {   "productId":0,
                "name":"",
                "unit":"",
                "price":"",
                "life":"",
                "origin":"",
                "description":""
     } 
    handleSubmit=(e)=>{
        e.preventDefault();
        console.log(this.state);

        axios({
            method: 'put',
            url: 'http://localhost:8080/gro',
            data: this.state, 
            headers: {
            'Content-Type': 'application/json'
            }, 
        })
        // console.log(data);
    }


    render() { 
        return (
            <>
        <div style={{backgroundImage: `url(${Gd})` ,height:'600pt', color:'white', fontSize:'25pt', fontFamily:'fantasy', textAlign:'center'}}>
        <form >
        <div className='row'>
                <label className='mr-3'>productId</label>
                <input type="text" id='productId' placeholder='productId' 
                onChange={(event)=>{this.setState({"productId":parseInt(event.target.value)})}} />

        </div>

        <div className='row'>
                <label className='mr-3'>Name</label>
                <input type="text" id='name' placeholder='ProductName'
                onChange={(event)=>{this.setState({"name":event.target.value})}}/>
        </div>

        <div className='row'>
                <label className='mr-3'>Unit</label>
                <input type="text" id='unit' placeholder='ProductUnit'
                onChange={(event)=>{this.setState({"unit":event.target.value})}}/>
        </div>

        <div className='row'>
                <label className='mr-3'>Price</label>
                <input type="text" id='price' placeholder='ProductPrice'
                onChange={(event)=>{this.setState({"price":event.target.value})}}/>
        </div>

        <div className='row'>
                <label className='mr-3'>Life</label>
                <input type="text" id='life' placeholder='ProductLife'
                onChange={(event)=>{this.setState({"life":event.target.value})}}/>
        </div>

        <div className='row'>
                <label className='mr-3'>Origin</label>
                <input type="text" id='origin' placeholder='ProductOrigin'
                onChange={(event)=>{this.setState({"origin":event.target.value})}}/>
        </div>

        <div className='row'>
                <label className='mr-3'>Description</label>
                <input type="text" id='description' placeholder='ProductDescription'
                onChange={(event)=>{this.setState({"description":event.target.value})}}/>
        </div>

        <div>
        <button onClick={this.handleSubmit} >SUBMIT</button>
        </div>

        </form>
        </div>
            </>
        );
    }
}
 
export default Put;