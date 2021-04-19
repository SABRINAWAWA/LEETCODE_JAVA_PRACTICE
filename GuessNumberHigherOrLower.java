// 374. Guess Number Higher or Lower

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

// Brute Force, time limit!!
public class Solution extends GuessGame {
    public int guessNumber_brute(int n) {
        for (int i=0; i<n; i++){
            if(guess(i)==0){
                return i;
            }
        }
        return n;
    }

// Solution
    public int guessNumber(int n) {
        long start = 0, end = n;
        if(n == 1) {
            return 1;
        }
        while(n>0) {
            long mid = (long)(start + end)/2;
            System.out.println(mid);
            if(guess((int)mid) == 0) {
                return (int)mid;
            }
            else if(guess((int)mid) == 1) {
                start = mid + 1;
            }
            else if(guess((int)mid) == -1) {
                end = mid - 1;
            }
        }
        return 0;
    }
}
