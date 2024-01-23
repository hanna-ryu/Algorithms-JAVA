const fs = require('fs');
const [n, input] = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let totalRCount = 0;
let totalBCount = 0;

let rightRCount = 0;
let leftRCount = 0;
let rightBCount = 0;
let leftBCount = 0;

let answer = n - 1;

//색깔별 공의 전체 개수 구하기
for (let i = 0; i < n; i++) {
  if (input[i] === 'R') totalRCount++;
  else totalBCount++;
}

//빨간색 공을 오른쪽으로 몰기
// 전체 R 개수 - 맨끝 오른쪽 R의 개수
for (let i = n - 1; i >= 0; i--) {
  if (i === 0 && input[i] === 'R') {
    rightRCount++;
    break;
  }
  if (input[i] !== 'R') break;
  if (input[i] === 'R') {
    rightRCount++;
    if (input[i - 1] === 'R') {
      continue;
    } else {
      break;
    }
  }
}

answer = Math.min(answer, totalRCount - rightRCount);

//빨간색 공을 왼쪽으로 몰기
// 전체 R 개수 - 맨 왼쪽 R의 개수

for (let i = 0; i < n; i++) {
  if (i === n - 1 && input[n - 1] === 'R') {
    leftRCount++;
    break;
  }
  if (input[i] !== 'R') break;
  if (input[i] === 'R') {
    leftRCount++;
    if (input[i + 1] === 'R') {
      continue;
    } else {
      break;
    }
  }
}
answer = Math.min(answer, totalRCount - leftRCount);

//파란색 공을 오른쪽으로 몰기
// 전체 B의 개수 - 맨 끝 오른쪽 B의 개수
for (let i = n - 1; i >= 0; i--) {
  if (i === 0 && input[i] === 'B') {
    rightBCount++;
    break;
  }
  if (input[i] !== 'B') break;
  if (input[i] === 'B') {
    rightBCount++;
    if (input[i - 1] === 'B') {
      continue;
    } else {
      break;
    }
  }
}

answer = Math.min(answer, totalBCount - rightBCount);

//파란색 공을 왼쪽으로 몰기
// 전체 B의 개수 - 맨 왼쪽 B의 개수.

for (let i = 0; i < n; i++) {
  if (i === n - 1 && input[n - 1] === 'B') {
    leftBCount++;
    break;
  }
  if (input[i] !== 'B') break;
  if (input[i] === 'B') {
    leftBCount++;
    if (input[i + 1] === 'B') {
      continue;
    } else {
      break;
    }
  }
}
answer = Math.min(answer, totalBCount - leftBCount);

console.log(answer);