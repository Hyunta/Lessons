const sayNode = function () {
    console.log('Node');
};
const es = 'ES';
const newObject = {
    sayJs() {
        console.log('JS');
    },
    sayNode,
    [es + 6]: 'Fantastic'
};
newObject.sayNode();
newObject.sayJs();
console.log(newObject.ES6);