class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
         generateBrackets( result, n, 0, 0,sb);
         return result;

    }
    private void generateBrackets(List<String> result,int n,int open,int close,StringBuilder output ){
        if(output.length()==n*2){
            result.add(output.toString());
            return ;
        }
        if(open<n){
            output.append("(");
            generateBrackets( result, n, open+1, close, output );
            output.deleteCharAt(output.length()-1);
        }
        if(close<open){
             output.append(")");
            generateBrackets( result, n, open, close+1, output );
            output.deleteCharAt(output.length()-1);
        }
    }
    
}
