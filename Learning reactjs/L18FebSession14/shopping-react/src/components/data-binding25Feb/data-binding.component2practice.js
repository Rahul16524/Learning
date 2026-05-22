
export function DataBinding2() {
    let count = 0;

    function increaseOnClick() {
        count++;
        console.log(count);
    }
    return (
        <div>
            <p >{count}</p>
            <button onClick={increaseOnClick}> Increase</button>

            
        </div>
    )
}