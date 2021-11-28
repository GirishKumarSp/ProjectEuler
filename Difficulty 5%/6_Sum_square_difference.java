// The sum of the squares of the first ten natural numbers is,
//           1^2 +2^2+....+10^2=385
// The square of the sum of the first ten natural numbers is,
//           (1+2+...+10)^2=55^2=3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
//                3025-385=2640
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.?
public class CWH_68_ex5 {
    public static void main(String[] args) {
        int num=100;
        int i;
        int sum_of_square=0;
        int sqfsum=0;
        //The sum of the squares of the first ten natural numbers is,
        for(i = 0; i<=num; i++){
            sum_of_square+=i*i;
        }
        //System.out.println(sum_of_square);
        //The square of the sum of the first ten natural numbers is,
        for(i = 0; i<=num; i++){
            sqfsum+=i;
        }
        int square_of_sum=sqfsum*sqfsum;
        //System.out.println(square_of_sum);
        //Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
        System.out.printf("the sum of the squares --> %d (-) the square of the sum --> %d = %d",square_of_sum,sum_of_square,square_of_sum-sum_of_square);
    }
}
//Answer 25164150
