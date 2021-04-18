// 231 Power Of Two

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        long x=(long) n;
        return(x&(-x))==x;
    }
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(3));
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(5));
	}
}
