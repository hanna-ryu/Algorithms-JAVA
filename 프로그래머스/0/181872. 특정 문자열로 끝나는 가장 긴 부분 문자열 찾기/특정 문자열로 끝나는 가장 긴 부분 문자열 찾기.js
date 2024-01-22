function solution(myString, pat) {
    let answer = '';
    answer = myString.substr(0, myString.lastIndexOf(pat) + pat.length);
    
    
    
    return answer;
}