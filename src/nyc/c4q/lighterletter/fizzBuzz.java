package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/10/15.
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print "Fizz" instead of the number
 * and for the multiples of five print "Buzz". For numbers which are
 * multiples of both three and five print "FizzBuzz".
 */
public class fizzBuzz {
    public static void main(String [] args) {



        String buzz =  "buzz";
        String fizz = "fizz"; //initialise the string variables
        for (int i = 0; i <= 100; i++)
        {
            if (i % 5  == 0 && i % 3  == 0 ) { //check if number in position i is divisible by 15, if so don't check other 2 conditions - we don't want a double print {
                System.out.println(fizz + buzz);
            }
            else if (i % 3  == 0 )
            {
                System.out.println(buzz);
            }
            else if (i % 5== 0)
            {
                System.out.println(fizz);

            }
            else System.out.println(i);
        }
    }
}