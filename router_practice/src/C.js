import React from 'react'
import { Link } from 'react-router-dom'

function C() {
  return (
    <div>
        <nav>
            <Link to ='/'>A</Link>
           
        </nav>
        <nav>
        <Link to ='/b'>B</Link>
        </nav>
        

    </div>
  )
}

export default C