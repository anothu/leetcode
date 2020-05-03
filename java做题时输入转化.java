//导入 java.util.* 
//导入 util下的所有包
import java.util.*;
class input {
    // 输入格式
    // 6
    // 2 1
    // 3 2
    // 4 3
    // 5 2
    // 6 1
    public void test1() {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine()) - 1;
        int[][] num = new int[count][2];
        for (int i = 0; i < count; i++) {
            String temp = in.nextLine();
            String[] ss = temp.trim().split(" ");
            num[i][0] = Integer.parseInt(ss[0]);
            num[i][1] = Integer.parseInt(ss[1]);
        }
        System.out.println(count);
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                System.out.println(num[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        new input().test1();
    }

}    
/**
* 总结：1.Scanner sc =new Scanner(System.in);
* 2.String s=sc.nextLine();
* 3.String[] ss=s.trim().split(" ");
* //用字符串数组存储分割的字符串
* 4.number[i][j]=Integer.parseInt(ss[0]);
* //强制类型转换 
*/