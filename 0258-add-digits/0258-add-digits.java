class Solution {
    public int sumofDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public int addDigits(int num) {
        while(num>9){
            num=sumofDigits(num);
        }
        return num;
    }
}