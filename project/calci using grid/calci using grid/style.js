const screen=document.getElementById('result');
let n1;
let n2;
let op;
let ans;
init();
//document.getElementById('result').setAttribute('maxlength',10);
function number(a)
{
   if (!op)
    {
        n1=n1*10+a;
        display(n1);
    }
    else
    {
        n2=n2*10+a;
        display(n2);
    }
    
}
function display(a)
{
    screen.value=a;
}
function operator(b)
{
   
    if (op!="")
    {
        equals();
        op=b;
    }
    else
    {
    op=b;
   
    display(op);
    n2='';
    }
}
function equals()
{
    switch(op)
    {
        case '+':
            {
                ans=n1+n2;
                display(ans);
                n1=ans;
                n2='';
                break;
            }
        case '-':
            {
                ans=n1-n2;
                display(ans);
                n1=ans;
                n2='';
                break;
            }
        case '*':
            {
                ans=n1*n2;
                display(ans);
                n1=ans;
                n2='';
                break;
            }
        case '/':
            {
                if (n1===0 && n2===0)
                {
                    screen.value="indetermine form";
                    break;
                }
                
                else{
                ans=n1/n2;
                display(ans);
                n1=ans;
                n2='';
                break;
                }
            }
        // default:
        //     {
        //         console.log("error");
        //         break;
        //     }
        //n1=ans;
        //n2='';
    }
}
    
function init(){
screen.value =" ";
n1='';
n2='';
op=null;
}
Collapse

