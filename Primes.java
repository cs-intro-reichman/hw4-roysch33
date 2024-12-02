public class Primes {
    public static void main(String[] args) {

        System.out.println("Prime numbers up to " + args[0] +":");
        int endNum = Integer. parseInt(args[0]);
        int amountOfPrimes = 0;
        int counting = 2;
        // run a loop from 2 till 30, including 30:
        while (counting < endNum+1){
            int newCounting = 2;
            boolean isItPrime = true;
            // make a loop to see if its divided with any other number then itself or 1, if it is turn isItPrime=false:
            while (newCounting < counting){
                if (counting % newCounting == 0){
                    isItPrime = false;
                }
                newCounting ++;
            }
            // if isItPrime=true print the prime:
            if (isItPrime == true){
                System.out.println(counting);
                amountOfPrimes ++;
            }
            counting ++;
        }
        //to get the percent you need to put the amountOfPrimes times 100 and then divided by endNum:
        System.out.println("There are " + amountOfPrimes + " primes between 2 and " + endNum + " (" + (amountOfPrimes*100)/endNum + "% are primes)");
        
    }
}