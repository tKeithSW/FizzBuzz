public class FizzBuzz{
    /*
        If multiple of 3, print fizz
        If multiple of 5, print buzz
        If multiple of 3 && 5, print fizzbuzz
    */
    public static void fizzBuzz(int n){

        for(int i=1; i<=n; i++){
            if (i % 3 == 0 && i % 5 == 0 ) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int x = 100;
        if(args.length == 0){
            System.out.println("No argument entered. using default value of 100");
            fizzBuzz(x);
        }
        else{
            x = Integer.parseInt(args[0]);
            if (x <= 0){
                System.out.println("Please enter a number that is more than 0");
                System.exit(1);
            }
            fizzBuzz(x);
        }
    }
}