//使用import语句导入扩展（例：import 'hello.js'）
import '../main.js'

//在此导入扩展或插件

/*export function asy(){
	var req ;
	if (window.XMLHttpRequest){
		req = new XMLHttpRequest();
		req.onreadystatechange = function (){
			if (req.readyState==4 && req.status==200){{
				document.getElementById("info").innerHTML=req.responseText;
			}
		}
		req.open("",true)
	}else{
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
}
*/
export function alert(one){
	alert(one)
	console.log("Info:An extension executed the alert command")
	return 0;
}
export function sole(one){
	console.log(one);
	document.getElementById("console").innerHTML=one;
	return 0;
}
export function type(one){
	var outcome = typeof(one);
	console.log("Info:Detect "+one+" as "+outcome+" type data");
	return 0;
}
export function notice(one){
	document.getElementById("notice").innerHTML=one;
	return 0;
}
export function addition(one , two){
	var outcome;
	outcome = one + two + '';
	return 0;
}
export function subtraction(one ,two){
	var outcome;
	outcome = one - two + '';
	return 0;
}
export function multiplication(one , two){
	var outcome;
	outcome = one * two + '';
	return 0;
}
export function division(one , two){
	var outcome;
	outcome = one / two + '';
	return 0;
}
