import { useEffect, useState } from 'react';

function Home() {
    const [products, setrProducts] = useState([]); // React erikood => 1 - muutuja (html), 2 - funktsioon (htmli uuendamiseks), 3 - algväärtus ()

   // fetch("http://localhost:3000/products").then(response => response.json()).then(body => console.log(body));
   useEffect(() => {fetch("http://localhost:8080/products").then(response => response.json()).then(body => setrProducts(body));},[]); // useEffect --> reacti erikood
    

    return(
        products.map( element => 
            <div>
                <img src={element.imgSrc} alt="" />
                <div>{element.name}</div>
                <div>{element.price}</div>
                <div>{element.id}</div>
                <div>{element.active}</div>
                <div>{element.description}</div>
            </div>
        )
    )
}

export default Home;