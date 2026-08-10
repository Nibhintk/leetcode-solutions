class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            String a=s.substring(i,s.length());
            String b=s.substring(0,i);
            sb.append(a);
            sb.append(b);
            if(sb.toString().equals(goal)){
                return true;
            }else{
                sb.setLength(0);
            }

        }
        return false;
    }
}