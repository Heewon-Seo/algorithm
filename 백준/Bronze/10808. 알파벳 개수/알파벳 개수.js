const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function(line){
let alphas = new Map();
let answer = [];
for (let i = 97; i < 97 + 27; i++) {
    alphas.set(i, 0);
}

for (let i = 0; i < line.length; i++) {
    alphas.set(line.charCodeAt(i), alphas.get(line.charCodeAt(i)) + 1);
}

for (let i = 97; i < 97+26; i++) {
    answer.push(alphas.get(i));
}

for (let i = 0; i < 26; i++) {
    process.stdout.write(answer[i] + " ");
}
    rl.close(); // 한 줄 입력받고 종료
}).on('close', function(){
    process.exit();
})

