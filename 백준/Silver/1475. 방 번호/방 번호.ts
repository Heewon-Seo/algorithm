/*
다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다.
다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오.
(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

예제
input
9999
output
2
 */

function solution(input: string) {
    const answer: number[] = Array(10).fill(0);

    for(let i = 0 ; i < input.length ; i++) {
        answer[Number(input[i])] += 1;
    }

    let maxNum: number = answer[0];
    for(let i = 1 ; i < 10 ; i++) {
        if(i!==6 && i!==9) {
            if(answer[i]>=maxNum) maxNum = answer[i];
        }
    }


    // 6, 9
    // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    // [3, 3, 3, 3, 3, 3, 3, 3, 3]
    // [0, 1, 1, 1, 1, 1, 1, 1, 3]
    // /2를 하면된다

    const temp: number = Math.round((answer[6] + answer[9])/2);

    if(temp > maxNum) {
        maxNum = temp;
    }

    console.log(maxNum);

}

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input: string[] = [];

rl.on("line", function(line: string) {
    input.push(line);
    rl.close();
}).on("close", function() {
    let list = input[0];
    solution(list);
    process.exit();
});