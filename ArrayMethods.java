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
    if (i < ary[i].length) {
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
    for (int i = 0; i < ary.length; i = i + 1) {
    ans[i] = columnSum(ary, i);
  }
  return ans;
}

}
