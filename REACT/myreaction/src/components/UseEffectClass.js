import React, { Component } from 'react'

export class UseEffectClass extends Component {
    constructor(props){
        super(props)
    }
    state={
        count:0,
        name:'John Doe'
    }

    componentDidMount(){
        document.title=`Hello number ${this.state.count}`
    }

    componentDidUpdate(theProps,theState){
      
        //document.title=`Hello number ${this.state.count}`
        //console.log(this.state.count);
         {/*FOR CONDITIONAL STUFF*/}
        if(theState.count !==this.state.count){
            document.title=`Hello number ${this.state.count}`
            console.log(this.state.count);
        }
    }

    render(){
        return (<div>
            <h1>click me bitch</h1>
            <h2><button onClick={()=>{this.setState({count:this.state.count+1})}}>CLICKED {this.state.count}</button></h2>
            {/*FOR CONDITIONAL STUFF*/}
            <input type='text' value={this.state.name} placeholder='TYPE NAME' onChange={(event)=>{this.setState({name:event.target.value})}}>
</input>
        </div>)
    }
}

export default UseEffectClass