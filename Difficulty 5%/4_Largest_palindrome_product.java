// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
public class Largest_palindrome_product {
    public static void main(String[] args) {
        int big=0;
        for(int i=0;i<=999;i++){
            for(int j=0;j<=999;j++){
                int n = i*j;
                int r,sum=0,temp;
                temp=n;
                while(n>0){ //check palandrome
                    r=n%10;  //getting remainder
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum){ //check if the checked "n" is same as the main value
                    if(temp>big){
                        big=temp;
                    }
                }
            }
        }
        System.out.println(big); // ans 906609
    }
}
