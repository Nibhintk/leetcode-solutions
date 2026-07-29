class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
                maxLength=Math.max(maxLength,count);
            }else if(c==')')
                count--;
            else
                continue;
        }
        return maxLength;
    }
}