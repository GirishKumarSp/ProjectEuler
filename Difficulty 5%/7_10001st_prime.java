// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class CWH_68_ex5 {
    public static void main(String[] args) {
        int input = 10001; //use scanner to take input from user
        int loop =2; //to run the while loop till the given input number(considering 2 is the 1st prime number)
        int value=1; // to indicate the number of prime numbers obtained
        while (value <= input) { //loops till the desired positioned prime number
            int num = loop; //updated as the number of times it runs
            boolean isPrime = true;
            for (int i = 2; i < num; i++) { //checks all the numbers between 2 to loop if it divided and result is 0 then it is not a prime
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                if(value==input){ //print position prime number entered by the user
                    System.out.println(num + " is the "+input+" position prime number ");
                }
                value++; //incremented once the prime number found
            }
            loop++; //will increment to check all the values till the input number
        }
        // Answer 104743
    }
}
