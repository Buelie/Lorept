//使用import语句导入插件（例：import 'hello.js'）
import '../main.js'

//在此导入扩展或插件

export function notice(one){
	document.getElementById("notice").innerHTML=one
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
