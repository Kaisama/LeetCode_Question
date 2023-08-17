class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        int i=1;
       
        String s=countAndSay(n-1);
        StringBuilder sb=new StringBuilder();
        int count=1;
            int num=s.charAt(0)-'0';
        while(i<s.length()){
            
            if(s.charAt(i)-'0'==num){
                count++;
            }
            else{
                sb.append(count).append(num);
                num=s.charAt(i)-'0';
                count=1;
            }
            i++;
        }
        sb.append(count).append(num);
        return sb.toString();
    }
}
