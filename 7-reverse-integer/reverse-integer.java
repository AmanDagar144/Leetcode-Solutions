class Solution {
    public int reverse(int x) {
        long rev = 0; long div = 0; long temp = x;
        while (temp!=0){
            div = temp%10;
            rev = rev*10 + div;
            temp /= 10;
        }
        return (rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)?0:(int)rev;
    }
}