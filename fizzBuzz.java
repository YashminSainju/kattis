import java.util.*;
import java.io.*;
public class fizzBuzz{
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] numbers = br.readLine().split(" ");
        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[1]);
        int end = Integer.parseInt(numbers[2]);
        for(int i = 1; i <= end; i++){
            if(i % x == 0 || i % y == 0){
                if(i % x == 0 && i % y == 0){
                    System.out.println("FizzBuzz");
                }else if(i % x == 0){
                    System.out.println("Fizz");
                }else{
                    System.out.println("Buzz");
                }
            }else{
                System.out.println(i);
            }
        }
    }
}