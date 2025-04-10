class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        int start = 0;
        int end = n;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i<= n; i++){
            System.out.print(s[i]);
        }
    }
}