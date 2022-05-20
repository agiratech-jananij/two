function valid(){
    //Name
    n1=document.getElementById("name");
    err1=document.getElementById("txt1");
    exp1=/^[a-z A-Z]{3,20}$/;
    if(n1.value=="")
    {
        err1.innerHTML="Please Enter your Name";
        n1.focus();
    }
    else if(exp1.test(n1.value)==false)
    {
        err1.innerHTML="Enter Only Alphabets";
        n1.focus();
    }
    else
    {
        err1.innerHTML="Corrected value";
    }
    //Email-id
    n2=document.getElementById("email-id");
	err2=document.getElementById("txt2");
	exp2=/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/
	if(n2.value=="")
	{
		err2.innerHTML="Please Enter your Email-ID";
		n2.focus();
	}
	else if(exp2.test(n2.value)==false)
	{
		err2.innerHTML="Enter Special Character";
		n2.focus();
	}
	else
	{
		err2.innerHTML="Correct Email-id";
	}
    //Password
    n3=document.getElementById("pass");
	err3=document.getElementById("txt3");
	exp3=/^[a-z A-Z 0-9]{3,20}$/;
	if(n3.value=="")
	{
		err3.innerHTML="Please Enter your Password";
		n3.focus();
	}
	else if(exp3.test(n3.value)==false)
	{
		err3.innerHTML="Enter Correct Password";
		n3.focus();
	}
	else
	{
		err3.innerHTML="Corrected Password";
	}
	//confirm Password
	n4=document.getElementById("cpass");
	err4=document.getElementById("txt4");
	exp4=/^[a-z A-Z 0-9]{3,20}$/;
	if(n4.value=="")
	{
		err4.innerHTML="Please Enter your Conform Password";
		n4.focus();
	}
	else if(exp4.test(n4.value)==false)
	{
		err4.innerHTML="Enter Correct Conform Password";
		n4.focus();
		
	}
	else
	{
		err4.innerHTML="Corrrected";
		window.location.href="register.html";
	}
	
}
var btn = document.getElementById("btnn");
console.log("True");
btn.addEventListener("click",(e)=>{
	e.preventDefault();
	valid();
	
})