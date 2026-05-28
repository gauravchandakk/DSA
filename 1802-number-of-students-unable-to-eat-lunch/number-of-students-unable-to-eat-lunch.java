class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count=students.length;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s= new Stack<>();
        for(int i=0,j=count-1;i<count;i++,j--){
            q.add(students[i]);
            s.push(sandwiches[j]);
        }
        int a=count+1;
        while(!s.empty()&& a>0){
            if(q.peek()==s.peek()){
                q.poll();
                s.pop();
                count--;
                a=count;
            }else{
                q.add(q.poll());
                a--;
            }
        }
        return  count;
    }
}