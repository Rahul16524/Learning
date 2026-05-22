// L24 Feb start Session 15 Data Binding, 
//  only render in index.js

export function DataBindingComponent() {
    // var product = {
    //     Name: "Samsung",
    //     Price: 45200.26,
    //     Stock: true
    // }

    // ==============================
    // using array
    // var categories = ["All ","Electronics", "Skin products" , "Clothes"]

    // =========================
// using array of objects
    // var products = [
    //     { Name: "TV", Price: 45000.44, Stock: true},
    //     { Name: "Mobile", Price: 34000.33, Stock: false},
    //     { Name: "Nike Casuals", Price: 52000.44, Stock: true}
    // ]

// ================================================

    var courses = [
        { Title : "ASP.NET", Poster: "./asp.jpg", Topics: ["Web", "API", "MVC"]},
        { Title : "AWS" , Poster: "./aws.jpg", Topics: ["Cloud", "Services", "Database"]}
    ]
    return (
        <div className="container-fluid">
            {/* simple data */}
            {/* <h2> Product Details </h2>

            <dl>
                <dt>Name</dt>
                <dd> {product.Name} </dd>
                <dd> <input type="text" value={product.Name}/></dd>

                <dt> Price </dt>
                <dd> {product.Price} </dd>

                <dt> Stock </dt>
                <dd> {(product.Stock == true ? "Available" : "Out of Stock")} </dd>
            </dl> */}


{/* Lets try with complex data, Array */}
            {/* <h2> Product Details </h2>
            <ol>
                {
                    categories.map( category => 
                        <li key={category}>{category}</li> 
                    )
                }
            </ol>

            <select>
                {
                    categories.map( category => 
                        <option key={category}>{category}</option>
                    )
                }

            </select>
            
            <ul className="list-unstyled">
                {
                    categories.map( category => 
                        <li key={category}><input type="checkbox"/> 
                          <label> {category} </label></li>
                    )
                }
            </ul>

            <div>
                {
                    categories.map(category => 
                        <div key={category}> 
                            <button className="w-25"> {category} </button>
                        </div>
                        )
                }
            </div> */}

{/* Array of Objects */}

            {/* <h2> Using Array of Objects</h2>

            
                <ul>
                    {
                        products.map( product =>
                            <li key= {product.Name}>{product.Name}</li>
                        )
                    }
                </ul>
            
            <div className="container-fluid">
                <h2> Products Table </h2>
                <table className="table table-hover"> 
                    <thead> 
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Stock</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            products.map( product => 
                                <tr key={product.Name}>
                                    <td>{product.Name}</td>
                                    <td>{product.Price}</td>
                                    <td>{product.Stock == true ? "Available" : "Out of Stock"}</td>
                                    <td className="btn btn-info"> <span className="bi bi-eye-fill"></span></td>
                                    <td className="btn btn-warning ms-2"><span className="bi bi-pen"></span></td>
                                    <td className="btn btn-danger ms-2"><span className="bi bi-trash"></span></td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div> */}

{/* ================================================= */}
            <h2>Card for courses</h2>
            
            {
                courses.map(course => 
                    <img src={course.Poster} width={100} height={100}/>
                    
                )
            }
        </div>
    )
}