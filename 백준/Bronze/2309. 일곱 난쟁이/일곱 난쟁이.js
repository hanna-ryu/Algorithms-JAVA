const fs = require('fs');
const arrays = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(Number);

// const arrays = [20, 7, 23, 19, 10, 15, 25, 8, 13];

let total = 0;

for (let i = 0; i < 9; i++) {
  total += arrays[i];
}

for (let i = 0; i < 8; i++) {
  let sumOfTwo = 0;
  for (let j = i + 1; j < 9; j++) {
    sumOfTwo = arrays[i] + arrays[j];

    if (total - sumOfTwo === 100) {
      const result = arrays.filter(
        (value, index) => index !== i && index !== j,
      );
      console.log(result.sort((a, b) => a - b).join('\n'));
      return;
    }
  }
}