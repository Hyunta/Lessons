const example = {a:123, b:{c:234, d: 345}}
/**
 * 기존 문법
 */
// const a = example.a;
// const d = example.b.d;

/**
 * 구조분해 할당
 */
const {a, b: {d}} = example;
console.log(a);
console.log(d);

// arr = [1,2,3,4,5]
// const x = arr[0];
// const y = arr[1];
// const z = arr[4];

const [x,,,y,z]= [1,2,3,4,5]

console.log(x,y,z)

const candyMachine = {
    status: {
        name: 'node',
        count: 5
    },
    getCandy: function () {
        this.status.count--;
        return this.status.count;
    }
};

const getCandy = candyMachine.getCandy();
const count = candyMachine.status.count;
console.log(getCandy, count)