/**
 * 6. Z 字形变换利用StringBuilder数组，以及flag确定是加还是减
*/
class Solution {
  public String convert(String s, int numRows) {
    if(s==null||s.length()<=2||numRows==1) return s;
    StringBuilder[] sb = new StringBuilder[numRows];
    for(int i=0;i<sb.length;i++){
      sb[i]=new StringBuilder();
    }
    int flag = 1;
    int index = 1;
    sb[0].append(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      sb[index].append(s.charAt(i));
      if (index == 0 || index == numRows-1) {
        flag = -flag;
      }
      index += flag;
    }
    for(int i=1;i<sb.length;i++){
      sb[0].append(sb[i]);
    }
    return sb[0].toString();
  }
  public static void main(String[] args) {
    System.out.println(new Solution().convert("LEETCODEISHIRING", 3));
  }
}