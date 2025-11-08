import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Datafetch } from './assets/Datafetch'
import { Home } from './assets/Home'
import { Addbook } from './assets/Addbook'
import { Route } from 'react-router-dom'
import { Routes} from 'react-router-dom'
import { BrowserRouter } from 'react-router-dom'

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/addbook" element={<Addbook />} />
        <Route path="/books" element={<Datafetch />} />
      </Routes>
    </BrowserRouter>

  )
}

export default App
