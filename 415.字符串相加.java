class Solution {
    public String addStrings(String num1, String num2) {
        int index1 = num1.length()-1;
        int index2 = num2.length()-1;
        int addition=0;
        StringBuilder sb = new StringBuilder();
        while(index1>=0||index2>=0){
            int temp1=0;int temp2=0;
            if(index1>=0){
                temp1=num1.charAt(index1--)-'0';
            }
            if(index2>=0){
                temp2=num2.charAt(index2--)-'0';
            }
            int temp = addition+ +temp1+temp2;
            if(temp>=10){
                addition=1;
                sb.insert(0, temp-10);
            }else{
                addition=0;
                sb.insert(0, temp);
            }
        }
        if(addition==1){
            sb.insert(0, 1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(1231231);
        System.out.println("11111111 :"+new Solution().addStrings("9", "99"));
       
    }
}