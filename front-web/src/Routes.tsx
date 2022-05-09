import { BrowserRouter, Routes as Switch, Route } from "react-router-dom";
import Home from "./Home";
import Navbar from "./Navbar";
import Orders from "./Orders";

export default function Routes() {
    return (
        <BrowserRouter>
        <Navbar />
            <Switch>
                <Route path="/" element={<Home />} />
                <Route path="/orders" element={<Orders />} />
            </Switch>
        </BrowserRouter>
    )

}
