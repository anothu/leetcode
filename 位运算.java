class test{
    public int count(int num){
        int count=0;
        while(num!=0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("!");
        System.out.println(new test().count(9));
    }
}