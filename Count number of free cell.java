class Solution {
    long[] countZero(int N, int K, int[][] arr){
        // code here
        int [][] res=new int[N][N];
        long [] res1=new long[K];
        for(int i=0;i<K;i++){
            int x=arr[i][0];
            int y=arr[i][1];
            for(int k=0;k<N;k++)
            {
                res[x-1][k]=1;
            }
            for(int j=0;j<N;j++)
            {
                res[j][y-1]=1;
            }
            int ans=remZero(N,N,res);
            res1[i]=ans;
        }
        return res1;
    }
    //HashMap <Integer,Integer> hm=new HashMap<>();
    int remZero(int N,int M ,int[][]arr1){
        int anss=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr1[i][j]==0){
                    anss++;
                }
            }
        }
        return anss;
    }
}