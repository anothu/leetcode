import javax.sound.sampled.SourceDataLine;

public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        if (i < 0)
            return b;
        if (j < 0)
            return a;
        int plus = 0;
        StringBuilder s = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int l,r;
            if(i>=0)
                l=a.charAt(i) - '0';
            else l=0;
            if(j>=0)
                r =b.charAt(j) - '0';
            else r=0;
            int sum = l+r+ plus;
            if(sum==0){
                s.insert(0, '0');
                plus=0;
            }else if(sum==1){
                s.insert(0, '1');
                plus=0;
            }else if(sum==2){
                s.insert(0,'0');
                plus=1;
            }else {
                s.insert(0,'1');
                plus=1;
            }
            i--;
            j--;            
        }
        if(plus==1)
            s.insert(0,'1');
        return s.toString();
    }
    public static void main(String[] args) {
        String a="";
        String b="1010101";
        System.out.println(new Solution().addBinary(a, b));
    }
}