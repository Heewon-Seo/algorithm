function solution(input1: number, input2: number, input3: number) {
    const result: string = (input1*input2*input3).toString();
    const answer: number[] = Array(10).fill(0);
    for(let i = 0 ; i < result.length ; i++) {
        answer[Number(result.charAt(i))]++;
    }
    for(let i = 0 ; i < answer.length ; i++) {
        console.log(answer[i]);
    }
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
    let list2:number= Number(input[1]);
    let list3:number = Number(input[2]);
    solution(list1, list2, list3);
    process.exit();
});