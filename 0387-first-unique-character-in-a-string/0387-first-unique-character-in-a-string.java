class Solution {
    public int firstUniqChar(String s) {
        int array[]=new int[26];
        for(char ch: s.toCharArray()){
            array[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(array[ch-'a']==1)
                return i;
        }
        return -1;
    }
}