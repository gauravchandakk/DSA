class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double[] a=new double[6];
        a[0]=df(p1,p2);
        a[1]=df(p2,p3);
        a[2]=df(p3,p4);
        a[3]=df(p4,p1);
        a[4]=df(p1,p3);
        a[5]=df(p2,p4);
        
        Arrays.sort(a);
        

        if(a[0]==a[1] && a[1]==a[2] && a[2]==a[3] && a[4]==a[5] && a[0]!=a[5])
        return true;
        return false;
    }
    public double df(int[] a,int[] b){
        return Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2);
    }
}