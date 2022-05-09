import './styles.css';
import { ReactComponent as Logo } from './logo.svg'
import { Link } from 'react-router-dom';

export default function Navbar(){
    return (
        <nav className="main-navbar">
            <Logo/>
            <Link to="/" className="logo-text">JOTA Delivery</Link>
        </nav>
    )
}