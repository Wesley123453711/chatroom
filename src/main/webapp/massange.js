/**
 * 
 */
 function msg(){
	 var inp = document.getElementsByNames("input_textarea")
	 location.href="<%=basePath %>FinalAction?flag=del&id="+str;
}
inp=document.getElementsByNames("input_textarea")
out=document.getElementsByNames("input_textarea")
out.innerHTML+=inp+"<br>",
document.getElementsByNames('button_one').addEventListener('click',msg);