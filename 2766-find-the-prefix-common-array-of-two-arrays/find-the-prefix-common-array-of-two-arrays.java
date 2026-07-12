class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans=new int[A.length];
        HashSet<Integer> set=new HashSet<>();
        return find (A,B,set,0,ans);
    }
    int[] find(int[] A,int[] B,HashSet<Integer> set,int i,int[] ans){
        if(i>=A.length)
        return ans;
        if(i==0 && A[0]==B[0]){
            ans[0]=1;
        }
        else if(i==0){
            set.add(A[0]);
            set.add(B[0]);
        }
        else if(A[i]==B[i]){
            ans[i]=ans[i-1]+1;
        }
        else if(set.contains(A[i]) && set.contains(B[i])){
            set.remove(A[i]);
            set.remove(B[i]);
            ans[i]=ans[i-1]+2;
        }
        else if(set.contains(A[i])){
            set.remove(A[i]);
            set.add(B[i]);
            ans[i]=ans[i-1]+1;
        }
        else if(set.contains(B[i])){
            set.remove(B[i]);
            set.add(A[i]);
            ans[i]=ans[i-1]+1;
        }
        else{
            set.add(A[i]);
            set.add(B[i]);
            ans[i]=ans[i-1];
        }
        return  find(A,B,set,i+1,ans);
    }
}