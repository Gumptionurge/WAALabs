import React,{Component} from 'react'

class Counter extends Component{
    constructor(){
        super()
        this.state={
            count:1
        }
    }
    addMore(){
       this.setState({count: this.state.count+1})
    }

    render(){
        return (<div>
            <p>The Count is : {this.state.count}</p>
            <button on onClick={()=>this.addMore()}>CLICK ME</button>

        </div>)
    }
}

export default Counter