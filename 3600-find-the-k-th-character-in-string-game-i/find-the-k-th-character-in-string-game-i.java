class Solution {
    public char kthCharacter(int k) {
        if(k==1)
        return 'a';
        return rec(k, new StringBuilder("b"), new StringBuilder("a")).charAt(k-1);
    }
    StringBuilder rec(int k,StringBuilder s,StringBuilder word){
        if(word.length()>=k)
        return word;
        word.append(s);
        int a=s.length();
        for(int i=0;i<a;i++){
            s.append((char)(s.charAt(i)+1));
        }
        return rec(k,s,word);
    }
}