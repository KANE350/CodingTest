function solution(n, k) {
 if (n >= 10) {
       k -= Math.floor(n/10);
    }
    answer = n*12000+k*2000
    return answer;
}