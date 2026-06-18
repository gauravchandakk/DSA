class Solution {
    public List<String> generateParenthesis(int n) {
        return Paranthesis(n,0,0,"");
    }
    public List<String> Paranthesis(int n, int o,int c,String p){
        List<String> list=new ArrayList<>();
        if(n==c){
          list.add(p);  
          return list;    
        }
        
        if(o<n)   
            list.addAll(Paranthesis(n,o+1,c,p+'('));
        if(c<o)   
            list.addAll(Paranthesis(n,o,c+1,p+')'));
        
           
        
        
        return list;
    }
}