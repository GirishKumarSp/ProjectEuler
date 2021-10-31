// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
public class practice_problems {
    public static void main(String[] args) {
        long num = 600851475143L;
        long newNum;
        for(long i=2;i<=num;i++){
            if(num%i==0){
                newNum=i;
                int count=0;
                for(long j=newNum;j>=1;j--){
                    if(newNum%j==0) {
                        count++;
                    }
                }
                if(count==2){
                    System.out.println(newNum); //6857
                }
            }
        }
    }
}
