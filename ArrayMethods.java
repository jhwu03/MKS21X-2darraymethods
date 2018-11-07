public class ArrayMethods{
  public static int rowSum(int[][] ary, int n){
    if (n >= ary.length){
       return 0;
     }
    int ans = 0;
    for (int i = 0; i < ary[n].length; i = i + 1) {
      ans = ans + ary[n][i];
    }
    return ans;
  }
  public static int columnSum(int[][] ary, int n){
    int ans = 0;
    for (int i = 0; i < ary.length; i = i + 1) {
    if (ary[i].length > n) {
      ans = ans + ary[i][n];
    }
  }
  return ans;
}

  public static int[] allRowSums(int[][] ary){
    int[] ans = new int[ary.length];
    for (int i = 0; i < ary.length; i = i + 1) {
      ans[i] = rowSum(ary, i);
    }
    return ans;
  }
  public static int[] allColSums(int[][] ary){
    int max = 0;
    for (int i = 0; i < ary.length; i= i + 1){
      if (ary[i].length > max){
         max = ary[i].length;
    }
  }
    int[] ans = new int[max];
    for (int i = 0; i < max; i = i + 1) {
    ans[i] = columnSum(ary, i);
  }
  return ans;
}
  public static boolean isRowMagic(int[][] ary){
    int[] rowSums = allRowSums(ary);
    boolean same = false;
    for(int i = 0; i < rowSums.length - 1; i = i + 1){
       if(rowSums[i] == rowSums[i+1]){
         same = true;
       }else{
         same = false;
       }
     } return same;
   }
   public static boolean isColumnMagic(int[][] ary){
     int[] colSums = allColSums(ary);
     boolean same = false;
     for(int i = 0; i < colSums.length - 1; i = i + 1){
        if(colSums[i] == colSums[i+1]){
          same = true;
        }else{
          same = false;
        }
      } return same;
    }

}
