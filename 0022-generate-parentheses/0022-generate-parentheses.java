class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        
        backTrack("",0,0,n,ans);
        return ans;

    }
    public static void backTrack(String s,int open,int close,int n,List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            backTrack(s+"(",open+1,close,n,ans);
        }
        if(close<open){
             backTrack(s+")",open,close+1,n,ans);
        }
        
    }
}