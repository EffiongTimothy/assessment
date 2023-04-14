 function func(){ 
let string = ["2034","1","1000000000","02"]
let newArr =[]
for(i in string){
    newArr.push(string[i].length)}
return newArr
}
console.log(func())