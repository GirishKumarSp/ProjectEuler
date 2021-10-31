public class SmallestMultiple{
    private static long smallestMultiple(){
        //< base case 1 - 10 == 2520 >
        //< increment by base case and start with values > 10 >
        //< 10 is a factor of 20 >
        boolean found = true;
        long result = 0;
        
        for(long x=2520; found; x++){
            if(x % 11 != 0 || x % 12 != 0 || x % 13 != 0 || x % 14 != 0 ||
                x % 15 != 0 || x % 16 != 0 || x % 17 != 0 || x % 18 != 0 ||
                x % 19 != 0|| x % 20 != 0) continue;
            result = x;
            found = false;
            
        }
        return result;
    }
    public static void main(String... args){
        System.out.println(smallestMultiple());
    }
}
// results:232792560
