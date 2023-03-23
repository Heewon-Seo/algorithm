/*

n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.

첫째 줄에 수열의 크기 n이 주어진다.
다음 줄에는 수열에 포함되는 수가 주어진다.
셋째 줄에는 x가 주어진다.
(1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)

문제의 조건을 만족하는 쌍의 개수를 출력한다.

input
9
5 12 7 10 9 1 2 3 11
13

output
3
 */


//여러줄 입력시(input1, input2)
function solution(input1: number, input2: string[], input3: number) {
    let arr = Array(input1);
    let answer = 0;
    for(let i = 0 ; i < input1 ; i++) {
        arr[i] = Number(input2[i]);
    }

    for(let i = 0 ; i < input1; i++) {
        const temp: number = input3-arr[i];
        if(temp>0 && arr.includes(temp) && temp!==arr[i]) answer++;
    }

    console.log(answer/2);

}

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input: string[] = [];

rl.on("line", function(line: string) {
    input.push(line);
    //rl.close()가 없어서 계속 입력
    //로컬에서 입력을 중지하려면 입력을 한 후 ctrl+d로 입력 종료
}).on("close", function() {
    let list1:number = Number(input[0]);
    let list2:string[]= input[1].split(' ');
    let list3:number = Number(input[2]);
    solution(list1, list2, list3);
    process.exit();
});

