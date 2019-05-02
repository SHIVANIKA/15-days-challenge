public class FirstClass{
    public static void main(String args []){
        for(double i=8; i>=2 ; i-- ) {
            System.out.println("10,000 at " + i + "% interest =" +String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("********************8");
        for(double i=2; i<9 ; i++ ){
            System.out.println("10,000 at "   + i +"% interest =" +String.format("%.2f", calculateInterest(10000.0,i)));
        }
        System.out.println("************");
        int count = 0;
        for (int i =10; i<100; i++){
            if(isPrime(i)){
                count ++;
                System.out.println("number "+ i + "is a prime number");
                if (count == 15){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }
    public static double calculateInterest(double Amount , double interestrate) {
        return (Amount * (interestrate / 100));
    }
        public static boolean isPrime(int n){
            if(n==1){
                return false;
            }for (int i=2 ; i<=n/2 ; i++){
                if (n % i ==0){
                    return false;
                }

            }
            return true;

        }
    }
OUTPUT:
10,000 at 8.0% interest =800.00
10,000 at 7.0% interest =700.00
10,000 at 6.0% interest =600.00
10,000 at 5.0% interest =500.00
10,000 at 4.0% interest =400.00
10,000 at 3.0% interest =300.00
10,000 at 2.0% interest =200.00
********************8
10,000 at 2.0% interest =200.00
10,000 at 3.0% interest =300.00
10,000 at 4.0% interest =400.00
10,000 at 5.0% interest =500.00
10,000 at 6.0% interest =600.00
10,000 at 7.0% interest =700.00
10,000 at 8.0% interest =800.00
************
number 11is a prime number
number 13is a prime number
number 17is a prime number
number 19is a prime number
number 23is a prime number
number 29is a prime number
number 31is a prime number
number 37is a prime number
number 41is a prime number
number 43is a prime number
number 47is a prime number
number 53is a prime number
number 59is a prime number
number 61is a prime number
number 67is a prime number
Exiting for loop

Process finished with exit code 0

