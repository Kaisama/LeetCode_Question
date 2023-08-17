class Solution {

    public int[] rowAndMaximumOnes(int[][] mat) {
      Map<Integer,Integer>hash=new HashMap<>();
      int []arr=new int [2];
      for(int i=0;i<mat.length;i++){
          int max=0;
          for(int j=0;j<mat[i].length;j++){
              max+=mat[i][j];
          }
          hash.put(i,max);
      }  
      int val=Integer.MIN_VALUE;
      int index=0;
      for(int i=0;i<hash.size();i++){
          if(val<hash.get(i)){
              val=hash.get(i);
              index=i;
          }
      }
      arr[0]=index;
      arr[1]=val;
      return arr;
    }
}
