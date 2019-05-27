package exercises.fizz_buzz;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
    public static void main(String[] args) {

        /*for (int i = 1; i<=100; i++){
            if(i%15 == 0){
                System.out.println("FizzBuzz "+ i);
            }else if(i%3 == 0){
                System.out.println("Fizz "+ i);
            }else if(i%5 == 0){
                System.out.println("Buzz "+ i);
            }
        }*/

        IntStream.iterate(0,x->x+1).limit(101).forEach(x->
        {if(x%15 == 0)
            System.out.println("FizzBuzz "+ x);
        else if(x%3 == 0)
            System.out.println("Fizz "+ x);
        else if(x%5 == 0)
            System.out.println("Buzz "+ x);
        });

        IntStream.rangeClosed(1,100).forEach(FizzBuzz::fizzBuzz);
    }

    private static void fizzBuzz(int number) {
        if(number%15 == 0)
            System.out.println(number + " FizzBuzz");
        else if(number%3 == 0)
            System.out.println(number + " Fizz");
        else if(number%5 == 0)
            System.out.println(number + " Buzz");
    }
}
