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
}
