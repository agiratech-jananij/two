const output=document.getElementById("result");
let op='';
let x='';
let y='';
let glen;
let ans;
function num(a){
    if(op=='')
    {
        console.log("fal");
        x+=a;
        display(x);
    }
    else
    {
        console.log("true");
        y+= a;
        display(y);
    }
}
function display(a)
{
    glen=output.value.length;
    if(glen < 10)
    {
        output.value=a;
    }
    else
    {
        alert("You Reached maximum value");
    }
    
}

function operator(b)
{
    if(op!='')
    {
        solve();
        op=b;
    }
    else
    {
        op=b;
        display(op);
        y='';
    }
}
function solve()
{
    switch(op)
    {
        case "+":
            {
                ans=parseInt(x)+parseInt(y);
                display(ans);
                x=ans;
                y=0;
                break;
            }
        case '-':
            {
                ans=parseInt(x)-parseInt(y);
                display(ans);
                x=ans;
                y=0;
                break;
            }
        case '*':
            {
                ans=parseInt(x)*parseInt(y);
                display(ans);
                x=ans;
                y=0;
                break;
            }
        case '/':
            {
                if(x===0 && y===0)
                {
                    output.value="indetermine form";
                    break;
                }
                else{
                    ans=parseInt(x)/parseInt(y);
                    display(ans);
                    x=ans;
                    y=0;
                    break;
                }
                
            }
        default:
            {
                console.log("error");
                break;
            }
    }
}
function clearScreen(){
    output.value = '';
    x='';
    y='';
    op='';
}